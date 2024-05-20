package org.example.movieist;

import jdk.jfr.Registered;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class MovieistApplication {

  public static void main(String[] args) {
    SpringApplication.run(MovieistApplication.class, args);
  }

  @GetMapping("/")
  public String apiRoot() {
    return "hello world";
  }
}
