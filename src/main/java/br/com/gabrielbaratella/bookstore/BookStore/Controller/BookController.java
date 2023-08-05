package br.com.gabrielbaratella.bookstore.BookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.Book;
import br.com.gabrielbaratella.bookstore.BookStore.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/available_books")
	public String availableBooks() {
		return "availableBooks";
	}
	
	@PostMapping("/save")
		public String addBook(@ModelAttribute Book b) {
			service.save(b);
			return "redirect:/available_books";
		}
	
}
