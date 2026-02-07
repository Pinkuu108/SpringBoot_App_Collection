package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class jetteyController {
	@GetMapping("/ppp")
	@ResponseBody
	public String getwel()
	{
		return"hey welcome";
	}

}
