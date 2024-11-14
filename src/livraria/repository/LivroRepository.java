package livraria.repository;

import livraria.model.Livro;
import java.util.List;

public interface LivroRepository {
	void adicionar(Livro livro);

	public void listarTodos();

	public void remover(String livro);

	public void atualizar(Livro livro);

	public void buscarPorNome(String livro);
}
