package secao10_heranca_polimorfismo.aula02.application;

import secao10_heranca_polimorfismo.aula02.entities.Circle;
import secao10_heranca_polimorfismo.aula02.entities.Rectangle;
import secao10_heranca_polimorfismo.aula02.entities.Shape;
import secao10_heranca_polimorfismo.aula02.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();

        List<Shape> shapeList = new ArrayList<>();

        for (int i = 0; i < shapes; i++) {
            System.out.println("Enter #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char rc = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (rc == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapeList.add(new Rectangle(color, width, height));
            } else if (rc == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(color, radius));
            } else {
                System.out.println("Digite um valor válido");
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapeList) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
