package com.nagarro.Assignment6;


import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    public List<Book> listAll() {
        return bookRepo.findAll();
    }

    public void save(Book book) {
        bookRepo.save(book);
    }

    public Book get(Long bookCode) {
        return bookRepo.findById(bookCode).get();
    }

    public void delete(Long bookCode) {
        bookRepo.deleteById(bookCode);
    }
}
