package secao7_comportamento_memoria_array_listas.aula04;
// Boxing e Unboxing (upcasting e downcasting)

public class Aula04 {
    static void main() {
        int x = 20;

        Object obj = x;

        System.out.println("Variável 'obj' do tipo Object: " + obj);

        int y = (int) obj;

        System.out.println("Variável 'obj' do tipo inteiro: " + y);
    }
}
