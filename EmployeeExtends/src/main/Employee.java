package main;
/*
 *  ����Ա����
 *      ����: ����, ����
 *      ����: ����
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
