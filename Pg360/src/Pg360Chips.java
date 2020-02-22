import java.util.Scanner;
public class Pg360Chips {
public static void main(String args[]) {
	Scanner Keyboard=new Scanner(System.in);
	String type;
	int numberofchips = 0;
	System.out.print("how many chip do you have?");
	System.out.print("(type a number or");
	System.out.print("type not playing)");
	type=Keyboard.next();
	if(!type.equals("notplaying")) {
		System.out.print("you have");
		numberofchips=Integer.parseInt(type);
		numberofchips+=10;
		System.out.print(numberofchips);
		
	}
	Keyboard.close();
}
}
