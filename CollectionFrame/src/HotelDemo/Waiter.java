package HotelDemo;
/*
 * ����Ա��
 *    ����Ա��һ��,���ж��������
 *    �̳�Employee,ʵ��VIP�ӿ�
 * */
public class Waiter extends Employee implements VIP{
	public Waiter() {
		super();
	}

	public Waiter(String name, String id) {
		super(name, id);
	}

	public void work() {
		System.out.println("����Ա�ϲ�");
	}
	
	public void services() {
		System.out.println("VIP���񣬷���Ա��ˮ");
	}
}
