package pojoClass;

public class UserLibraries {
	//Rule:declare all the variables as global
	String name;
	String job;
	public UserLibraries(String name,String job) {
		this.name=name;
		this.job=job;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;

	}
	public String getjob() {
		return job;
	}

}
