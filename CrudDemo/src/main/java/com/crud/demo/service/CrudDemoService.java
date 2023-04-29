package com.crud.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.demo.model.CrudDemo;
import com.crud.demo.repository.CrudDemoRepository;

@Service
public class CrudDemoService {
	
	@Autowired
	CrudDemoRepository cr;
	
	public List<CrudDemo> getAllDetails(){
		
		return cr.findAll();
	}
	
	public CrudDemo saveDetails(@RequestBody CrudDemo id) {
		
		return cr.save(id);
	}
	public CrudDemo putDetails(@RequestBody CrudDemo id) {
			
			return cr.save(id);
		}
	
	public CrudDemo getDetailsById(@PathVariable int id) {
		
		return cr.findById(id).orElse(null);
	}
	
	public void deleteById(@PathVariable int id) {
		
		cr.deleteById(id);
	}
	public List<CrudDemo>sortCrud(String field){
		return cr.findAll(Sort.by(field));
	}
	
	public List<CrudDemo> sortDesCrud(String field){
		
		return cr.findAll(Sort.by(Direction.DESC,field));
	}

	public List<CrudDemo> getpagination(int offset, int pagesize) {
		
		Page<CrudDemo> paging=cr.findAll(PageRequest.of(offset, pagesize));
		return paging.getContent();
	}

	public List<CrudDemo> getsortpagination(int offset, int pagesize,String field) {
		
		Page<CrudDemo> paging=cr.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
		return paging.getContent();
	}

	public List<CrudDemo> getPrefix(String prefix) {
		
		return cr.findByUsernameStartingWith(prefix);
	}

	public List<CrudDemo> getSuffix(String suffix) {
		
		return cr.findByUsernameEndingWith(suffix);
	}

	public List<CrudDemo> getByAttri(String attri) {
		
		return cr.findByUsername(attri);
	}
public CrudDemo register(@RequestBody CrudDemo id) {
		
		return cr.save(id);
	}

public String login(String username,String password) {
	List<CrudDemo> li = cr.findAll();
	String res = null;
	for(CrudDemo l : li) {
		if(l.getUsername().equals(username)&&l.getPassword().equals(password)) {
			res = "Login sucessfull";
		}
	}
	if(res==null) {
		res= "Login failed";
	}
	return res;
}
	





}
