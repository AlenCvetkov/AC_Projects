package com.example.start.service.impl;

import com.example.start.model.Book;
import com.example.start.repo.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;
    @Override
    public Optional<Book> findById(Long id) {
        return  bookRepository.findById(id);
    }

    @Override
    public List<Book> listAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book create(String title, String color) {
        bookRepository.save(new Book(title,color));
        return null;
    }

    @Override
    public Book update(Long id, String title, String color) {
      Optional<Book> b =  this.findById(id);
        b.get().setTitle(title);
        b.get().setColor(color);
        return this.bookRepository.save(b.get());
    }

    @Override
    public Book delete(Long id) {
        Optional<Book> b =  this.findById(id);
        this.bookRepository.delete(b.get());
        return b.get();
    }
}
