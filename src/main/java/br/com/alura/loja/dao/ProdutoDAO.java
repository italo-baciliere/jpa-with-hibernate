package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Produto;
import jakarta.persistence.EntityManager;

public class ProdutoDAO {

	private EntityManager em;
	
	public ProdutoDAO(EntityManager em) {
		this.em = em;
	}
	
	public void Cadastrar(Produto produto) {
		this.em.persist(produto);
	}
	
}
