package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
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
		Thread r2 = new Thread(()->{
			robot[1].move(r.nextInt(170));

		});
		Thread r3 = new Thread(()->{
			robot[2].move(r.nextInt(170));

		});
		Thread r4 = new Thread(()->{
			robot[3].move(r.nextInt(170));

		});
		Thread r5 = new Thread(()->{
			robot[4].move(r.nextInt(170));
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
		/*while(!reachedFinish) {
			if(robot[0].getY() < 0 || robot[1].getY() < 0 || robot[2].getY() < 0 || robot[3].getY() < 0 || robot[4].getY() < 0 ) {
				reachedFinish = true;
				if(robot[0].getY() < 0) {
					System.out.println("Robot 0 is the winner!");
				} else if(robot[1].getY() < 0) {
					System.out.println("Robot 1 is the winner!");
				} else if(robot[2].getY() < 0) {
					System.out.println("Robot 2 is the winner!");
				} else if(robot[3].getY() < 0) {
					System.out.println("Robot 3 is the winner!");
				} else if(robot[4].getY() < 0) {
					System.out.println("Robot 4 is the winner!");
				} 
				
			}
		}*/
		
		

	}
	
	
}
