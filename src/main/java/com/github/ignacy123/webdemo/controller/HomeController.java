package com.github.ignacy123.webdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ignacy on 07.04.16.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(@RequestParam(required = false) String name,
                       @RequestParam(required = false) String operation,
                       @RequestParam(required = false) Double numberOne,
                       @RequestParam(required = false) Double numberTwo,
                       Model model) {
        Double numberOut;
            model.addAttribute("name", name);
        model.addAttribute("numberTwo", numberTwo);
        model.addAttribute("operation", operation);
        model.addAttribute("numberOne", numberOne);
        if (numberOne != null && numberTwo != null) {
            switch (operation) {
                case "/":
                    numberOut = numberOne / numberTwo;
                    break;
                case "+":
                    numberOut = numberOne + numberTwo;
                    break;
                case "-":
                    numberOut = numberOne - numberTwo;
                    break;
                case "*":
                    numberOut = numberOne * numberTwo;
                    break;
                default:
                    numberOut = .0;
            }
            model.addAttribute("numberOut", numberOut);
        }
        return "home";

    }
}
