import java.util.Scanner;

public class EX4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;
        double[] raiz;

        System.out.println("Informe valor de a --> ");
        a = sc.nextDouble();
        if (a==0){
            System.out.println("Não é uma eq. de 2o grau ");
        }
        else {
            System.out.println("Informe valor de b --> ");
            b = sc.nextDouble();
            System.out.println("Informe valor de c --> ");
            c = sc.nextDouble();
            delta = calcularDelta(a, b, c);
            if (delta >= 0){
                raiz = calcularRaiz(a, b, delta);
                System.out.println("x1= " + String.format("%.2f " , raiz[0]));
                System.out.println("x2 = " + String.format("%.2f " , raiz[1]));
            }
            else {
                System.out.println(" A equação nãomtem raiz real ");
            }
        }
    }
    static double calcularDelta(double a, double b, double c){
        return b*b - 4*a*c;
    }
    static double[] calcularRaiz(  double a, double b, double delta){
        double[] raiz = new double[2];
        raiz[0] = (-b+Math.sqrt(delta))/(2*a);
        raiz[1] = (-b-Math.sqrt(delta))/(2*a);
        return raiz;
    }
}
