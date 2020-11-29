package com.org;

public class EmployeeService extends EmployeeDao {
	private EmployeeDao empDao;

	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	public void storeService() {
		System.out.println("Inside storeService method in Employee Service class");
		empDao.store();
	}
}
