package br.com.alura.testes;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CadastroDeProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNome("Smartphone Xiaomi");
		produto.setDescricao("128GB");
		produto.setPreco(new BigDecimal("2487"));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction();
		em.close();
	}

}
