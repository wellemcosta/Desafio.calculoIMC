
import java.util.Scanner;

public class CalculodeIMC {
    // IMC é calculado dividindo o peso em kg pela altura ao quadrardo (em metros)

    public static void main (String[] args) {
        System.out.println ("Cálculo de IMC ");
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.println ("Digite sua altura: ");
        double altura = scanner.nextDouble();
        double imc;
        imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        





    }
    
}
