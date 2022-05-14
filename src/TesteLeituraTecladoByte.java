import java.util.Scanner;

public class TesteLeituraTecladoByte {

    public static void main(String[] args) {
        byte dadoDigitadoByte;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dado do tipo byte e aperte a tecla enter:");
        dadoDigitadoByte = scanner.nextByte();

        System.out.printf("O dado do tipo byte digitado foi: %d", dadoDigitadoByte);
    }
}
