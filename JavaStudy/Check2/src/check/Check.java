package check;

import constants.Constants;


public class Check {
	 public static void main(String[] args) {

	 String firstName = "長坂";
	 String lastName = "有紀";
	printName(firstName, lastName);
  }
private static void printName(String firstName, String lastName) {
	// TODO 自動生成されたメソッド・スタブ
	System.out.println("printNameメゾット → " + firstName + lastName);

	Pet name = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	name.introduce();

	RobotPet Robotname = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	Robotname.introduce();
 }
}
