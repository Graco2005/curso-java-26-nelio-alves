package secao10_tratamento_de_exceções.aula_03_solucao_muito_ruim.application;

import secao10_tratamento_de_exceções.aula_03_solucao_muito_ruim.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int  number = sc.nextInt();

        System.out.print("Checkin date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Checkin date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter the date to update the reservation:");
            System.out.print("Checkin date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Checkin date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            else if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }

            reservation.updateDates(checkIn, checkOut);
        }

        sc.close();
    }
}
