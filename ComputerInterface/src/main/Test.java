package main;

public class Test {

	public static void main(String[] args) {
		//�����ʼǱ�����,���ñʼǱ��Ĺ���
		Computer com = new Computer();
		com.openComputer();
		
		//���ñʼǱ�ʹ��USB�豸�ķ���
		//����,��USB�ӿ�����,�ӿڲ��ܽ�������
		//���÷���,����USB�ӿڵ�ʵ����Ķ���
		Mouse m = new Mouse();
		com.useUSB(m);
		
		com.useUSB(new Keyboard());
		
		com.closeComputer();
	}

}
