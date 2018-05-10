package com.acc;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmpValidator implements Validator{

	@Override
	public boolean supports(Class<?> obj) {
		
		return Student.class.equals(obj);
	}

	@Override
	public void validate(Object stu, Errors errors) {
		
		Student student = (Student) stu;
		if(student.getId()==""||student.getId().equals("0")) {
			errors.rejectValue("id","id.required","enter id ok");
		}
		
		ValidationUtils.rejectIfEmpty(errors,"name","name.required","Enter name");
	}
	

}
