package main;
/*
 *  ����ʼǱ���
 *  ����: ����, �ػ�, ʹ��USB�豸
 */
public class Computer {
	public void openComputer() {
		System.out.println("����");
	}
	
	public void closeComputer() {
		System.out.println("�ػ�");
	}
	
	//ʹ��USB�豸����,�ĸ��豸
	public void useUSB(USB usb) { //USB usb = new Mouse()
		usb.open();
		usb.close();
	}
}
