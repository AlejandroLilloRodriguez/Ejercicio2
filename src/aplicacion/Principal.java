package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;
import dominio.Matematicas;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero entero");
        int n = sc.nextInt();
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] lista3 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList lista2 = new ArrayList<>();
        double media = Matematicas.media(lista,lista.length-1)/lista.length;
        double alcuadrado = Matematicas.alcuadrado(lista, lista.length-1);
        double varianza = (alcuadrado / lista.length) - media * media;
        double desviaciontipica = Math.sqrt(varianza);
        System.out.println("la suma de los numeros enteros desde 0 hasta " + n + " es " + Matematicas.suma(n));
        System.out.println("la multiplicacion de los numeros enteros desde 1 hasta " + n + " es " + Matematicas.fac(n));
        System.out.print("introduce un numero entero");
        int m = sc.nextInt();
        System.out.println("la potencia de " + n + " elevado a " + m + " es " + Matematicas.potencia(n, m));
        System.out.println("la suma  de los elementos de la lista es " + Matematicas.sumaLista(lista, lista.length-1));
        System.out.println("la media de los elementos de la lista es " + Matematicas.media(lista, lista.length-1)/lista.length);
        System.out.println("la desviaion tipica de los elementos de la lista es " + desviaciontipica);
        System.out.println("la suma de los numeros pares desde 0 hasta " + n + " es " + Matematicas.sumaPares(n));
        System.out.println("la suma de los numeros pares de la lista es " + Matematicas.sumas(lista, lista.length-1));
        System.out.println("la lista de numeros pares de la lista es " + Matematicas.suma1(lista,lista2,lista.length-1));
        System.out.println("la lista de numeros pares desde 0 hasta " + n + " es " + Matematicas.listaPar(lista2,n));
        System.out.println("el producto escalar de la lista 1 y la lista 2 es " + Matematicas.calcularProductoEscalar(lista, lista3, lista.length-1));
        System.out.println("el numero de fibonacci de :" + n + " es " + Matematicas.fibonacci(n));
        System.out.print("introduce un numero entero :");
        int x = sc.nextInt();
        System.out.println("la relacion  aurea entre dos numeros es " + Matematicas.relacionAurea(x));

    }
}
