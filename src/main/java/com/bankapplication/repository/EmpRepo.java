package com.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.bankapplication.entity.Employee;
/**
 * repository for employee with entity class and Integer parameter(identify)
 * @author Hritik shinde
 *date 11/11/21
 */
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
