package exemplo3_arrays.application;

import java.util.Locale;
import java.util.Scanner;

import exemplo3_arrays.entities.Quartos;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] rent = new Quartos[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("\nRent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new Quartos(name, email, room);
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i=0; i<rent.length; i++) {
			if(rent[i] != null) {
				System.out.println(rent[i].getRoom() + ": " + rent[i].getName() + ", " + rent[i].getEmail());
			}
		}
		
		
		sc.close();
	}

}
