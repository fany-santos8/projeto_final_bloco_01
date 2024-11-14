package livraria.controller;

import java.util.ArrayList;
import java.util.List;

import livraria.model.Livro;
import livraria.repository.LivroRepository;

public class LivroController implements LivroRepository {
	private List<Livro> livros = new ArrayList<>();

	@Override
	public void adicionar(Livro livro) {
		livros.add(livro);
	}

	@Override
	public void listarTodos() {
		for (var livro : livros) {
			livro.visualizar();

		}
	}

	@Override
	public void remover(String nome) {
		var livro = buscarNaCollection(nome);

		if (livro != null) {
			if (livros.remove(livro) == true)
				System.out.println("\nO livro " + nome + " foi deletado com sucesso!");
		} else
			System.out.println("\nO livro " + nome + " não foi encontrado!");
	}

	@Override
	public void buscarPorNome(String nome) {
		var livro = buscarNaCollection(nome);
		if (livro != null) {
			livro.visualizar();
			System.out.println("O livro " + livro + " foi encontrado!");

		} else {
			System.out.println("O livro não foi encontrado!");
		}
	}

	@Override
	public void atualizar(Livro livro) {
		var buscaLivro = buscarNaCollection(livro.getNome());

		if (buscaLivro != null) {
			livros.set(livros.indexOf(buscaLivro), livro);
			System.out.println("\nO livro " + livro.getNome() + "foi atualizada com sucesso!");
		} else
			System.out.println("\nO livro " + livro.getNome() + "não foi encontrada!");

	}

	public Livro buscarNaCollection(String nome) {
		for (var livro : livros) {
			if (livro.getNome() == nome) {
				return livro;
			}
		}
		return null;
	}
}
