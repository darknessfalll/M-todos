import java.util.Scanner;

public class EX1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.print(" Informe um valor inteiro e positivo -->");
        valor = sc.nextInt();
        if (valor > 0){
            imprimir(valor); //argumento
        }
        else {
            System.out.println("Número deve ser inteiro e positivo");
        }
    }

    static void imprimir(int valor){
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                System.out.print(i + "   ");
            }
        }
        for (int i = -1; i >= -(valor); i--) {
            if (valor % i == 0) {
                System.out.print(i + "   ");
            }
        }

    }
}
