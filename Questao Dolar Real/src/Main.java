import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Cot, Vd, Vr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotacao atual do dolar:");
        Cot = scanner.nextInt();

        System.out.print("Digite a quantidade que possui em dolar: ");
        Vd = scanner.nextInt();
        Vr = Vd/Cot;
        System.out.println("A quantidade que possui em real e: " + Vr);

        scanner.close();
    }
}