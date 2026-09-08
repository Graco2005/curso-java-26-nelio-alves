package secao7_comportamento_memoria_array_listas.aula05;
// Laço "for each"

public class Aula05 {
    static void main() {

        String[] vect = new String[] {"Marina", "Luis", "João"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("------------");
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
