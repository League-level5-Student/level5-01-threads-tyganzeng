package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class test {
	public static void main(String[] args) {
		Robot[] robot = new Robot[5];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i<robot.length;i++) {
			robot[i] = new Robot();
			robot[i].setY(800);
			robot[i].setX(100 + 300*i);
		}
		Random r = new Random();
		boolean reachedFinish = false;
		
		Thread r1 = new Thread(()->{
			robot[0].move(r.nextInt(170));

		});
		
		r1.start();
	}
}
