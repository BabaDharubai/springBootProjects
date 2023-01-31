/**
 * 
 */
package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

/**
 * @author BabaFakruddinDharuba
 *
 */
//@RestController
@RequestMapping("book-api")
public class BookController {
	
	IBookService bookService;

	/**
	 * @param bookService the bookService to set
	 */
	@Autowired
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping("/books")
	void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}

	@PutMapping("/books")
	void updateBook(@RequestBody Book book)//check passing parameter
	{
		bookService.updateBook(book);
	}

	@DeleteMapping("/books/{bookId}")
	void deleteBook(@PathVariable("bookId") int bookId) {
		bookService.deleteBook(bookId);
	}


	@GetMapping("/books/{bookId}")
	Book getById(@PathVariable("bookId") int bookid) {
		return bookService.getById(bookid);
	}

	@GetMapping("/books")
	List<Book> getAll(){
		return bookService.getAll();
	}

	@GetMapping("/books/author/{author}")
	List<Book> getByAuthor(@PathVariable("author") String author){
		return bookService.getByAuthor(author);
	}

	@GetMapping("/books/category/{category}")
	List<Book> getByCategory(@PathVariable("category") String category){
		return bookService.getByCategory(category);
	}

	@GetMapping("/books/price/{price}")
	List<Book> getByPrice(@PathVariable("price") double price){
		return bookService.getByPrice(price);
	}
	
//	List<Book> getByAuthorAndCategory(String author,String category){
//		return bookService.getByAuthorAndCategory(author, category);
//	}
//	
//	List<Book> getByTitleOrAuthor(String title,String author){
//		
//	}
	
	
	//custom query
	@GetMapping("books/price/{price}/author/{author}")
	List<Book> getByPriceAuth(@PathVariable("price") double cost,@PathVariable("author") String author){
		return bookService.getByPriceAuth(cost, author);
	}
	
	@GetMapping("books/category/{category}/author/{author}")
	List<Book> getByCatAndAuth(@PathVariable("category") String category,@PathVariable("author")String author){
		return bookService.getByCatAndAuth(category, author);
	}
	
//	List<Book> getBookByAuth(String author){
//		return bookService.getBookByAuth(author);
//	}
	
}
