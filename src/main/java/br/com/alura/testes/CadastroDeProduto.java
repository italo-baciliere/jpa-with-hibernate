package br.com.alura.testes;

import java.math.BigDecimal;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class CadastroDeProduto {

	public static void main(String[] args) {		
		
		EntityManager em = JPAUtil.getEntityManager();
		
		
		Categoria categoria = new Categoria("CELULAR");
		
		Produto produto = new Produto("Smartphone Xiaomi",
				  "128GB",
				  new BigDecimal("2487"),
				  categoria);
		
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);
		
		
		em.getTransaction().begin();
		
		categoriaDao.Cadastrar(categoria);
		produtoDao.Cadastrar(produto);		
		
		em.getTransaction().commit();		
		em.close();		
	}

}
