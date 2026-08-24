import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int An, At, IdAt, Id2050;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        An = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        At = scanner.nextInt();
        IdAt = At - An;
        Id2050 = 2050 - An;
        System.out.println("A sua idade atul é: " + IdAt);
        System.out.println("A sua idade em 2050 vai ser: " + Id2050);
        scanner.close();
    }
}