package KerwinWin;

import robocode.Robot;
import robocode.*;

public class Sample1 extends Robot {
	//确定坦克的基本行为
	public void run()
	{
		while(true){
			turnGunRight(360);
		}
	}
	//当扫描到其他坦克时的行为。
	public void onScannedRobot(ScannedRobotEvent e)
	{
		fire(1);
	}
	

}
