package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV{
	
	public SoldeskTV() {
		System.out.println("===> SoldeskTV 객체 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("===> SoldeskTV 전원 켜기");		
	}

	@Override
	public void powerOff() {
		System.out.println("===> SoldeskTV 전원 끄기");		
	}

	@Override
	public void VoluemUp() {
		System.out.println("===> SoldeskTV 볼륨 업");				
	}

	@Override
	public void VoluemDown() {
		System.out.println("===> SoldeskTV 볼륨 다운");						
	}
	
	
}
