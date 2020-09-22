package com.example.LibraryManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Integer> {


}
