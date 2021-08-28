package check;

import java.awt.Robot;

public class Check {
	private static String firstName = "takaaki";
	private static String lastName = "okuyama";
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		private static void printName(String first,String last) {
			System.out.println("printNameメソッド→" + first + last);
		}
		printName(firstName,lastName);
		Pet pet = new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(CHECK_CLASS_R2D2,CHECK_CLASS_LUKE);
		pet.introduce();
		Robot.introduce();
	}

}

