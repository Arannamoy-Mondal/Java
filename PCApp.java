// package pc.app;

import java.util.*;
// import pc.*;

public class PCApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PCMAN pa = new PCMAN();

		while (true) {
			System.out.println("\n--- PC Reservation System ---");
			System.out.println("1. Add a new PC");
			System.out.println("2. Reserve a PC");
			System.out.println("3. View a specific PC");
			System.out.println("4. View all available PCs");
			System.out.println("5. Make a PC available");
			System.out.println("6. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			if (choice == 1) {
				// Add a new PC
				System.out.print("Enter Serial No: ");
				String serialNo = scanner.nextLine();
				System.out.print("Enter HD Size (GB): ");
				double HDSize = scanner.nextDouble();
				System.out.print("Enter RAM Size (GB): ");
				double RAM = scanner.nextDouble();
				System.out.print("Does the PC have a GPU? (true/false): ");
				boolean hasGpu = scanner.nextBoolean();
				double VRam = 0;
				if (hasGpu) {
					System.out.print("Enter VRAM Size (GB): ");
					VRam = scanner.nextDouble();
				}
				scanner.nextLine(); // Consume newline

				PC pc = new PC(serialNo,HDSize,RAM,VRam,hasGpu);
				pa.Addpc(pc);

			} else if (choice == 2) {
				// Reserve a PC
				System.out.print("Enter Serial No: ");
				String serialNo = scanner.nextLine();
				System.out.print("Enter your name: ");
				String reservedBy = scanner.nextLine();
				pa.ReservedPc(serialNo, reservedBy);

			} else if (choice == 3) {
				// View a specific PC
				System.out.print("Enter Serial No: ");
				String serialNo = scanner.nextLine();
				pa.Specific(serialNo);

			} else if (choice == 4) {
				// View all available PCs
				pa.ALL();

			} else if (choice == 5) {
				// Make a PC available
				System.out.print("Enter Serial No: ");
				String serialNo = scanner.nextLine();
				pa.AvailablePC(serialNo);

			} else if (choice == 6) {		
				break;

			} else {
				System.out.println("Invalid choice. Please try again.");
			}
		}
		scanner.close();
	}
}
