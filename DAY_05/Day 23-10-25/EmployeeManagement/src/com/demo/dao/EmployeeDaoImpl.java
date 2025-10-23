package com.demo.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new Employee(1, "vipul", "Software Developer"));
		elist.add(new Employee(2, "Yash", "design"));
		elist.add(new Employee(6, "himansh", "Fullstack"));
		elist.add(new Employee(9, "bhavesh", "backend "));
		elist.add(new Employee(4, "Rohan", " Developer"));
		elist.add(new Employee(3, "Yogesh", "cyber security"));

	}

	@Override
	public boolean save(Employee e) {

		return elist.add(e);
	}

	@Override
	public boolean removeById(int eid) {

		return elist.remove(new Employee(eid));
	}

	@Override
	public List<Employee> showAll() {

		return elist;
	}

	@Override
	public List<Employee> sortByid() {
		List<Employee> lst = new ArrayList<>();
		for (Employee e : elist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}

	@Override
	public List<Employee> searchByName(String nm) {
		List<Employee> temp = elist.stream().filter(emp -> emp.getEmp_name().equals(nm)).collect(Collectors.toList());

		if (temp.size() > 0) {
			return temp;
		}
		return null;
	}

	@Override
	public boolean saveToFile() {
		if (elist.isEmpty()) {
			System.out.println("No employee data to save!");
			return false;
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("employees.txt"))) {
			for (Employee e : elist) {
				bw.write(e.toString());
				bw.newLine();
			}
			System.out.println("All employees saved successfully.");
			return true;
		} catch (IOException e) {
			System.out.println("Error  " + e.getMessage());
			return false;
		}

	}

}
