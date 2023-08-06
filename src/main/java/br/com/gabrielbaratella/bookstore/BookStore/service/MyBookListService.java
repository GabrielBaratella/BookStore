package br.com.gabrielbaratella.bookstore.BookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.MyBookList;
import br.com.gabrielbaratella.bookstore.BookStore.repository.MyBooksRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBooksRepository myBook;
	
	public void saveMyBook(MyBookList myBookList) {
		myBook.save(myBookList);
	}
}
