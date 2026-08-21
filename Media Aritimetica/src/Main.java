import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int Nota1, Nota2, Nota3, MA;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        Nota1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: ");
        Nota2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: ");
        Nota3 = scanner.nextInt();
        MA= Nota1 + Nota2 + Nota3/3;
        System.out.println("A sua media aritimetica é: " + MA);

        scanner.close();
        }
    }