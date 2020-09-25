package com.example.LibraryManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Books, Integer> {

    @Query(value = "select * from Books b where b.bookCode=:bookCode", nativeQuery = true)



}
