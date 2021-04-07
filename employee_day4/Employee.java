package employee_day4;

public class Employee {
	private int empId;
	private String empName;
	private String projectName;
	
	private int exp;
	
	private int salary;
	/*
	 *   trigger
	 *   if (exp is less than 3) :- salary should not be greater than 3000
	 *   
	 *   Salary > 20000 :- Error
	 * 
	 * */
	
	public Employee() {
		empId = -1;
		empName = " No Name Set";
		salary = -1;
		projectName = " No Project Allocate";
	}
	
	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Employee(int id)
	{
		empId = id;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
     public void computeSalary(int exp)
     {
    	 if(exp<3)
    	 {
    		 if(salary>3000)
    		 {
    			 System.out.println("ERROR");
    			 salary=0;
    		 }
    		 
    	 }
    	 if(salary>20000)
    	 {
    		 System.out.println("error");
    		 salary=0;
    	 }
     }
     public void print()
     {
    	 System.out.println("emp id-->"+empId+"\nEmp name-->"+empName+"\nSalary--->"+salary+"\nExp--->"+exp);
     }

	/* Business Method / operation */
	public void workingOnProject()
	{
		// 1000 lines of code ...
		System.out.println
		(empName+" working on "
				+ ""+projectName);
		
	}
	
	

}
