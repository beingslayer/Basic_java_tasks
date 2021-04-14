package day6.task1;

public class Laptop extends ElectronicDevice implements Wifi,Hotspot {

	@Override
	public void SwitchOnHotspot() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Hotspot on");
	}

	@Override
	public void SwitchOffHotspot() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Hotspot off");
	}

	@Override
	public void ConnectedDevice() {
		// TODO Auto-generated method stub
		System.out.println("Other device are connected");
		
	}

	@Override
	public void BlockedDevices() {
		// TODO Auto-generated method stub
		System.out.println("Device is blocked successfully");
	}

	@Override
	public void doConnection() {
		// TODO Auto-generated method stub
		System.out.println("Wifi is connected");
	}

	@Override
	public void doSwitchOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSwitchOff() {
		// TODO Auto-generated method stub

	}

}
