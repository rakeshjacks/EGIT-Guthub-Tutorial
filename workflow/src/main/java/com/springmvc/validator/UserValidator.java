package com.springmvc.validator;

import org.springframework.validation.Errors;

import org.springframework.validation.Validator;
import com.springmvc.model.User;

public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method emplb
		return User.class.equals(arg0);
	}

	@Override
	public void validate(Object user, Errors errors) {
		User user1 = (User)user;
		
			
			if(user1.getFirstname()==null || user1.getFirstname().length() == 0)
			{
				 errors.rejectValue("fname", "error.fname.required", new Object[0], "User First Name required.");
			}
			
			if(user1.getLastname()==null || user1.getLastname().length() == 0)
			{
				 errors.rejectValue("lname", "error.lname.required", new Object[0], "User Last Name required.");
			}
	       
	        if (user1.getEmail() == null || user1.getEmail().length() == 0) 
	        {
	            errors.rejectValue("email", "error.email.required", new Object[0], "User Email required.");
	        }
	        else if (!user1.getEmail().contains("@") || !user1.getEmail().endsWith(".com")) 
	        {
	            errors.rejectValue("email", "error.email.invalid", new Object[0], "User Email Invalid.");
	        }
	        if (user1.getPhone() == null || user1.getPhone().length() == 0) 
	        {
	            errors.rejectValue("phone", "error.phone.required", new Object[0], "User Phone required.");
	        } 
	        else if (user1.getPhone().length() != 10)
	        {
	            errors.rejectValue("phone", "error.phone.invalid", new Object[0], "User Phone must be 10 digit.");
	        } 
	        else if (user1.getPhone().length() == 10) 
	        {
	            try {
	                Integer.parseInt(user1.getPhone());
	            }
	            catch (Exception e) {
	                errors.rejectValue("phone", "error.phone.invalid", new Object[0], "Phone must be digit.");
	            }
	        }
//	        if (user1.getTimings()==null || user1.getTimings().length() < 1)
//	        {
//	            errors.rejectValue("timings", "error.timings.required", new Object[0], "employee Timings required.");
//	        }
	        if (user1.getSex() == null || user1.getSex().length() == 0) 
	        {
	            errors.rejectValue("gender", "error.gender.required", new Object[0], " Select Gender .");
	        }
	        if (user1.getState() == null || user1.getState().length() == 0 || user1.getState().equals("---select One Option--")) 
	        {
	            errors.rejectValue("state", "error.state.required", new Object[0], " Select State .");
	        }
	        
	        if(user1.getPassword() == null || user1.getPassword().length() == 0)
	        {
	        	errors.rejectValue("password","errors.password.required",new Object[0],"Password Required");
	        }
	    }
	}