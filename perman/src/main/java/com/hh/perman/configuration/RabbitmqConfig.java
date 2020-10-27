package com.hh.perman.configuration;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {
    @Bean
    public Queue queue() {
        return new Queue("Queue2");
    }

    @Bean
    public Queue objectque() {
        return new Queue("object");
    }

    @Bean
    public Queue queueMessage() {
        return new Queue("topic.a");
    }

    @Bean
    public Queue queueMessages() {
        return new Queue("topic.b");
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    Binding bindingExchange(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.a");
    }

    @Bean
    Binding bindingExchanges(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.b");
    }
}
