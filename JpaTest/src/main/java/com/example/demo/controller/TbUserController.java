package com.example.demo.controller;

import com.example.demo.entity.TbUser;
import com.example.demo.service.TbUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class TbUserController {
    @Autowired
    private TbUserServices tbUserServices;

    @ResponseBody
    @RequestMapping("/list")
    public List<TbUser> userslist() {
        return tbUserServices.findAll();
    }

    @RequestMapping("/toAdd")
    public String toADD() {
        return "/users/useradd";
    }

    @PostMapping("/add")
    public String add(TbUser tbUser) {
        tbUserServices.save(tbUser);
        return "redirect:/user/userlistss";
    }

    @RequestMapping("/toUpdate")
    //public String toupdate(Model model,@RequestParam("id") int id){
    public String toUpdate(Model model, Integer id) {
        TbUser tbUser = tbUserServices.findById(id);
        model.addAttribute("tUser", tbUser);
        return "users/userupdate";
    }

    @RequestMapping("/update")

    // public String fupdate(TbUser tbUser){

    //   tbUserServices.update(tbUser);
    public String fupdate(String username, String password, Integer id) {
        tbUserServices.updateBUser(username, password, id);
        return "redirect:/user/userlistss";

    }

    @RequestMapping("/update1")
    public  String todupdate(TbUser tbUser){
        tbUserServices.save(tbUser);
        return "redirect:/user/userlistss";
    }

    @RequestMapping("/userlistss")
    public String userlist(Model model) {
        List<TbUser> users = tbUserServices.findAll();
        model.addAttribute("userlists", users);
        return "users/userlist";
    }

    @RequestMapping("/{id}")
    public TbUser findbugz(@PathVariable("id") int id) {
        return tbUserServices.findById(id);
    }


    @RequestMapping("/save")
    public void saveUser(TbUser TbUser) {
        tbUserServices.save(TbUser);
    }

    @RequestMapping("/delete")
    public String deleteUser(int id) {

        tbUserServices.delete(id);
        return "redirect:/user/userlistss";
    }

    @RequestMapping("/finds/{usern}/{passw}")
    public List<TbUser> findbynameandpass(@PathVariable("usern") String username, @PathVariable("passw") String password) {
        //return tbUserServices.findbynameandp(username, password);
        return tbUserServices.findByUsernameAndPassword(username, password);
    }

    @RequestMapping("/find/{userna}")
    public List<TbUser> findbynameLike(@PathVariable("userna") String username) {
        //return tbUserServices.findbynameandp(username, password);
        //return tbUserServices.findByUsernameLike(username);
        return tbUserServices.findByUsername(username);
    }

    //@RequestMapping("/page/{spage}")
    // public Page<TbUser> getpppage(@PathVariable("spage") Pageable spage){
    //   return tbUserServices.findAll((org.springframework.data.domain.Pageable) spage);
    // }
    @RequestMapping("/pp/{pss}/{pses}")
    public Page<TbUser> gettpasg(@PathVariable("pss") int pas, @PathVariable("pses") int pses) {
        //Sort sort=new Sort(Sort.Direction.DESC,id);
        //PageRequest.of(pas,pses);
        //Sort.by(Sort.Direction.DESC,"datetime");
        // Sort sort=new Sort(Sort.Direction.DESC,"id");
        PageRequest pagerequest = PageRequest.of(pas, pses);
        Page<TbUser> userPage = tbUserServices.findAll(pagerequest);
        for (int i = 0; i < userPage.getContent().size(); i++) {
            System.out.println(userPage.getContent().get(i));
            System.out.println(userPage.getTotalElements());
        }
        return userPage;
    }
}
