package com.bankapplication.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bankapplication.entity.Employee;
import com.bankapplication.service.EmpService;

/**
 * Implementation of controller class for employee
 * 
 * @author Hritik shinde date 11/11/21
 */
@Controller
public class EmpController {
	@Autowired
	private EmpService service;

	@GetMapping("/")
	public String home(Model m) // model usse for adding attributes
	{

		List<Employee> emp = service.getAllEmp();
		m.addAttribute("emp", emp);
		return "index";
	}

	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_emp";
	}

	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e, HttpSession session) {
		System.out.println(e);
		service.addEmp(e);
		session.setAttribute("msg", "Employee Added sucessfully");
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {

		Employee e = service.getEmpById(id);
		m.addAttribute("emp", e);
		return "edit";
	}

	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e, HttpSession session) {
		service.addEmp(e);
		session.setAttribute("msg", "Data Edited Sucessfully");
		return "redirect:/";

	}

	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id, HttpSession session) {
		service.deleteEmp(id);
		session.setAttribute("msg", "Data Deleted Sucessfully");
		return "redirect:/";
	}
	/*
	 * @GetMapping("/{id}")
	 * GetMapping public String viewEmpPerformance(@PathVariable int id,HttpSession
	 * session) { List<Employee> emp=service.getAllEmp(); m.addAttribute("emp",emp);
	 * return "viewEmp"; }
	 */

}
