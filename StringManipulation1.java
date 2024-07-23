import java.util.Scanner;
public class StringManipulation {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			StringBuilder stringBuilder = new StringBuilder();
			System.out.println("Enter your first name: ");
			String firstName = scanner.nextLine();
			System.out.println("Enter your middle name: ");
			String middleName = scanner.nextLine();
			System.out.println("Enter your last name: ");
			String lastName = scanner.nextLine();
			stringBuilder.append(firstName);
			stringBuilder.append(" ");
			stringBuilder.append(middleName);
			stringBuilder.append(" ");
			stringBuilder.append(lastName);
			String fullName = stringBuilder.toString();
	}
}
