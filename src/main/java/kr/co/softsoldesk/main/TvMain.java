package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;

public class TvMain {

	public static void main(String[] args) {
		
		//Spring 컨테이너 구동
		//AbstractApplicationContext : BeanFactory + ApplicationContext
		//GenericXmlApplicationContext : 파일과 클래스 관리 설정(xml)
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//컨테이너로부터 필요한 객체를 요청
		TV tv1 = (TV)ctx.getBean("SamsungTV");
		tv1.powerOn();
		tv1.powerOff();
		tv1.VoluemUp();
		tv1.VoluemDown();

		TV tv2 = (TV)ctx.getBean("SoldeskTV");
		tv2.powerOn();
		tv2.powerOff();
		tv2.VoluemUp();
		tv2.VoluemDown();
		
		ctx.close();
	}	
	
}