package ObjectDemo;

public class TestEquals {

	public static void main(String[] args) {
		//Person��̳�Object�࣬ �̳��˸���ķ���equals
		Person p1 = new Person("Сӣ", 21);
		Person p2 = new Person("С��", 22);
		
		//���ø��෽��equals�����ж���ıȽϣ��Ƚϵ��Ƕ�����ڴ��ַ
		boolean bool = p1.equals(p2);
		System.out.println(bool);
	}

}
