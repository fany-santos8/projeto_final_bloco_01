package livraria;

import java.util.Scanner;

import livraria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*******************************************************");
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*                  LIBRARY FLY                        *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*            1 - Criar conta                          *");
			System.out.println("*            2 - Atualizar os Dados                   *");
			System.out.println("*            3 - Adicionar Livro                      *");
			System.out.println("*            4 - Listar Todos os Livros               *");
			System.out.println("*            5 - Remover Livro                        *");
			System.out.println("*            6 - Sair                                 *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("Entre com a opção desejada:                            ");
			System.out.println("                                                       ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nLibrary Fly - Livros que dão asas a sua imaginação!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Criar Conta\n\n");

				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o Nome Completo: ");
				
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o número de contato: ");
			
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o endereço: ");
				
	
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Atualizar os Dados");

				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Digite o seu Nome: ");
				

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAdicionar livro");

				System.out.println(Cores.TEXT_WHITE_BOLD + "\nDigite o Nome do Livro: ");
				

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Listar Livros ");

				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nRemover Livro ");

				System.out.println(Cores.TEXT_WHITE_BOLD + "\nDigite o Nome do Livro ");

				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saindo...");
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
