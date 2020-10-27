package com.example.demo.repository;

import com.example.demo.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TbUserRepository extends JpaRepository<TbUser, Integer> {
    //TbUser findById(Long id);
    //TbUser findByUsername(String username);
    //List<TbUser> findAll();
    //TbUser save(TbUser tbUser);
    //void deleteById(Long id);
    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update TbUser  u set u.username=:username ,u.password=:password where u.id=:id")
    void updatewithUser(String username,String password,Integer id);
    //@Override
    //@Query("select s from TbUser  s where s.username = ?1 and s.password= ?2")
    //List<TbUser> findByUsernameAndPassword(String username,String password);
    List<TbUser> findByUsernameLike(String username);

    List<TbUser> findByUsernameAndPassword(String username, String password);

    List<TbUser> findByUsername(String username);

    @Query(value = "select * from tbl_user u where u.id=:id", nativeQuery = true)
    TbUser findById(@Param("id") int id);

    List<TbUser> findByPassword(String password);


    //Page<TbUser> findAll(Pageable pageable);
}
