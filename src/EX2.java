import java.util.Scanner;

public class EX2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double v, v2, v3;
        System.out.print(" Informe valor1 --> ");
        v = sc.nextInt();
        System.out.print(" Informe valor2 --> ");
        v2 = sc.nextInt();
        System.out.print(" Informe valor3 --> ");
        v3 = sc.nextInt();

        if(v <v2+v3 && v2 < v + v3 && v3 < v + v2){
            classificar(v, v2, v3);
        }
    }

    static void classificar(double v, double v2, double v3){
        if (v == v2 && v2 == v3){
            System.out.print("Equilateronix");
        }
        else if (v == v2 || v == v3 || v2 == v3){
            System.out.println("Isocelonix");
        }
        else {
            System.out.println("Estalone");
        }
    }
}
