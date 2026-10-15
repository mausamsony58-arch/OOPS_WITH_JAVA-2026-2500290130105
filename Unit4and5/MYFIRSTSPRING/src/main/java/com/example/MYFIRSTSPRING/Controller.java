package com.example.MYFIRSTSPRING;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Controller")
public class Controller {

@GetMapping("/{SID}")
public String getUser(@PathVariable int SID) {
    return "User" + SID;
}

}

