package org.example.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
public class UserService {

  @Getter
  @Setter
  @AllArgsConstructor
  public class User {
    private String name;
    private int age;
    private String address;
  }

  private User user;

  public UserService(){
    this.user = new User("Mehul" , 20, "Boston");
  }

  public void login(){
    System.out.println("Logging in... ");
  }

  public void logout() throws Exception{
    System.out.println("Logged out...");
    throw new Exception("Unable to log out");
  }
}
