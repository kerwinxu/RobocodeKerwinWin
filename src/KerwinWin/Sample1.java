package KerwinWin;

import robocode.Robot;
import robocode.*;

public class Sample1 extends Robot {
	//ȷ��̹�˵Ļ�����Ϊ
	public void run()
	{
		while(true){
			turnGunRight(360);
		}
	}
	//��ɨ�赽����̹��ʱ����Ϊ��
	public void onScannedRobot(ScannedRobotEvent e)
	{
		fire(1);
	}
	

}
