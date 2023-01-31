/**
 * 
 */
package com.book.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class BookServiceImpl implements IBookService{
	
	private BookDetails bookDetails;
	
	/**
	 * @param bookDetails the bookDetails to set
	 */
	@Autowired
	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDetails
				.getBooks()
				.stream()
				.filter(book->book.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
	}

	@Override
	public List<Book> getByCatAuth(String category, String author) {
		// TODO Auto-generated method stub
		return bookDetails
				.getBooks()
				.stream()
				.filter(book->book.getCategory().equalsIgnoreCase(category) && book.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
	}

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		return bookDetails
				.getBooks()
				.stream()
				.filter(book->book.getBookId()==bookId)
				.findFirst()
				.get();
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookDetails.getBooks();
	}

	@Override
	public List<Book> getByPrice(double price) {
		// TODO Auto-generated method stub
		return bookDetails
				.getBooks()
				.stream()
				.filter(book->book.getPrice()<=price)
				.collect(Collectors.toList());
	}
	
}
