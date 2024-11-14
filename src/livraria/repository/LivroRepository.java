package livraria.repository;

import livraria.model.Livro;
import java.util.List;

public interface LivroRepository {
	void adicionar(Livro livro);

	List<Livro> listarTodos();

	boolean remover(String livro);

	public void atualizar(Livro livro);

	Livro buscarPorNome(String livro);
}
