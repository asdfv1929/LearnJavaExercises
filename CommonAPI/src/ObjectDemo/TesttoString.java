package ObjectDemo;

public class TesttoString {

	public static void main(String[] args) {
		//����Person��ķ���toString()
		Person p = new Person("����", 23);
		String s = p.toString();
		//���������У���д����һ������Ĭ�ϵ��ö����toString��������ӡ�ڴ��ַ
		System.out.println(p); //object.Person@6d06d69c
		System.out.println(s); //object.Person@6d06d69c
		
		//����23
		//����23
	}

}
