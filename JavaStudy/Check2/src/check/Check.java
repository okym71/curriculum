package check;

import constants.Constants;

public class Check {
	private static String firstName = "takaaki";
	private static String lastName = "okuyama";
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		printName(firstName,lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		pet.introduce();
		robotPet.introduce();
	}
	public static void printName(String first,String last) {
		System.out.println("printNameメソッド→" + first + last);
	}

}

