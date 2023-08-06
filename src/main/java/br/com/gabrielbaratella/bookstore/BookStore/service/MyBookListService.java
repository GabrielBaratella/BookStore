package br.com.gabrielbaratella.bookstore.BookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.MyBookList;
import br.com.gabrielbaratella.bookstore.BookStore.repository.MyBooksRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBooksRepository myBook;
	
	
	public void saveMyBook(MyBookList myBookList) {
		myBook.save(myBookList);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myBook.findAll();
	}
}
