import java.util.Scanner;

public class AddressMain {
	static int i = 0;
	static UC1 uc1 = new UC1();
	static UC3 uc3 = new UC3();
	static UC4 uc4 = new UC4();
	static UC5 uc5 = new UC5();
	static Contact contact = new Contact();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book");

		do {

			System.out.println(
					"1->add person\t 2->print contact\t 3->update contact\t 4->delete contact\t 5->add multiple contact");
			int option = scan.nextInt();

			switch (option) {
			case 1: {
				uc1.add(contact.map, contact.names);
				break;
			}
			case 2: {
				uc1.print(contact.map, contact.names);

				break;
			}
			case 3: {
				uc3.updateDetails(contact.map, contact.names, contact);
				break;
			}
			case 4: {
				uc4.delete(contact.map, contact.names);
				break;
			}
			case 5: {
				uc5.addMultipleContact(contact.map, contact.names, contact);
				break;
			}
			}
			
			System.out.println("want to repeat");
			i=scan.nextInt();

		} while (i == 1);

	}
}
