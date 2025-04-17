import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CódigoCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> contatos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("\n1. Adicionar novo contato");
            System.out.println("2. Listar todos os contatos");
            System.out.println("3. Remover contato");
            System.out.println("4. Buscar contato pelo nome");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    ArrayList<String> contato = new ArrayList<>();
                    contato.add(nome);
                    contato.add(telefone);

                    contatos.add(contato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Contatos:");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (ArrayList<String> c : contatos) {
                            System.out.println("Nome: " + c.get(0) + " | Telefone: " + c.get(1));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).get(0).equalsIgnoreCase(nomeRemover)) {
                            contatos.remove(i);
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    boolean encontrado = false;

                    for (ArrayList<String> c : contatos) {
                        if (c.get(0).equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Telefone de " + c.get(0) + ": " + c.get(1));
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando agenda");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
