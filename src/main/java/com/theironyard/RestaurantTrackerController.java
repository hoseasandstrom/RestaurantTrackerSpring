package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hoseasandstrom on 6/21/16.
 */
@Controller
public class RestaurantTrackerController {

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public String home() {
        return "home";
    }
}
