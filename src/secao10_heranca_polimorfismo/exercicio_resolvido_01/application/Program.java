package secao10_heranca_polimorfismo.exercicio_resolvido_01.application;

import secao10_heranca_polimorfismo.exercicio_resolvido_01.entities.Employee;
import secao10_heranca_polimorfismo.exercicio_resolvido_01.entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int employeeNumber = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < employeeNumber; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (response == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee e = new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(e);
            }
            else {
                Employee e = new Employee(name, hours, valuePerHour);
                employeeList.add(e);
            }
        }

        System.out.println("PAYMENTS");
        for (Employee e : employeeList) {
            System.out.println(e.getName() + " - $ " + e.payment());
        }

        sc.close();
    }
}
