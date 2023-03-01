package dominio;
import java.util.ArrayList;
public class Matematicas {
    public static int suma(int n) {
        if (n <= 1)
            return n;
        else
            return n + suma(n - 1);

    }

    public static int fac(int n) {
        if (n <= 1)
            return 1;
        else
            return n * fac(n - 1);
    }

    public static int potencia(int n, int m) {
        if (m == 0)
            return 1;
        else
            return n * potencia(n, m - 1);
    }

    public static int sumaLista(int[] lista, int i) {
        if (i == 0)
            return lista[0];
        else
            return lista[i] + sumaLista(lista, i - 1);
    }

    public static double media(int[] lista, int i) {
        if (i == 0)
            return lista[i];
        else
            return (lista[i] + media(lista, i - 1));

    }

    public static int alcuadrado(int[] lista, int n) {
        if (n == 0)
            return lista[0] * lista[0];
        else
            return lista[n] * lista[n] + alcuadrado(lista, n - 1);
    }

    public static int sumaPares(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n % 2 != 0) {
            return sumaPares(n - 1);
        } else {
            return sumaPares(n - 2) + n;

        }

    }

    public static int sumas(int lista[], int n) {
        if (n == 0) {
            if (lista[n] % 2 == 0) {
                return lista[n];
            } else {
                return 0;
            }
        }
        if (n != 0) {
            if (lista[n] % 2 != 0) {
                return sumas(lista, n - 1);
            }
        }
        return sumas(lista, n - 1) + lista[n];
    }

    public static ArrayList suma1(int[] lista, ArrayList lista2, int n) {
        if (n == 0) {
            if (lista[0] % 2 == 0) {
                lista2.add(lista[n]);
                return lista2;
            } else
                return lista2;
        } else {

            if (lista[n] % 2 != 0)
                return suma1(lista, lista2, n - 1);
            else
                lista2.add(lista[n]);
            return suma1(lista, lista2, n - 1);


        }
    }
        public static ArrayList listaPar(ArrayList lista2, int n) {
            if (n == 2) {
                lista2.add(n);
                return lista2;
            } else if (n % 2 == 0) {
                lista2.add(n);
                return listaPar(lista2, n - 1);
            } else {
                return listaPar(lista2, n - 1);
            }


        }
    public static int calcularProductoEscalar(int[]lista,int []lista2,int n){
        if(n>lista.length-1){
            return 0;
        }else{
            return lista[n]*lista2[n]+calcularProductoEscalar(lista,lista2,n+1);
        }

    }
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;

        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static double fibonacci12(int n){
        if(n<2){
            return 0;
        }else{
            return fibonacci12(n-1)+fibonacci12(n-2);
        }
    }
    public static double fibonacci13(int n){
        if(n<2){
            return n;
        }else{
            return fibonacci13(n-1)+fibonacci13(n-2);
        }
    }
    public static boolean relacionAurea(double numero){
        double cociente=(double)fibonacci(13)/fibonacci(12);
            if(Math.abs(cociente-numero)<=0.1){
                return true;
        }else{
            return false;
        }
    }

}
