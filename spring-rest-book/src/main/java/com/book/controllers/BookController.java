/**
 * 
 */
package com.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.service.IBookService;

/**
 * @author BabaFakruddinDharuba
 *
 */
@RestController
public class BookController {
	
	private IBookService bookService;
	

	/**
	 * @param bookService the bookService to set
	 */
	@Autowired
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
	List<Book> getAll(){
		return bookService.getAll();
	}

	//http://localhost:8080/books/author/Rhonde
	@GetMapping("/books/author/{nauthor}")
	List<Book> getByAuthor(@PathVariable("nauthor") String author){
		return bookService.getByAuthor(author);
	}

	//http://localhost:8080/books/category/selfhelp/author/Baba
	@GetMapping("/books/category/{category}/author/{author}")
	List<Book> getByCatAuth(@PathVariable("category") String category,@PathVariable("author") String author){
		return bookService.getByCatAuth(category, author);
	}

	//http://localhost:8080/books/bookId?bookId=3
	@GetMapping("/books/bookId")
	Book getById(@RequestParam("bookId") int bookId) {
		return bookService.getById(bookId);
	}

	

	//http://localhost:8080/books/lowprice?price=500
	@GetMapping("/books/lowprice")
	List<Book> getByPrice(@RequestParam("price")double price){
		return bookService.getByPrice(price);
	}
}
