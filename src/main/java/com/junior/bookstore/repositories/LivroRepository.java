package com.junior.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junior.bookstore.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, String> {
	
	//A primeira informação é a classe que vamos nos comunicar
	//A segunuda opção é a variavel da classe Categoria, no caso é Integer
		

}
