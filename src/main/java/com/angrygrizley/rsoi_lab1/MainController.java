package com.angrygrizley.rsoi_lab1;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {

    @RequestMapping( value = "/reverse", method = RequestMethod.GET)
    public String reverseStringPage(@RequestParam(value = "string", required = false, defaultValue = "привет") String string, ModelMap model) {
        String reversed = StringWorker.getReverseString(string);

        model.addAttribute("string", reversed);
        return "reverse";
    }

}
