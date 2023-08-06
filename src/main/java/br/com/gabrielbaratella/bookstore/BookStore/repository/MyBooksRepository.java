package br.com.gabrielbaratella.bookstore.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gabrielbaratella.bookstore.BookStore.Controller.Entity.MyBookList;

@Repository
public interface MyBooksRepository extends JpaRepository<MyBookList, Integer>{

}
