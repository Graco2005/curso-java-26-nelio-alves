package secao10_heranca_polimorfismo.exercicio_ficaxao_01.application;

import secao10_heranca_polimorfismo.exercicio_ficaxao_01.entities.ImportedProduct;
import secao10_heranca_polimorfismo.exercicio_ficaxao_01.entities.Product;
import secao10_heranca_polimorfismo.exercicio_ficaxao_01.entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    static void main() throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int productsNumber = sc.nextInt();

        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < productsNumber; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();

            if (answer == 'c') {
                System.out.print("Name: ");
                String product = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();
                
                Product p = new Product(product, price);
                productList.add(p);
            } else if (answer == 'u') {
                System.out.print("Name: ");
                String product = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                UsedProduct p = new UsedProduct(product, price, manufactureDate);
                productList.add(p);
            } else if (answer == 'i') {
                System.out.print("Name: ");
                String product = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();

                Product p = new ImportedProduct(product, price, customFee);
                productList.add(p);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product p : productList) {
            System.out.println(p.priceTag());
        }
    }
}
