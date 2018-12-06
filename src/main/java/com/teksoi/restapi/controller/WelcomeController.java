package com.teksoi.restapi.controller;

import com.teksoi.restapi.beans.Welcome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	private static final String welcomemsg = "Welcome Mr. %s!";

    @GetMapping("/welcome/user")
    @ResponseBody
    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Zayed") String name) {
        return new Welcome(String.format(welcomemsg, name));
    }

}
