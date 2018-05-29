package ObjectDemo;


//Ĭ�ϼ̳�Object��
public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * �������equals������д
	 * ��������û�ı�
	 * �Ƚϵ��Ƕ�����ڴ��ַ
	 * */
//	public boolean equals(Object obj) {
//		return this == obj;
//	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		
		if (obj instanceof Person) {
			//��obj��������ת�ͣ�ת��Person��
			Person p = (Person)obj;
			return this.age == p.age;
		}
		return false;
	}
	
	/*
	 * ��д����ķ���toString()
	 * û�б�Ҫ�õ����߿����ڴ��ַ
	 * Ҫ��: ������, �����������г�Ա������ֵ
	 */
	public String toString() {
		return this.name + this.age;
	}
}
