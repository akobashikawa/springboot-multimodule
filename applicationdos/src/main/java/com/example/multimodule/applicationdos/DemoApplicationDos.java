package com.example.multimodule.applicationdos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
public class DemoApplicationDos {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplicationDos.class, args);
  }
}