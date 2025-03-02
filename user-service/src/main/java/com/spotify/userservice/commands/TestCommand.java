package com.spotify.userservice.commands;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spotify.userservice.utils.Utils;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class TestCommand implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;
    
    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0 && args[0].equals("run-task")) {
            System.out.println(Utils.uniqueId());
            SpringApplication.exit(context, () -> 0);
        }
    }
}