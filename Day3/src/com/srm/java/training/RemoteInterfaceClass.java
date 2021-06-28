package com.srm.java.training;
interface TVRemote {

	void powerOn();
	void powerOff();
	
}
interface SmartTVRemote extends TVRemote
{
	void Record();
	void Bluetooth();
}

class Television implements SmartTVRemote {

	@Override
	public void powerOn() {
		System.out.println("Power On");
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off");
	}

	@Override
	public void Record() {
		System.out.println("Record TV Program");
	}

	@Override
	public void Bluetooth() {
		System.out.println("Bluetooth Enabled");
	}
}
public class RemoteInterfaceClass {
	public static void main(String args[])
	{
		Television TV1=new Television();
		TV1.powerOn();
		TV1.powerOff();
		TV1.Record();
		TV1.Bluetooth();
		
	}

}
