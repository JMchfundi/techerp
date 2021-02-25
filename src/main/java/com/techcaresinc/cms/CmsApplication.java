package com.techcaresinc.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class CmsApplication extends SpringBootServletInitializer {

    @RequestMapping(value = "/")
    public String root (){
        return "index";
    }

    @RequestMapping(value = "/financials")
    public String financials(){
        return "financials";
    }
    @RequestMapping(value = "/form_component")
    public String form_component(){
        return "form_component";
    }

    @RequestMapping(value = "/form_validation")
    public String form_validation(){
        return "form_validation";
    }

    @RequestMapping(value = "/general")
    public String general(){
        return "general";
    }

    @RequestMapping(value = "/buttons")
    public String buttons(){
        return "buttons";
    }

    @RequestMapping(value = "/grids")
    public String grids(){
        return "grids";
    }

    @RequestMapping(value = "/profile")
    public String profile(){
        return "profile";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/widgets")
    public String widgets(){
        return "widgets";
    }

    @RequestMapping(value = "/chart-chartjs")
    public String chart_chartjs(){
        return "chart-chartjs";
    }

    @RequestMapping(value = "/basic_table")
    public String basic_table(){
        return "basic_table";
    }

    @RequestMapping(value = "/contact")
    public String contact(){
        return "contact";
    }

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CmsApplication.class);
    }

}
