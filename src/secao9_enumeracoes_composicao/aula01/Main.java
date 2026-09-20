package secao9_enumeracoes_composicao.aula01;

import java.util.Date;

public class Main {
    static void main() {

        Order pedido = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(pedido);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println("OS1: " + os1);
        System.out.println("OS2: " + os2);

    }
}
