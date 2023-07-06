/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.dkingenius.springbootbasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DKsInGenius <dksingenius@gmail.com>
 */
@RestController
public class RootController {
    
    @GetMapping("/")
    String contextPath(){
        return "SpringBootBasics Application is Running";
    }

}
