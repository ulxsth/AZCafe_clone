package com.ulxsth.azcafe_clone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardCotroller {
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "/dashboard";
    }
}
