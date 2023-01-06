package br.com.alura.testes;

import java.math.BigDecimal;

import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class CadastroDeProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNome("Smartphone Xiaomi");
		produto.setDescricao("128GB");
		produto.setPreco(new BigDecimal("2487"));
				 
		EntityManager em = JPAUtil.getEntityManager(); 
		ProdutoDAO dao = new ProdutoDAO(em);
				
		em.getTransaction().begin();
		dao.Cadastrar(produto);		
		em.getTransaction().commit();
		em.close();
	}

}
