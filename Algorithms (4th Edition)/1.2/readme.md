# Each time that a client uses new(), the system

- Allocates memory space for the object
- Invokes the constructor to initialize its value
- Returns a reference to the object

---

- If x and y are variables of a primitive type, then the assignment x = y copies the value of y to x.
- For reference types, the reference is copied (not the value). Aliasing is a common source of bugs in Java programs, as illustrated by the following example:

```java
Counter c1 = new Counter("ones");
c1.increment();
Counter c2 = c1;
c2.increment();
System.out.println(c1); //"2 ones"
```

---

# abstract data types (ADT)

# When we create an array of objects, we do so in two steps:

- Create the array, using the bracket syntax for array constructors.
- Create each object in the array, using a standard constructor for each.

- An array of objects in Java is an array of references to objects, not the objects themselves. If the objects are large, then we may gain efficiency by not having to move them around, just their references. If they are small, we may lose efficiency by having to follow a reference each time we need to get to some information.

---

# 4 inherited methods toString(), compareTo(), equals(), and hashCode()

- split() example on page 81 uses the argument "\\s+", which means “one or more tabs, spaces, newlines, or returns.”

---

# instance variables

- we declare instance variables in much the same way as we declare local variables.
- There is a critical distinction between `instance variables` and the `local variables` within a static method or a block that you are accustomed to: there is just one value corresponding to each local variable at a given time, but there are numerous values corresponding to each instance variable (one for each object that is an instance of the data type).

---

# Constructors.

- Every Java class has at least one `constructor` that establishes an object’s identity. A constructor is like a `static method`, but it can refer directly to instance variables and has `no return value`.
- If no other constructor is defined, a default no-argument constructor is implicit, has no arguments, and initializes instance values to default values.

---

# Instance methods.

---

# Scope

- Java code that we write to implement instance methods uses three kinds of variables:
  - Parameter variables
  - Local variables
  - Instance variables

---

# Instance variables belong to the class

---

# Implement a Java class that meets the API specifications.

- First we choose the instance variables, then we write constructors and the instance methods.

---

# Data-type design

# Encapsulation

# Interface inheritance

```java
public class Date implements Datable {
    // implementation code (same as before)
}
```

---

```java
interface                       methods section
-------------------------------------------------------------
java.lang.Comparable            compareTo()
java.util.Comparator            compare()

java.lang.Iterable              iterator()
java.util.Iterator              hasNext(),  next(), remove()
```

---

# Implementation inheritance.

- every class is a subtype of Java’s Object class. This structure enables the “convention” that every class includes an implementation of `getClass()`, `toString()`, `equals()`, `hashCode()`, and several other methods

---

# Equality.

- What does it mean for two objects to be equal? If we test equality with (a == b)whereaandbarereferencevariablesofthesametype,we are testing whether they have the same identity: whether the references are equal.
- Note that we can use == to tell us whether two objects of type Class are equal because getClass() is guaranteed to return the same reference for all objects in any given class.

---

# Memory management.

# Immutability.

---

# final

- When you declare a variable to be final, you are promising to assign it a value only once, either in an initializer or in the constructor. Code that could modify the value of a final variable leads to a compile-time error.

---

# immutability

- The down- side of immutability is that a new object must be created for every value.

---

# Whythedistinctionbetweenprimitiveandreferencetypes? Why not just have reference types?

- A. Performance.Java provides the reference types Integer,Double,and so forth that correspond to primitive types that can be used by programmers who prefer to ignore the distinction. Primitive types are closer to the types of data that are supported by computer hardware, so programs that use them usually run faster than programs that use corresponding reference types.

---

# What happens if I forget to use new when creating an object?

- cannot find symbol error

---

# What happens if I forget to use new when creating an array of objects ?

- You need to use new foreach object that you create,so when you create an array of N objects, you need to use new N+1 times: once for the array and once for each of the objects.

```java
    Counter[] a;
    a[0] = new Counter("test");
```

---

# How do I make a class immutable?

- To ensure immutability of a data type that includes an instance variable of a mutable type, we need to make a local copy, known as a defensive copy. And that may not be enough. Making the copy is one challenge; ensuring that none of the instance methods change values is another.
