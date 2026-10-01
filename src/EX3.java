import java.util.Scanner;

public class EX3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int v1, v2, v3;
        System.out.println("Digite valor 1 --> ");
        v1 = sc.nextInt();
        System.out.println("Digite valor 2 --> ");
        v2 = sc.nextInt();
        System.out.println("Digite valor 3 --> ");
        v3 = sc.nextInt();

        int retorno = retornar(v1, v2, v3);
        System.out.println("Seu maior valor é --> " + retorno);
    }

    static int retornar(int v1, int v2, int v3){
        if (v1 > v2 && v1 > v3){
            return v1;
        }
        if (v2 > v1 && v2 > v3){
            return v2;
        }
        else {
            return v3;

        }
    }
}


// caso no retornar igualarmos v1 a uma variavel podemos fazer menos if's

// exemplo-->             int maior = v1; --> if(v2> maior){ v2 = maior}; --> else if( v3 > maior){ maior = v3};
