package com.bankapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapplication.entity.Employee;
import com.bankapplication.repository.EmpRepo;
@Service
public class EmpService {
	@Autowired
	private EmpRepo repo;
	/**
	 * to Add Employee to Database
	 * @param addemp
	 */
	public void addEmp(Employee e) {
		repo.save(e);
	}
	/**
	 * to view employee details
	 * @return getallEmp
	 */
	public List<Employee> getAllEmp()
	{
		return repo.findAll();
	}
	/**
	 * to get employee with id use to perform edit delete operation
	 * @param id
	 * @return get Employee by Id
	 */
	public Employee getEmpById(int id)
	{
		Optional<Employee> e= repo.findById(id);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	/**
	 * delete Employee with given id
	 * @param id
	 */
	public void deleteEmp(int id)
	{
		repo.deleteById(id);
	}
}
