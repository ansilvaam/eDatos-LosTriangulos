
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EDatosLosTriangulos {

    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dame m: "); //mi limite inicial
        int m = Integer.parseInt(leer.readLine());
        System.out.println("Dame n: "); //mi limite final
        int n = Integer.parseInt(leer.readLine());

        int a, b, c; //lados del triangulo abc
        int contador = 0; //mi contador

        for (int i = m; i <= n; i++) {
            for (int j = m; j <= n; j++) {
                for (int k = m; k <= n; k++) {

                    a = i * i; //a^2
                    b = j * j; //b^2
                    c = k * k; //c^2

                    if ((i + j) > k && (k + i) > j && (k + j) > i) {  //Estableci una condicion para que unicamente se comprobaran los triangulos validos.
                        // a + b > c   donde i es a, j es b y k es c
                        // a + c > b
                        // b + c > a

                        contador++;
                        //System.out.println(contador + " " + i + " " + j + " " + k); //para comprobar

                    }

                }
            }
        }

        contador = contador / 3; //lo divido sobre 3 ya que me di cuenta que en estas combinaciones de ternas habra el triple de combinaciones de ternas
        //entonces el ejercicio solamente quiere tomar en cuenta 17 de las 52 posibles para el caso de (M = 2 y N = 5) ya que las otras son las
        //mismas pero en diferente posicion.
        System.out.println(contador);
    }
}
