package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController {

	@GetMapping("/pinku")
	@ResponseBody
	public String getname()
	{
		String s=null;
		return "hey pinku";
	}
	
	@GetMapping("/value")
	@ResponseBody
	public String getvalue()
	{
		return "hey all values";
	}
	
	@ExceptionHandler(value =Exception.class)
	public ModelAndView getmsg(Exception e)
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("error");
		return mav;
	}
}
