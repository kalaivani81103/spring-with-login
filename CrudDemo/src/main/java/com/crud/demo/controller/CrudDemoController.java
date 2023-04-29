package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.model.CrudDemo;
import com.crud.demo.service.CrudDemoService;

@RestController
public class CrudDemoController {
	
	@Autowired
	CrudDemoService cs;
	
	@GetMapping("/all")
	public List<CrudDemo> allDetails(){
		
		return cs.getAllDetails();
	}
	
	@PostMapping("/save")
	public String saveAll(@RequestBody CrudDemo id) {
		
		cs.saveDetails(id);
		return "Details Saved";
	}
	
	@PutMapping("/put")
	public CrudDemo saveAlll(@RequestBody CrudDemo id) {
		
		return cs.putDetails(id);
		
	}
	
	@GetMapping("/all/{id}")
	public CrudDemo getId(@PathVariable int id) {
		
		return cs.getDetailsById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		
		cs.deleteById(id);
		return "Details Deleted";
	}
	@GetMapping("/auto/{field}")
	public List<CrudDemo>sortCrudD(@PathVariable String field){
		return cs.sortCrud(field);
	}
	@GetMapping("/auto")
	public List<CrudDemo>sortCrudDes(@RequestParam String field){
		return cs.sortDesCrud(field);
	}
	
	
	@GetMapping("/pagination")
	
	public List<CrudDemo> pagination(@RequestParam int offset,@RequestParam int pagesize){
		
		return cs.getpagination(offset,pagesize);
	}
	
	@GetMapping("/sortpagination")
	
	public List<CrudDemo> sortpagination(@RequestParam int offset,@RequestParam int pagesize,String field){
		
		return cs.getsortpagination(offset,pagesize,field);
	}
	
	@GetMapping("/prefix")
	public List<CrudDemo> getPrefix(@RequestParam String prefix){
		
		return cs.getPrefix(prefix);
	}
	
	@GetMapping("/suffix")
	public List<CrudDemo> getSuffix(@RequestParam String suffix){
		
		return cs.getSuffix(suffix);
	}
	
	@GetMapping("/attri")
	public List<CrudDemo> getByAttri(@RequestParam String attri){
		
		return cs.getByAttri(attri);
	}
	@PostMapping("/reg")
	public CrudDemo regid(@RequestBody CrudDemo id) {
		
		System.out.println("registeration successfull");
		return cs.register(id);
		
	}
	@GetMapping("/login")
	public String logins(@RequestParam String username, @RequestParam String password){
		
		return cs.login(username,password);
	}

	
	

}
