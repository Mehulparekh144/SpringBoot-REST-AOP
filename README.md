AOP is known as Aspect Oriented programming. Aspect-Oriented Programming (AOP) is indeed a powerful paradigm that complements object-oriented programming (OOP) by allowing developers to modularize cross-cutting concerns in software systems. Let's delve deeper into the concepts you've mentioned:

It is like a proxy but gives more abilities

For e.g. we use an external API and call its methods. But we want to perform certain actions before or after calling method. Since its a JAR, the methods cannot be injected. So here we use AOP concepts.
Before calling the library. I can say call this method `M()`  . We can also provide conditions here. These all things happen on **Runtime.**

![image](https://github.com/Mehulparekh144/SpringBoot-REST-AOP/assets/72097117/e5d95ac5-fcd8-4749-8f22-8b82a90f5743)


## Concepts

### JointPoints

JointPoints are specific points in the execution of a program where cross-cutting concerns can be applied. In AOP, these points are typically method invocations, although they can also include field accesses and exception handling blocks.

- **@Before**: This is an advice type in AOP that specifies code to be executed before a method invocation.
- **@After**: This advice type specifies code to be executed after a method invocation, regardless of its outcome (success or failure).

### PointCut

A PointCut defines a set of JointPoints where advice should be applied. It allows developers to specify which methods or join points in the codebase should be intercepted by the aspects.

AspectJ provides a variety of pointcut annotations to define join points in your application where cross-cutting concerns can be applied. Here's a comprehensive list of these annotations:

### Commonly Used

- **`@Before`:** Executes advice before a join point.
- **`@After`:** Executes advice after a join point (including if there was an exception thrown).
- **`@Around`:** Executes advice around a join point, allowing for manipulation of the join point's behavior.
- **`@AfterReturning`:** Executes advice after a successful method execution.
- **`@AfterThrowing`:** Executes advice after a method throws an exception.
- **`@Pointcut`:** Defines a pointcut expression that can be referenced by advice annotations.

### Other

- **`@DeclarePrecedence`:** Specifies the precedence order of aspects when multiple aspects are applied at a join point.
- **`@DeclareParents`:** Introduces interfaces to a class that match a pointcut expression.
- **`@DeclareError`:** Throws a checked exception at a join point matching the specified pointcut expression.
- **`@DeclareWarning`:** Issues a warning at a join point matching the specified pointcut expression.
- **`@DeclareAnnotation`:** Adds an annotation to matched join points.
- **`@DeclareSoft`:** Suppresses exceptions at join points matching the specified pointcut expression.
- **`@AroundInit`:** Executes advice around object initialization join points.
- **`@AroundExec`:** Executes advice around execution join points.
- **`@AroundHandler`:** Executes advice around handler join points.
- **`@AroundAdvice`:** Executes advice around advice join points.
- **`@AroundStaticInit`:** Executes advice around static initialization join points.

These are all the pointcut annotations available in AspectJ. Each annotation serves a specific purpose in defining cross-cutting concerns in your application.

### Weaving

Weaving is the process of integrating aspect code into the application code at specified join points. There are different types of weaving:

- **Compile-Time Weaving**: Aspect code is woven into the classes at compile time.
- **Load-Time Weaving**: Aspect code is woven into the classes at class loading time.
- **Runtime Weaving**: Aspect code is woven into the classes at runtime.

Runtime weaving is particularly useful when aspects need to be applied dynamically or when the codebase is not accessible during compile time.

### Compiler

In the context of AOP, the compiler is responsible for integrating aspect code into the application codebase. For example, in compile-time weaving, a special compiler or pre-processor is used to weave aspect code into the classes during the compilation process.

### Example

https://github.com/Mehulparekh144/SpringBoot-REST-AOP.git
