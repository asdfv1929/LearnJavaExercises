package hotel;
/*
 * ���徭����
 *    ����Ա��һ��,û��VIP����
 *    �Լ��н�������
 * */
public class Manager extends Employee{

	public Manager() {
		super();
	}

	public Manager(String name, String id, double money) {
		super(name, id);
		this.money = money;
	}
	
	//���影������
	private double money;
		
		
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	//��д���󷽷�
	public void work(){
		System.out.println("����, ˭�����ҷ�˭");
	}
}