package secao10_tratamento_de_exceções.aula_02.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    static void main() {

        File file = new File("/home/graco/arquivo.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
