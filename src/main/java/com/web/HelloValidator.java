package com.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by vashishta on 10/12/16.
 */
@Component
public class HelloValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.isAssignableFrom(HelloForm.class);
    }

    @Override
    public void validate(Object o, Errors errors) {

        HelloForm helloForm = (HelloForm) o;

        if (helloForm.getPerson().getDateOfBirth() == null) {
            errors.rejectValue("person.dateOfBirth", "invalid", "Invalid date of birth");
        }

    }
}
