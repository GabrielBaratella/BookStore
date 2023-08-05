package br.com.gabrielbaratella.bookstore.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	
}
