package com.example.th.Controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.th.Dto.*;


@Controller
public class HomeController {

@RequestMapping(value="/")
public String main(Model model) {
	return "index";
}


@RequestMapping(value="/text")
public String text(HttpServletRequest request, Model model) {
	
	Dto member = new Dto("장상현",27,"개발자");
	model.addAttribute("member" , member);
	model.addAttribute("hello" , "hello");
	
	return "text";
	
	}

@RequestMapping(value="/form")
public String form(HttpServletRequest request, Model model) {
	
	HttpSession session = request.getSession();
	
	model.addAttribute("subject", request.getParameter("subject"));
	model.addAttribute("score", request.getParameter("score"));

	return "form";
}

@RequestMapping(value="/back")
public String back() {
	
	return "redirect:text";
	
}

@RequestMapping(value="/date")
public String date(Model model) {
	model.addAttribute("localDateTime", LocalDateTime.now());
	return "date";
}

@RequestMapping(value="/property")
public String property() {
	return "property";
}

}
