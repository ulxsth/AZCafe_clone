package com.ulxsth.azcafe_clone.securingweb;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

public class MvcConfig {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("/login");
    }
}
