//Principal.java

import java.util.Collections;
import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Ingrese el límite de la tarjeta: ");
        double limite = lectura.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while(salir != 0){
            System.out.println("Escriba la descripción de la compra: ");
            lectura.nextLine(); 
            String descripcion = lectura.nextLine();

            System.out.println("Escriba el valor de la compra: ");
            double valor = lectura.nextDouble();

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada con éxito! ");
                System.out.println("----------------");
                System.out.println("Ingrese 0 para salir o 1 para continuar: ");
                salir = lectura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }

        }

        System.out.println("----------------");
        System.out.println("*****   COMPRAS REALIZADAS   *****");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Compra compra : tarjeta.getListaDeCompras()) {
            System.out.println("Compra: " + compra.getDescripcion() + " - Valor de la compra:" + compra.getValor());
        }
        System.out.println("-----------------------");
        System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());
    }
   
}



