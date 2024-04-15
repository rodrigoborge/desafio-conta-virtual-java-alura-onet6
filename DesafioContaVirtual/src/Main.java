
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tela abertura
        String nameBank = """
                 __                   __
                |  |--..---.-..-----.|  |--. .---.-..-----..-----.
                |  _  ||  _  ||     ||    <  |  _  ||  _  ||  _  |
                |_____||___._||__|__||__|__| |___._||   __||   __|
                                                    |__|   |__|
                """;
        System.out.printf (nameBank);

        //Variáveis
        String nomeCliente;
        String tipoConta;
        double saldoCliente;
        double recebeValor;
        double transfereValor;
        int escolhaMenu;
        Scanner leitura = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = leitura.nextLine();
        System.out.println("Qual o tipo da conta: ");
        tipoConta = leitura.nextLine();
        System.out.println("Digite o saldo inicial: ");
        saldoCliente = leitura.nextDouble();

        //Retorno dos dados
        System.out.println("***************************************");
        System.out.println("Nome:               " + nomeCliente);
        System.out.println("Tipo de conta:      " + tipoConta);
        System.out.println("Saldo inicial:      " + saldoCliente);
        System.out.println("***************************************");

        System.out.println("           ESCOLHA UMA OPÇÃO           ");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - Transferir Valor");
        System.out.println("4 - Sair");
        escolhaMenu = leitura.nextInt();

        //Menu de operações
        if (escolhaMenu < 4){
            System.out.println("Seu saldo é de: " + saldoCliente);
        } else if (escolhaMenu == 2) {
            System.out.println("Digite o valor a receber: ");
            recebeValor = leitura.nextDouble();
            saldoCliente = saldoCliente + recebeValor;
            System.out.println("Seu saldo atualizado é de: " + saldoCliente);
        } else if (escolhaMenu == 3) {
            System.out.println("Digite o valor para tranferência: ");
            transfereValor = leitura.nextDouble();
                if (saldoCliente <= transfereValor){
                    System.out.println("Não há saldo suficiente para fazer essa " +
                        "transferência");
            }   else {
                    saldoCliente = saldoCliente - transfereValor;
            }
            System.out.println("Seu saldo atualizado é de: " + saldoCliente);
        } else {
            System.out.println("Saindo...");
        }
    }
}