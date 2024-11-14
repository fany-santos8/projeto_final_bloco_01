package livraria;

import java.util.ArrayList;
import java.util.Scanner;

import livraria.controller.LivroController;
import livraria.model.Livro;
import livraria.util.Cores;

public class Menu {
	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		LivroController controller = new LivroController();
		ArrayList<Livro> carrinho = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		System.out.println("\n Criar Contas\n");

		while (true) {
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*******************************************************");
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*                  LIBRARY FLY                        *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*            1 - Criar Livro                          *");
			System.out.println("*            2 - Buscar Livro                         *");
			System.out.println("*            3 - Listar Todos os Livros               *");
			System.out.println("*            4 - Remover Livro                        *");
			System.out.println("*            5 - Sair                                 *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("Entre com a opção desejada:                            ");
			System.out.println("                                                       ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("\nLibrary Fly - Livros que dão asas a sua imaginação!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Criar Livro\n\n");

				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o Nome do Livro: ");
				leia.skip("\\R?");
				String nome = leia.nextLine();
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o Autor do Livro: ");
				String autor = leia.nextLine();
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite a Editora do Livro: ");
				String editora = leia.nextLine();
				Livro livro = new Livro(nome, autor, editora);
				controller.adicionar(livro);
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBuscar livro por nome ");

				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o Nome do Livro: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				controller.buscarPorNome(nome);
				System.out.println(Cores.TEXT_WHITE_BOLD + "Livro adicionado com sucesso!");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nListar Livros ");
				controller.listarTodos();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nRemover Livro ");

				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o Nome do Livro: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				controller.remover(nome);
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saindo...");
				leia.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!" + Cores.TEXT_RESET);
			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Estefany Cristina Santana dos Santos");
		System.out.println("Estefany Cristina Santana dos Santos - estefany_fanysantos@hotmail.com");
		System.out.println("github.com/fany-santos8/projeto_final_bloco01");
		System.out.println("*********************************************************");
	}
}
