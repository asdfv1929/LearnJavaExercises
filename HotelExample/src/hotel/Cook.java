package hotel;
/*
 * �����ʦ��
 * ����Ա��һ�֣� ���ж��������
 * �̳�Employee�࣬ ʵ��VIP�ӿ�
 * */
public class Cook extends Employee implements VIP{
	//�ղι���
	public Cook() {}
	
	//�вι���
	public Cook(String name, String id) {
		super(name, id);
	}
	
	//���󷽷�����д
	public void work() {
		System.out.println("��ʦ���ڳ���");
	}

	@Override
	public void services() {
		System.out.println("VIP���񣬳�ʦ���˼���");
	}
}
