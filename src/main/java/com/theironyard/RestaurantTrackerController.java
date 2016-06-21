package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by hoseasandstrom on 6/21/16.
 */
@Controller
public class RestaurantTrackerController {

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public String home(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "login";
        } else {

            return "home";
        }
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session) {


        return "redirect:/";
    }
}
