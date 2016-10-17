package com.gq.handlers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gq.beans.Student;
import com.gq.service.IStudentService;

@Controller
@RequestMapping("/test")
public class MyController {
	@Resource(name="studentService")
	private IStudentService service;
	
	public void setService(IStudentService service) {
		this.service = service;
	}

	@RequestMapping("/register.do")
	public String doRegister(Student student){
		
		service.addStudent(student);
		
		return "/welcome.jsp";
	}

}
