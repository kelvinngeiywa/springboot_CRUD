package com.kelvin.spring_crud.repository;

import com.kelvin.spring_crud.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
