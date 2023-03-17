import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SaqueDeposito sq1 = new SaqueDeposito();

        System.out.println("Digite um valor para realizar o saque ou o depósito ");
        sq1.setValor(sc.nextDouble());

        int ds = 1;
        System.out.println("Se você deseja realizar depósito, digite 1, se desejar realizar depósito, digite 2");
        sq1.getSaquedeposito(sc.nextInt());
        switch (ds){
            case 1:
                System.out.println("Realizar depósito");
                break;
            case 2:
                System.out.println("Realizar saque");
        }
    }
}