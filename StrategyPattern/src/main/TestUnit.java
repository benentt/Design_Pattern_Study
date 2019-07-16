package main;

import org.junit.Test;

import com.bennett.common.Duck;
import com.bennett.duck.entity.DecoyDuck;
import com.bennett.duck.entity.MallardDuck;
import com.bennett.duck.entity.RedheadDuck;
import com.bennett.duck.entity.RubberDuck;
import com.bennett.flybehaviour.FlyNoWays;
import com.bennett.flybehaviour.FlyWithWings;
import com.bennett.quackbehaviour.MuteQuack;
import com.bennett.quackbehaviour.Quack;
import com.bennett.quackbehaviour.Squeak;

public class TestUnit {

	@Test
	public void testDecoyDuck(){
		Duck decoyDuck = new DecoyDuck(new FlyWithWings(),new Squeak());
		decoyDuck.show();
		decoyDuck.fly();
		decoyDuck.quack();
	}
	
	@Test
	public void testMallardDuck(){
		Duck decoyDuck = new MallardDuck(new FlyWithWings(),new Squeak());
		decoyDuck.show();
		decoyDuck.fly();
		decoyDuck.quack();
	}
	
	@Test
	public void testRedheadDuck(){
		Duck decoyDuck = new RedheadDuck(new FlyWithWings(),new Quack());
		decoyDuck.show();
		decoyDuck.fly();
		decoyDuck.quack();
	}
	
	@Test
	public void testRubberDuck(){
		Duck decoyDuck = new RubberDuck(new FlyNoWays(),new MuteQuack());
		decoyDuck.show();
		decoyDuck.fly();
		decoyDuck.quack();
		return;
	}
	
}
