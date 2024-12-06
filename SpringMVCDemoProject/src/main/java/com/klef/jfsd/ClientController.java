package com.klef.jfsd;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController
{
	public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }
    @GetMapping("/demo1")
    public ModelAndView demo1() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin");
        return mav;
    }
    @GetMapping("/demo2")
    public ModelAndView demo2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user");
        mav.addObject("name", "klu");
        return mav;
    }
    @GetMapping("/demo3")
    public ModelAndView demo3() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("about");
        mav.addObject("msg", "Hello World");
        return mav;
    }
    @GetMapping("/demo4")
    @ResponseBody
    public String demo4() {
        return "JFSD";
    }
    @GetMapping("/demo5")
    @ResponseBody
    public String demo5(@RequestParam("a") int a, @RequestParam("b") int b) {
        int sum = a + b;
        return String.valueOf(sum);
    }

    @GetMapping("/demo6/{fname}/{lname}")
    public ModelAndView demo6(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("demo");
        String fullName = fname + " " + lname;
        mav.addObject("name", fullName);
        return mav;
    }
}