package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringJpaBookappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaBookappApplication.class, args);
	}

	private IBookService bookService;
	
	/**
	 * @param bookService the bookService to set
	 */
	@Autowired
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Book book=new Book(5,"atomicHabbits","unknown","selfhelp",1000);
		Book book=new Book(1,"5am club","Rhonde","selfhelp",500);
		Book book1=new Book(2,"Psychology of money","Hany","psychology",250);
		bookService.addBook(book);
		bookService.addBook(book1);
//		bookService.updateBook(book);
//		Book nbook=bookService.getById(3);
//		nbook.setPrice(5000);
//		bookService.updateBook(nbook);
//		bookService.deleteBook(2);
		
//		bookService.getByAuthor("Rhonde").forEach(System.out::println);
//		System.out.println();
//		bookService.getByCategory("Selfhelp").forEach(System.out::println);
//		System.out.println();
//		bookService.getByPrice(1500).forEach(System.out::println);
//		System.out.println();
//		bookService.getByAuthorAndCategory("Rhonde", "Selfhelp").forEach(System.out::println);
//		System.out.println();
//		bookService.getByTitleOrAuthor("sutar", "Rhone").forEach(System.out::println);
//		System.out.println();
//		bookService.getByPriceAuth(1000, "unknown").forEach(System.out::println);
//		System.out.println();
//		bookService.getByCatAndAuth("analysis", "Baba").forEach(System.out::println);
//		System.out.println();
//		bookService.getByAuthor("Baba").forEach(System.out::println);
//		System.out.println();
//		bookService.getBookByCatPrice("selfhelp",1000).forEach(System.out::println);
//		System.out.println();
////		bookService.getBookByMinPrice().forEach(System.out::println);
//		System.out.println();
//		System.out.println( bookService.getTotalCount());
//		System.out.println();
//		bookService.getBookByTitleAuth("money", "baba").forEach(System.out::println);
//		System.out.println();
//		bookService.updateBook(5, 200);
	}

}
