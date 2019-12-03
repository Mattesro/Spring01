package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

    @RequestMapping("/")
    @ResponseBody
    public String Hauptseite() {
        return "<h1>Greetings from Rolf!</h1>"
        +"<ul>"
        +"<li><a href=d/1>William Hartnell<a></l>"
        +"<li><a href=d/2>David Tennant<a></l>"
        +"<li><a href=d/3>Jodie Whittaker<a></l>"
        +"<li><a href=d/4>SonstNochWer<a></l>"
        ;
    }

	@RequestMapping("/d/1")
    @ResponseBody
    public String William() {
        return "Greetings from William Hartnell!"
        +"<ul>"
        +"<li><a href=/>Zurück<a></l>"
        ;
    }    

    @RequestMapping("/d/2")
    @ResponseBody
    public String David() {
        return "Greetings from David Tennant!"
        +"<ul>"
        +"<li><a href=/>Zurück<a></l>"
        ;
    }    

    @RequestMapping("/d/3")
    @ResponseBody
    public String Jodie() {
        return "Greetings from Jodie Whittaker!"
        +"<ul>"
        +"<li><a href=/>Zurück<a></l>"
        ;
    }

    @RequestMapping("/d/4")
    @ResponseBody
    public String SonstNochWer() {
        return "Greetings from SonstNochWer!"
        +"<ul>"
        +"<li><a href=/>Zurück<a></l>"
        ;
    }
}
