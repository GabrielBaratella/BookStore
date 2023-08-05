package br.com.gabrielbaratella.bookstore.BookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.Book;
import br.com.gabrielbaratella.bookstore.BookStore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public void save(Book b) {
		bookRepo.save(b);
	}
}	
