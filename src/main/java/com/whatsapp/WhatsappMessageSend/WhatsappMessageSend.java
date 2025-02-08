package com.whatsapp.WhatsappMessageSend;

import java.io.IOException;
import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;


@Controller
public class WhatsappMessageSend {

	Integer cp; 
	Integer id;
	String img="";

	@GetMapping("/")
	public String dashboard(Model m, Principal principal) {
	     return "index";
	}
	
	@PostMapping("/sendMessage")
	public String sendMessage(Model m, @RequestParam("mobileNo") String mobileNo,
			HttpServletResponse res) throws IOException {
		System.out.println("inside sendMessage--------"+mobileNo);
	    res.sendRedirect("https://wa.me/"+ mobileNo);
		return "index";
	}
}
