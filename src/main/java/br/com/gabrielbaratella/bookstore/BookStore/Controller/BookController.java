package br.com.gabrielbaratella.bookstore.BookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.Book;
import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.MyBookList;
import br.com.gabrielbaratella.bookstore.BookStore.service.BookService;
import br.com.gabrielbaratella.bookstore.BookStore.service.MyBookListService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private MyBookListService myBookService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/my_books")
	public String myBooks(Model model) {
		
		List<MyBookList> list = myBookService.getAllMyBooks();
		
		model.addAttribute("book", list);
		
		return "myBooks";
	}
	
	@GetMapping("/available_books")
	public ModelAndView availableBooks() {
		List<Book> listaDeLivros = service.getAllBook();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("availableBooks");
		mav.addObject("book", listaDeLivros);
		return mav;
	}
	
	@PostMapping("/save")
		public String addBook(@ModelAttribute Book b) {
			service.save(b);
			return "redirect:/available_books";
		}
	
	@RequestMapping("/myList/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Book b = service.getBookById(id);
		MyBookList mb = new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
		myBookService.saveMyBook(mb);
		return "redirect:/my_books";
	}
	
	@RequestMapping("/editBook/{id}")
		public String editBook(@PathVariable("id") int id, Model model) {
		Book b = service.getBookById(id);
		model.addAttribute("book", b);
		return "bookEdit";
	}

	
}
