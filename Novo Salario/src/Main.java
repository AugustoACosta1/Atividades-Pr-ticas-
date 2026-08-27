import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Salario, Aumento,  NovoSalario;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salario do funcionário: R$ ");
        Salario = entrada.nextDouble();

        Aumento = Salario * 0.25;
        NovoSalario = Salario + Aumento;

        System.out.printf("Novo salario: R$ %.2f%n", NovoSalario);

        entrada.close();
    }
}