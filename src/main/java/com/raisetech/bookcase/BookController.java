package com.raisetech.bookcase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

  @GetMapping("/books")
  public List<String> books() {
    return List.of("a", "b", "c");
  }
}
