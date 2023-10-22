package com.junior.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junior.bookstore.domain.Categoria;

@Repository //	Fazendo comunicação com o banco de dados e persistindo as informações
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	//A primeira informação é a classe que vamos nos comunicar
	//A segunuda opção é a variavel da classe Categoria, no caso é Integer
	
	
	

}
