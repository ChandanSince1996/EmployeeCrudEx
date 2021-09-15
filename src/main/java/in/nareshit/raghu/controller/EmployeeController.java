package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;//HAS-A
	
	/**
	 * If End user enters /register in addressbar
	 * this method is called and loads
	 * EmployeeRegister.html page from /template folder
	 */
	
	@GetMapping("/register")
	public String showRegister() {
		return "EmployeeRegister";
	}
	
	/**
	 * on Form Submit, Read data as Object using @ModelAttribute
	 * call service layer with object, read ID back
	 * create message as String 
	 * use Model memory, send message to UI
	 * Return back to EmployeeRegister.html
	 */
	
	@GetMapping("/view")
	public String showView() {
		return "Data";
	}
	

}
