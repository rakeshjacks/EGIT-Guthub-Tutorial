package com.springmvc.controller;
import java.util.List;



  
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.bind.annotation.SessionAttributes;
import com.springmvc.validator.UserValidator;
import com.springmvc.constants.URLMappingConstants; 
import com.springmvc.model.User;  
import com.springmvc.business.UserService;
	  
@Controller
@SessionAttributes
public class UserController extends URLMappingConstants { 
		
private static final Logger logger = Logger.getLogger(UserController.class);
    
    public UserController() {
        System.out.println("EmployeeController()");
    }

    @Autowired
    private UserService employeeService;
    
    
   /* @RequestMapping("editEmployee")
    public ModelAndView editEmployee(@RequestParam long id, @ModelAttribute Employee employee) {
        logger.info("Updating the Employee for the Id "+id);
        employee = employeeService.getEmployee(id);
        return new ModelAndView("employeeForm", "employeeObject", employee);
    }*/
    
    @RequestMapping("REGISTERUSER")
    public ModelAndView saveEmployee(@ModelAttribute User employee) {
        logger.info("Saving the Employee. Data : "+employee);
        if(employee.getId() == 0){ // if employee id is 0 then creating the employee other updating the employee
            //employeeService.createEmployee(employee);
        } else {
            //employeeService.updateEmployee(employee);
        }
        return new ModelAndView("redirect:getAllEmployees");
    }
    
    /*@RequestMapping("deleteEmployee")
    public ModelAndView deleteEmployee(@RequestParam long id) {
        logger.info("Deleting the Employee. Id : "+id);
        employeeService.deleteEmployee(id);
        return new ModelAndView("redirect:getAllEmployees");
    }
    
    @RequestMapping(value = {"getAllEmployees", "/"})
    public ModelAndView getAllEmployees() {
        logger.info("Getting the all Employees.");
        List<Employee> employeeList = employeeService.getAllEmployees();
        return new ModelAndView("employeeList", "employeeList", employeeList);
    }
    
    @RequestMapping("searchEmployee")
    public ModelAndView searchEmployee(@RequestParam("searchName") String searchName) {  
        logger.info("Searching the Employee. Employee Names: "+searchName);
        List<Employee> employeeList = employeeService.getAllEmployees(searchName);
        return new ModelAndView("employeeList", "employeeList", employeeList);      
    }*/
		
		@RequestMapping(value=REGISTERFORM)  
		public ModelAndView registerForm(HttpServletRequest request,
				HttpServletResponse response, HttpSession httpSession,
				User user, BindingResult bindingResult, Map model)
		{  
           //log = Logger.getLogger(this.getClass());
		   //log.info("Registration page open");
			model.put("user",new User());
			//log.info("for the registration page employee object created ");
		  return new ModelAndView(REGISTERDEF);  
		 } 
	 
	}
