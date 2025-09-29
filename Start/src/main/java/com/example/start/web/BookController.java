package com.example.start.web;

import com.example.start.model.Book;
import com.example.start.service.impl.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public String getAllBooks(Model model){
        model.addAttribute("books", bookService.listAll());
        return "list";
    }
    @PostMapping("/createBook")
    public String create(@RequestParam String title,  @RequestParam String color){
        bookService.create(title,color);
        return "redirect:/books";
    }

    @PostMapping("/updatebook/{id}")
    public String update( @PathVariable Long id, @RequestParam String title, @RequestParam String color){
        bookService.update(id,title,color);
        return "redirect:/books";
    }

    @PostMapping("/DeleteBook/{id}")
    public String delete( @PathVariable Long id){
        bookService.delete(id);
        return "redirect:/books";
    }
}
