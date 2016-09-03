package br.edu.iftm.model.dao;

import java.util.List;

import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Categoria;

public interface ICategoriaDao {

	void atualizar(Categoria categoria);

	void excluir(Categoria categoria);

	List<Categoria> buscar(Categoria categoria);

	void salvar(Categoria categoria);

}