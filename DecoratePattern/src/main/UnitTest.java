package main;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.bennett.beverage.entity.DarkRoast;
import com.bennett.decorator.entity.Milk;
import com.bennett.decorator.entity.Mocha;

public class UnitTest {
	
	//one DarkRoast with Mike and Mocha
	@Test
	public void Test1() {
		DarkRoast darkRoast = new DarkRoast(DarkRoast.L);
		Milk milk = new Milk(darkRoast);
		Mocha mocha = new Mocha(milk);
		System.out.println(mocha.getDescription());
		System.out.println(mocha.cost());
	}
}
