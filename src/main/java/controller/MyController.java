package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping(value="login")
	public String login() {
		System.out.println("login....");
		return "suc";
	}
}
