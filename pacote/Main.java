package pacote;
import java.util.Scanner;
import pacote.Employee;
import pacote.employeeManager;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static employeeManager employeeManager = new employeeManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Find Employee by ID");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    findEmployee();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Allergies: ");
        String allergies = scanner.nextLine();
        System.out.print("Enter Medical Conditions: ");
        String medicalConditions = scanner.nextLine();
        System.out.print("Enter Contact Phone: ");
        String contactPhone = scanner.nextLine();
        System.out.print("Enter Contact Email: ");
        String contactEmail = scanner.nextLine();

        Employee employee = new Employee(id, name, allergies, medicalConditions, contactPhone, contactEmail);
        employeeManager.addEmployee(employee);
        System.out.println("Employee added successfully!");
    }

    private static void findEmployee() {
        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine();
        Employee employee = employeeManager.findEmployeeById(id);

        if (employee != null) {
            employee.displayInfo();
        } else {
            System.out.println("Employee not found.");
        }
    }
}
