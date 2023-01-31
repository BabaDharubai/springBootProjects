/**
 * 
 */
package com.book.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.book.model.Book;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Component
public class BookDetails {
	
	public List<Book> getBooks(){
		return showBooks();
	}
	
	public List<Book> showBooks(){
		return Arrays.asList(
				new Book(1,"Secret","Rhonde","selfhelp",350),
				new Book(2,"Money","Helum","selfhelp",250),
				new Book(3,"AtomicHabits","Bhargav","psychology",400),
				new Book(4,"Java","Avinash","programming",500),
				new Book(5,"Html","Praveen","programming",999)
				);
	}
}
