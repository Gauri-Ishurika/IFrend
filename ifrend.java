import java.util.*;
public class ifrend{
	static Scanner input = new Scanner(System.in);
	
	static String[] contactIds = new String[100];
	static String[] names = new String[100];
	static String[] phoneNumbers = new String[100];
	static String[] companies = new String[100];
	static double[] salaries = new double[100];
	static String[] birthDays = new String[100];

	static int count = 0;

	public static void main(String args[]){

		//while(true){
			System.out.println("");
			System.out.println("");
			System.out.println("/$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
			System.out.println("|__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
			System.out.println(" /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
			System.out.println("| $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
			System.out.println("| $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
			System.out.println("| $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
			System.out.println("| $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
			System.out.println("|__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("  _____            _             _           ____                        _");
			System.out.println(" / ____|          | |           | |         / __ \\                      (_)");
			System.out.println("| |     ___  _ __ | |_ __ _  ___| |_ ___   | |  | |_ __ __ _  __ _ _ __  _ _______ _ __");
			System.out.println("| |    / _ \\| '_ \\| __/ _' |/ __| __/ __|  | |  | | '__/ _' |/ _' | '_ \\| |_  / _ \\ '__|");
			System.out.println("| |___| (_) | | | | || |_| | |__| ||\\__ \\  | |__| | | | |_| | |_| | | | | |/ /  __/ |");
			System.out.println(" \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|___/   \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|");
			System.out.println("                                                        __/ |");
			System.out.println("                                                       |___/");
			System.out.println("");
			System.out.println("==========================================================================================");
			System.out.println("");
			System.out.println("");
			System.out.println("         [01] ADD CONTACTS ");
			System.out.println("         [02] UPDATE CONTACTS");
			System.out.println("         [03] DELETE CONTACTS");
			System.out.println("         [04] SEARCH CONTACTS");
			System.out.println("         [05] LIST CONTACTS");
			System.out.println("         [06] EXIT");
			System.out.println("");
			System.out.print("Enter an option to continue -> ");
			int option = input.nextInt();
			input.nextLine();
		//}
	}
}
