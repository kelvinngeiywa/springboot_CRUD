package com.kelvin.spring_crud.services;

import com.kelvin.spring_crud.entities.Book;

import com.kelvin.spring_crud.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository _bookRepository;
//    private final List<Book> books=new ArrayList<>();
//    private Long nextId = 1L;

    public BookService(BookRepository bookRepository){
        this._bookRepository=bookRepository;

    }

    public List<Book> getAllBooks(){
        return _bookRepository.findAll();
    }

    public String addBook(Book newBook){
        _bookRepository.save(newBook);
        return "Book added successfully!!";
    }

    public Book getBookById(Long id){
        return _bookRepository.findById(id).orElseThrow(()->new IllegalStateException(id + " not found"));
    }

    public String updateBook(Long id,Book updateBook){
        Book existingBook= _bookRepository.findById(id).orElseThrow(()->new IllegalStateException(id + " not found"));

        existingBook.setTitle(updateBook.getTitle());
        existingBook.setAuthor(updateBook.getAuthor());
        existingBook.setPrice(updateBook.getPrice());

        _bookRepository.save(existingBook);
        return "Book updated successfully!!";
    }

    public String deleteBook(Long id)
    {
        if(!_bookRepository.existsById(id)){
            return "Book wit id "+id +" not found";
        }
        _bookRepository.deleteById(id);
        return "Book deleted successfully";
    }



}
