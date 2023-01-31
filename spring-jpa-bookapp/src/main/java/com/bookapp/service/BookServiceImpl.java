/**
 * 
 */
package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class BookServiceImpl implements IBookService{

	private IBookRepository bookRepository;
	
	/**
	 * @param bookRepository the bookRepository to set
	 */
	@Autowired
	public void setBookRepository(IBookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public void addBook(Book book) {
		//if the current id is not there it will create a new row
		bookRepository.save(book);
		
	}

	@Override
	public void updateBook(Book book) {
		//if id is there it will update
		//if id is not there it will create a new row
		bookRepository.save(book);
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);
	}

	@Override
	public Book getById(int bookid) {
		// TODO Auto-generated method stub
		return bookRepository
				.findById(bookid)
				.get();
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookRepository.readByCategory(category);
	}

	@Override
	public List<Book> getByPrice(double price) {
		// TODO Auto-generated method stub
		return bookRepository.getByPriceLessThan(price);
	}

	@Override
	public List<Book> getByAuthorAndCategory(String author, String category) {
		// TODO Auto-generated method stub
		return bookRepository.findByAuthorAndCategory(author, category);
	}

	@Override
	public List<Book> getByTitleOrAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return bookRepository.readByTitleOrAuthor(title, author);
	}

	
	//custom queries
	@Override
	public List<Book> getByPriceAuth(double cost, String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByPriceAuth(cost, author);
	}

	@Override
	public List<Book> getByCatAndAuth(String category, String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByCatAndAuth(category, author);
	}

	@Override
	public List<Book> getBookByAuth(String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByAuth(author);
	}

	//native
	@Override
	public List<Book> getBookByCatPrice(String category,double price) {
		// TODO Auto-generated method stub
		return bookRepository.findBookByCatPrice(category,price);
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return bookRepository.getTotalCount();
	}

	@Override
	public List<Book> getBookByMinPrice() {
		// TODO Auto-generated method stub
		return bookRepository.findByMinPrice();
	}

	@Override
	public List<Book> getBookByTitleAuth(String title, String author) {
		// TODO Auto-generated method stub
		return bookRepository.findBookByTitleAuth(title, author);
	}

	@Override
	@Transactional
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		bookRepository.updateBook(bookId, price);
		
	}

}
