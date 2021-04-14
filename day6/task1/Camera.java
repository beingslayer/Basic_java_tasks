package day6.task1;

public class Camera extends ElectronicDevice implements Bluetooth,Flashlight{

	
	
	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		System.out.println("Bluetooth is connected");
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
	public void doSHareFiles() {
		// TODO Auto-generated method stub
		System.out.println("Files are being shared");
		
	}

	@Override
	public void doSwitchOn() {
		// TODO Auto-generated method stub
		System.out.println("Camera is switched on");

	}

	@Override
	public void doSwitchOff() {
		// TODO Auto-generated method stub
		System.out.println("Camera is switched off");
	}

}
