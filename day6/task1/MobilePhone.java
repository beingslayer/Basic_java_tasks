package day6.task1;

public class MobilePhone extends ElectronicDevice implements Wifi,Bluetooth,Flashlight,Hotspot{

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
	public void doFlashOn() {
		// TODO Auto-generated method stub
		System.out.println("Flashlight is on");
	}

	@Override
	public void doFlashOff() {
		// TODO Auto-generated method stub
		System.out.println("Flashlight is off");
	}

	@Override
	public void doSwitchOn() {
		
		// --- how to switch on mobile phone 
	}

	@Override
	public void doSwitchOff() {
		
		
	}

	@Override
	public void doConnection() {
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSHareFiles() {
		// TODO Auto-generated method stub
		
	}

	public void doCalling()
	{
		
	}
	
	
}
