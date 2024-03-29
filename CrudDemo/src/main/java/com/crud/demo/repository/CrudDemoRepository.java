package com.crud.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.model.CrudDemo;

@Repository
public interface CrudDemoRepository extends JpaRepository<CrudDemo,Integer> {

	List<CrudDemo> findByUsernameStartingWith(String prefix);

	List<CrudDemo> findByUsernameEndingWith(String suffix);

	List<CrudDemo> findByUsername(String attri);

	

}
