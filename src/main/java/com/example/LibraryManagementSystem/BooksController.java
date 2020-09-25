package com.example.LibraryManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BooksController {

    @Autowired
    BookRepository repository;

    //search book by bookCode
    @GetMapping("/books/bookCode/{bookCode}")
    public Books findBookByCode(@PathVariable String bookCode){
        return repository.findByBookCode(bookCode);
    }

    //search book by author
    @GetMapping("/books/author/{author}")
    public List<Books> findBookByAuthor(@PathVariable String author){
        return repository.findBookByAuthor(author);
    }

    //search book by title
    @GetMapping("/books/title/{title}")
    public List<Books> findBookByTitle(@PathVariable String title){
        return repository.findBookByTitle(title);
    }

    //fetch all books
    @GetMapping("/books")
    public List<Books> fetchAllBooks(){
        return repository.fetchAllBooks();
    }
}
