package main;
/*
 *  定义笔记本类
 *  功能: 开机, 关机, 使用USB设备
 */
public class Computer {
	public void openComputer() {
		System.out.println("开机");
	}
	
	public void closeComputer() {
		System.out.println("关机");
	}
	
	//使用USB设备方法,哪个设备
	public void useUSB(USB usb) { //USB usb = new Mouse()
		usb.open();
		usb.close();
	}
}
