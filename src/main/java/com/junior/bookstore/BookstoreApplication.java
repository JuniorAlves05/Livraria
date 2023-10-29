package com.junior.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.junior.bookstore.domain.Categoria;
import com.junior.bookstore.domain.Livro;
import com.junior.bookstore.repositories.CategoriaRepository;
import com.junior.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"informatica", "Livro de TI");
		Categoria cat2 = new Categoria(null,"Infantil","Livro De Criança");
		Categoria cat3 = new Categoria(null,"Tarzan","Livro De Criança");
		
		Livro l1 = new Livro(null, "Clean code", "Junior", "Loren ipsum", cat1);
		Livro l2 = new Livro(null,"Rei Leão","Boroga","Pixar",cat2);
		Livro l3 = new Livro(null,"Tarzan","Junior","Pixar",cat3);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2,l3));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3));
		
	}

}