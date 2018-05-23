package main;
/*
 *  定义员工类
 *      属性: 姓名, 工号
 *      方法: 工作
 */
public abstract class Employee {
	private String Name;
	private String Id;
	
	public abstract void work();

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	
}
