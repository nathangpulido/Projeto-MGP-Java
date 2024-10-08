import java.util.ArrayList;
import java.util.Scanner;

class Caneca {
    private String nome;
    private int quantidade;

    public Caneca(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Caneca{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}

public class GerenciamentoEstoque {
    private static ArrayList<Caneca> estoque = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGerenciamento de Estoque de Canecas");
            System.out.println("1. Cadastrar novo pedido");
            System.out.println("2. Gerar relatório de vendas");
            System.out.println("3. Consultar Estoque");
            System.out.println("4. Cadastrar produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    Cadastrarnovopedido(scanner);
                    break;
                case 2:
                    Gerarrelatóriodevendas(scanner);
                    break;
                case 3:
                    Consultarestoque(scanner);
                    break;
                case 4:
                    Cadastrarproduto(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void Cadastrarnovopedido(Scanner scanner) {
        System.out.print("Nome da Caneca: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        Novopedido caneca = new Novopedido(nome, quantidade);
        estoque.add(caneca);
        System.out.println("Pedido cadastrado com sucesso!");
    }

    private static void Gerarrelatoriodevendas(Scanner scanner) {
        System.out.print("Gerando Relatório de Vendas");

    }

    private static void Consultarestoque(Scanner scanner) {
        System.out.print("Consultando Estoque");
    }

    private static void cadastrarproduto() {
            System.out.println("Digite o Produto");
    }
}
