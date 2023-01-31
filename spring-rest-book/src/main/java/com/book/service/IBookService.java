/**
 * 
 */
package com.book.service;

import java.util.List;

import com.book.model.Book;

/**
 * @author BabaFakruddinDharuba
 *
 */
public interface IBookService {
	List<Book> getByAuthor(String author);
	
	List<Book> getByCatAuth(String category,String author);
	
	Book getById(int bookId);
	
	List<Book> getAll();
	
	List<Book> getByPrice(double price);
}
