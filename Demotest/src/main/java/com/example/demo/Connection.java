package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Demo")

public class Connection {
	@Autowired
	private Userrepository userrepo;
	@PostMapping(path="/add") 
	  public  String addNewUser (@RequestParam String name,
	      @RequestParam String email) {
Springtest st=new Springtest();
	    	  				st.setName(name);
	    	  				st.setEmail(email);
	    	  				userrepo.save(st);
	    	  					return "saved";
	    	  					
	    	  				
	    	  			} 
	    	  				@GetMapping(path="/show")
	    	  					public Iterable<Springtest> display()
	    	  					{
	    	  						return userrepo.findAll();

	    	  					} 
	    	  				 
	    	  			
	    	  					public Springtest change(@PathVariable Integer id,@RequestBody Springtest task)
	    	  						{
	    	  							 Springtest taskr =userrepo.getOne(id);
	    	  							 
	    	  							   taskr.setName(task.getName());
	    	  						       taskr.setEmail(task.getEmail());
	    	  							   return userrepo.save(taskr);
	    	  						}
	    	  						@DeleteMapping(path="/remove")
	    	  						public void deleteStudent(
	    	  							      Integer id) {
	    	  							userrepo.findById(id);
	    	  							userrepo.deleteById(id);
	    	  						}
	    	  						  
	    	   

	
	

}
