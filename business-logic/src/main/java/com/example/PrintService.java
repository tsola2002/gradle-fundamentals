package com.example;

public class PrintService {

  public void print(MessageModel model) {
    String message = model.getMessage();
    System.out.println(message);
  }

}
