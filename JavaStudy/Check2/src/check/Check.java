package check;

import constants.Constants;

public class Check {

	private static final String firstName = "小泉";
	private static final String lastName = "恭介";



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		String a = firstName;
//		String b = lastName;
//		String c = printName(firstName , lastName);

		System.out.println("printNameメソッド → " + printName(firstName , lastName));


		  Pet dog = new Pet(Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE);
	      dog.introduce();

	      RobotPet RobotDog = new RobotPet(Constants.CHECK_CLASS_R2D2 , Constants.CHECK_CLASS_LUKE);
	      RobotDog.introduce();
	}

	private static String printName(String firstName, String lastName) {
		// TODO 自動生成されたメソッド・スタブ
//		String d = firstName + lastName;
		return  firstName + lastName;
	}





}
