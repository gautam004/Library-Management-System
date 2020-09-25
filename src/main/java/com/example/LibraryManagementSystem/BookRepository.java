package com.example.LibraryManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Books, Integer> {

    @Query(value = "select * from books b where b.book_Code=:bookCode", nativeQuery = true)
    public Books findByBookCode(String bookCode);

    @Query(value = "select * from books b where b.book_author=:author", nativeQuery = true)
    public List<Books> findBookByAuthor(String author);

    @Query(value = "select * from books b where b.book_title=:title", nativeQuery = true)
    public List<Books> findBookByTitle(String title);

    @Query(value = "select * from books", nativeQuery = true)
    public List<Books> fetchAllBooks();

}
