package com.example.th.Controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.th.Dto.*;


@Controller
public class HomeController {

@RequestMapping(value="/")
public String main(Model model) {
	return "index";
}


@RequestMapping(value="/text")
public String text(HttpServletRequest request, Model model) {
	
	Dto member = new Dto("장상현",27,"개발자...?");
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

@RequestMapping(value="/home")
public String table() {
	return "home";
}

@RequestMapping(value="/loginOk")
public String loginOk(HttpServletRequest request, Model model) {
	HttpSession session = request.getSession();	
	
	return "board";
}

@RequestMapping(value="/join")
public String join() {
	return "join";
}

@RequestMapping(value="/joinOk")
public String joinOk(HttpServletRequest request, Model model) {
	
	HttpSession session = request.getSession();	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	memberDto dto = new memberDto(id, pw, name, phone);
	session.setAttribute("id", id);
	
	
	return "board";
}



@RequestMapping(value="/info")
public String info() {
	return "info";
}

@RequestMapping(value="/board")
public String board() {
	
	
	
	return "board";
}

@RequestMapping(value="/openLayers")
public String openLayers() {
	return "openLayers";
}


@GetMapping("request")
public String request(@RequestParam("a") String a, @RequestParam("b") String b) {
	return a + "" + b;
}

}
