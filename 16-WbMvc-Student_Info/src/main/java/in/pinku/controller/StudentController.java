package in.pinku.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.pinku.binding.Student;
import in.pinku.entity.StudentEntity;
import in.pinku.reposatory.StudentReposatory;

@Controller
public class StudentController {
	
	@Autowired
	private StudentReposatory repo;

	
	//method to load Student
	@GetMapping("/")
	public String loadform(Model model)
	{
		loadFromData(model);
		
		
		
		return "index";
	}

	private void loadFromData(Model model) {
		List<String> courseentity=new ArrayList<String>();
		courseentity.add("JAVA");
		courseentity.add("SPRINGBOOT");
		courseentity.add("PYTHON");
		courseentity.add("GO-Lang");
		courseentity.add("DSA");
		
		List<String> timingsentity=new ArrayList<String>();
		timingsentity.add("Morning");
		timingsentity.add("AfterNoon");
		timingsentity.add("Evening");
		
		
		Student student=new Student();
		
		model.addAttribute("course", courseentity);
		model.addAttribute("timings", timingsentity);
		model.addAttribute("student", student);
	}
	
	//Method to Save Student from Data
	        @PostMapping("/save")
			public String handelsubmit(Student s,Model model)
			{
	        	System.out.println(s);
	        	
	        	//logic to save 
	        	StudentEntity entity=new StudentEntity();
	        	//copy data from binding obj to entity obj
	        	BeanUtils.copyProperties(s, entity);
	        	entity.setTimings(Arrays.toString(s.getTimings()));
	        	
	        	repo.save(entity);
	        	
	        	loadFromData(model);
	    		
				model.addAttribute("msg", "Student Detail Save..");
				
				return "index";
			}
	        
	        //method to display saved data
	        @GetMapping("/viewStudents")
	        public String getstudentdata(Model model)
	        {
	        	List<StudentEntity> students = repo.findAll();
	        	model.addAttribute("student", students);
	        	return "data";
	        }
	        

}
