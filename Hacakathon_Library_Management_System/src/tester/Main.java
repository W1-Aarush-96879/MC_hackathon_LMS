package tester;

import java.util.Scanner;

import menu.MainMenu;
import service.LibraryManager;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryManager service = new LibraryManager();
		int choice;
		
		while((choice = MainMenu.mainMenu(sc)) != 0) {
			sc.nextLine();
			switch (choice) {
			case 1:
				service.addBook(sc);
				break;
				
			case 2:
				service.addMember(sc);
				break;
				
			case 3:
				service.showBooks();
				break;
				
			case 4:
				service.showMembers();
				break;
				
			case 5:
				service.addCopy(sc);
				break;
				
			case 6:
				service.showCopies();
				break;
				
			case 7:
				service.issueBook(sc);
				break;
				
			case 8: 
				service.returnBook(sc);
				break;
			}
		}

	}

}
