import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Faca seu cadastro bancario\n\n\nDigite seu nome: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Digite seu vinculo bancario: ");
        cliente.setVinculo(sc.nextLine());
        System.out.println("Digite seu CPF: ");
        cliente.setCpf(sc.nextLine());
        System.out.println("Digite seu Endereco: ");
        cliente.setEndereco(sc.nextLine());
        System.out.println("Digite sua idade: ");
        cliente.setIdade(sc.nextInt());

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("\n\n\nDados Bancarios\n");
        cc.imprimirDadosBancarios();
        System.out.println("\nConta Corrente");
        cc.imprimirRelatorio();

        System.out.println("Digite o valor de deposito para sua conta corrente: ");
        cc.depositar(sc.nextDouble());
        cc.imprimirRelatorio();

        System.out.println("Digite o valor de tranferencia para a sua conta poupanca: ");
        cc.transferir(sc.nextDouble(), poupanca);

        System.out.println("\n\n");

        System.out.println("Extrato Conta Corrente");
        cc.imprimirRelatorio();

        System.out.println("Extrato Conta Poupanca");
        poupanca.imprimirRelatorio();

    }
}