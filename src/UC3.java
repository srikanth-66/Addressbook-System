import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sun.jdi.Type;

public class UC3 {
	public void updateDetails(Map<String, Object> map, List<String> name, Contact contact) {
		
				
		try {
	
		System.out.print("Enter name - ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.next();
		
		for(int i=0;i<name.size();i++) {
			System.out.println(((List<String>) map.get(name.get(i))).get(0));	
			if(((List<String>) map.get(name.get(i))).get(0).equals(getUserInput)) {
				System.out.println("want to change");
				System.out.print("1->name\t2->address\t3->cityName\t4->stateName\t5->zipCode\t6->phoneNumber\t7->emailAddress");
				int option = scanInput.nextInt();
				switch(option) {
				case 1:{
						System.out.println("enter new name - ");
						String changeName=scanInput.next();
						List<String> list = (List<String>) map.get(name.get(i));
						list.set(0, changeName);
						map.put(changeName, list);
					break;
				}
				case 2:{
					System.out.println("enter new address - ");
					String changeAddress=scanInput.next();
					List<String> list = (List<String>) map.get(name.get(i));
					list.set(1, changeAddress);
					map.put(name.get(i), list);
					break;
				}
				case 3:{
					System.out.println("enter new cityName - "); 															
					String changeCityName=scanInput.next();
					List<String> list = (List<String>) map.get(name.get(i));
					list.set(2, changeCityName);
					map.put(name.get(i), list);
					break;
				}
				case 4:{
					System.out.println("enter new stateName - ");
					String changeStateName=scanInput.next();
					List<String> list = (List<String>) map.get(name.get(i));
					list.set(3, changeStateName);
					map.put(name.get(i), list);
					break;
				}
				case 5:{
					System.out.println("enter new zipCode - ");
					String changeZipCode=scanInput.next();
					List<String> list = (List<String>) map.get(name.get(i));
					list.set(4, changeZipCode);
					map.put(name.get(i), list);
					break;
				}
				case 6:{
					System.out.println("enter new phoneNumber - ");
					String changePhoneNumber=scanInput.next();
					List<String> list = (List<String>) map.get(name.get(i));
					list.set(5, changePhoneNumber);
					map.put(name.get(i), list);
					break;
				}
				case 7:{
					System.out.println("enter new emailAddress - ");
					String changeEmailAddress=scanInput.next();
					List<String> list = (List<String>) map.get(name.get(i));
					list.set(6, changeEmailAddress);
					map.put(name.get(i), list);
					break;
				}
				
				}
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
}
