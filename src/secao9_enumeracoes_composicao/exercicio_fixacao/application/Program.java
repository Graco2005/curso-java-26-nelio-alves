package secao9_enumeracoes_composicao.exercicio_fixacao.application;

import secao9_enumeracoes_composicao.exercicio_fixacao.entities.Client;
import secao9_enumeracoes_composicao.exercicio_fixacao.entities.Order;
import secao9_enumeracoes_composicao.exercicio_fixacao.entities.OrderItem;
import secao9_enumeracoes_composicao.exercicio_fixacao.entities.Product;
import secao9_enumeracoes_composicao.exercicio_fixacao.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client c1 = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, c1);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product p = new Product(productName, productPrice);

            OrderItem oi1 = new OrderItem(quantity, productPrice, p);

            order.addItem(oi1);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);

        sc.close();
    }
}
