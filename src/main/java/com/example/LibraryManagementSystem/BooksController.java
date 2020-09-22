package com.example.LibraryManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BooksController {

    @Autowired
    BookRepository repository;

    @GetMapping("/books/{bookCode}")
    public Books findBookByCode(@PathVariable int bookCode){

        Optional<Books> object = repository.findById(bookCode);
        if(object.isPresent()){
            return object.get();
        }
        System.out.println("Could not find the book");
        return null;

    }

}
