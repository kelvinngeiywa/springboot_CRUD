package com.kelvin.spring_crud.controllers;

import com.kelvin.spring_crud.entities.Book;
import com.kelvin.spring_crud.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BooksController {

    private final BookService _bookServices;

    public BooksController(BookService bookService){
        this._bookServices=bookService;
    }

    @GetMapping
    public List<Book> getBooks(){
        return _bookServices.getAllBooks();
    }

    @PostMapping
    public String addBook(@RequestBody Book newBook){
        return _bookServices.addBook(newBook);

    }

//    @GetMapping("{id}")
//    public Book getBookById(@RequestParam Long id){
//        return _bookServices.getBookById(id);
//    }

    @GetMapping("{id}")
    public Book getBookById(@PathVariable Long id){
        return _bookServices.getBookById(id);
    }

    @PutMapping("{id}")
    public String updateBook(@PathVariable Long id, @RequestBody Book updatedBook){
        return _bookServices.updateBook(id,updatedBook);

    }

    @DeleteMapping("{id}")
    public String deleteBook(@PathVariable Long id){
        return _bookServices.deleteBook(id);
    }


}
