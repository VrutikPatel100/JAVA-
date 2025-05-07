package collectiontopic;

public class Employee {
	  private int id;
	    private String name;
	    private double salary;
	    private String dsgn; // Designation
	    private String orgName; // Organization Name

	    // Constructor
	    public Employee(int id, String name, double salary, String dsgn, String orgName) 
	    {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.dsgn = dsgn;
	        this.orgName = orgName;
	    }

		 public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDsgn() {
			return dsgn;
		}

		public void setDsgn(String dsgn) {
			this.dsgn = dsgn;
		}

		public String getOrgName() {
			return orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
}