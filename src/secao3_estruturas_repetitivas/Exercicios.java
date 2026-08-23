package secao3_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        // Ex.01
//    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//    incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//    impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

//        int senha_usuario, senha_correta;
//
//        senha_correta = 2002;
//
//        while (true) {
//
//            System.out.print("Digite a sua senha: ");
//            senha_usuario = sc.nextInt();
//
//            if (senha_correta == senha_usuario) {
//                System.out.println("Acesso permitido");
//                break;
//            }
//
//            System.out.println("Senha invalida");
//        }

        // Ex.02
//        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        int x, y; x = 1; y = 1;

        while (x != 0 && y != 0) {

            System.out.print("Digite os valores de x e y: ");
            x = sc.nextInt(); y = sc.nextInt();

            if (x > 0 && y > 0) System.out.println("primeiro");
            else if (x < 0 && y > 0) System.out.println("segundo");
            else if (x < 0 && y < 0) System.out.println("terceiro");
            else if (x > 0 && y < 0) System.out.println("quarto");
        }

        // Ex.03
//        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina               3.Diesel
//        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código           (até
//        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//        exemplo.

//        int codigo, alcool, gasolina, diesel; alcool = 0; gasolina = 0; diesel = 0;
//
//        while (true) {
//
//            System.out.print("Digite o código: ");
//            codigo = sc.nextInt();
//
//            if (codigo < 1 || codigo > 4) continue;
//
//            if (codigo == 1) alcool += 1;
//            else if (codigo == 2) gasolina += 1;
//            else if (codigo == 3) diesel += 1;
//            else break;
//        }
//
//        System.out.println("MUITO OBRIGADO");
//        System.out.println("Alcool: " + alcool);
//        System.out.println("Gasolina: " + gasolina);
//        System.out.println("Diesel: " + diesel);
    }
}
