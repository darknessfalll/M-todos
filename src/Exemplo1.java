public class Exemplo1 {
    static void main() {
        int x = 3, y=5; // variável local
        int resultado;
        resultado = somar(x, y);
        System.out.println(" soma --> " + resultado);
        resultado = subtrai(x, y);
        System.out.println("subtração --> " + resultado);
    }

    static int somar(int x, int y) {
        int resultado = x + y;
        return resultado;
    }

    static int subtrai(int x, int y) {
        int resultado = x - y;
        return resultado;
    }

}
