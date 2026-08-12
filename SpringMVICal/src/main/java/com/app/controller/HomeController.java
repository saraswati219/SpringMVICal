package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Cal() {
		return "calculator";
	}
	@RequestMapping("/addition")   
	public String addpage() {     //page
		return "addition";
	}
	@RequestMapping("/add")  
	public String add1(@RequestParam("num1") int num1,@RequestParam("num2") int num2 ,Model m) {       //result
		int res = num1 + num2;
		System.out.println(res);
		m.addAttribute("res", res);
		return "result";
	}
	
	@RequestMapping("/subtraction")
	public String subpage(){
		return "subtraction";
	}
	@RequestMapping("/sub")  
	public String sub(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model m ) {       //result
		int res1 = num1 - num2;
		System.out.println(res1);
		m.addAttribute("res", res1);
		return "result";
	}
	@RequestMapping("/multiplication")
	public String mulpage() {
		return "multiplication";
	}
	@RequestMapping("/mul")  
	public String mul(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model m ) {       //result
		int res2 = num1 * num2;
		System.out.println(res2);
		m.addAttribute("res", res2);
		return "result";
	}
	@RequestMapping("/division")
	public String divpage() {
		return "division";
	}
	@RequestMapping("/div")  
	public String div(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model m ) {       //result
		int res3 = num1 / num2;
		System.out.println(res3);
		m.addAttribute("res", res3);
		return "result";
	}
	@RequestMapping("/res")
	public String res() {
		return "result";
	}

}
