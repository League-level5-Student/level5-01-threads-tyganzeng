package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot a = new Robot(400, 700);
		Robot b = new Robot(800, 700);
		Robot c = new Robot(1200, 700);
		Robot d = new Robot(600, 300);
		Robot e = new Robot(1000, 300);
		
		Thread r1 = new Thread(()->{
			a.penDown();
			a.setAngle(360);
			a.move(360);
		});
		Thread r2 = new Thread(()->{
			b.penDown();
			b.setAngle(360);
			b.move(360);
		});
		Thread r3 = new Thread(()->{
			c.penDown();
			c.setAngle(360);
			c.move(360);
		});
		Thread r4 = new Thread(()->{
			d.penDown();
			d.setAngle(360);
			d.move(360);
		});
		Thread r5 = new Thread(()->{
			e.penDown();
			e.setAngle(360);
			e.move(360);
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
	
		
		
	}
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
}

