package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 10/5/16.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value="show", method = RequestMethod.GET)
    public String show() {

        return "goodbye";
    }

}
