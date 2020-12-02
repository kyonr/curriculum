package check;

public class Check {

	private static final String firstName = "小泉";
	private static final String lastName = "恭介";


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String a = firstName;
		String b = lastName;
		String c = printName(a , b);

		System.out.println("printNameメソッド → " + c);

		Pet dog = new Pet();
		dog.getName();


	}


	private static String printName(String firstName, String lastName) {
		// TODO 自動生成されたメソッド・スタブ
		String d = firstName + lastName;
		return d;
	}






}
