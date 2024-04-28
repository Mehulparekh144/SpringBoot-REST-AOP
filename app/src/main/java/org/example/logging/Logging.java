package org.example.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component // This will make the class accessible in the IOC container using Autowire
public class Logging {
  /*
  The advice runs before the library code (UserService)
   */
  @Before("execution(public void org.example.service.UserService.login())")
  public void loggingAdvice1(){
    System.out.println("Before advice for logIn is executed.");
  }

  @After("execution(public void org.example.service.UserService.login())")
  public void loggingAdvice2(){
    System.out.println("After advice for logIn is executed.");
  }

  @Around("execution(public void org.example.service.UserService.login())")
  public void loggingAdvice3(){
    System.out.println("Around advice for logIn is executed.");
  }

  @AfterThrowing("execution(public void org.example.service.UserService.logout())")
  public void loggingAdvice4(){
    System.out.println("AfterThrowing advice for logOut is executed.");
  }

  @AfterReturning("execution(public void org.example.service.UserService.logout())")
  public void loggingAdvice5(){
    System.out.println("AfterReturning advice for logOut is executed.");
  }

  @Pointcut("execution(public void org.example.service.UserService.*(..)")
  public void pointCut(){
  }

  @Pointcut("execution(public void org.example.service.UserService.*(..)")
  public void pointCut1(){
  }

  @Before("pointCut() || pointCut()")
  public void loggingAdvice6(){
    System.out.println("Before advice for all methods of UserService is executed.");
  }






}
