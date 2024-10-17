package com.SpringDev.innerDiary.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check
{
    @GetMapping("/check")
    public String check()
    {
        return "Running just fine";
    }
}
