package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.model.CrudDemoEmodel;

public interface CrudeDemoErepository extends JpaRepository<CrudDemoEmodel,Integer> {

}
