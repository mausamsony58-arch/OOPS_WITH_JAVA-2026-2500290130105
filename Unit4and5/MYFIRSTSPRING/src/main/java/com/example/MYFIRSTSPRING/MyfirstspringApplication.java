package com.example.MYFIRSTSPRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstspringApplication implements CommandLineRunner{
	@Autowired 
	HelloWorld hw;
	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(hw.display());
    }

	
}