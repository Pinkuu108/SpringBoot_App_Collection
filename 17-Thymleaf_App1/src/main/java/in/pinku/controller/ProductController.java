package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.pinku.binding.Product;
import jakarta.validation.Valid;
//method to diplay form
@Controller
public class ProductController {

    
	
	
	@GetMapping("/pudt")
	public String getproduct(Model model)
	{
		model.addAttribute("product", new Product());
		return "index";
	}
	
	
	//method to handel form
	@PostMapping("/pudt")
	public String handelform(@Valid  Product p,BindingResult result, Model model)
	{
		System.out.println(p);
		if(result.hasErrors())
		{
			return "index";
		}
		else
		{
			model.addAttribute("msg", "Product Saved");
		}
		
		return "index";
	}

}


