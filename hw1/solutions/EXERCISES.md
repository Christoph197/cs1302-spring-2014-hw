
# EXERCISES.md - Homework Assignment 1

Name: Michael E. Cotterell (423)

## Lewis EX 1.1 (1 point)

**Give examples of two types of Java comments, and explain the differences
between them.**

 1. Comments beginning with <code>//</code> are single line comments.
 2. Comments beginning with <code>/*</code> and ending in <code>*/</code> are 
    multiline comments.
 3. Comments begining with <code>/**</code> and ending in <code>*/</code> are 
    JavDoc comments.

Note: Only two examples were required.

# Lewis EX 1.2 (1 point)

**Which of the following are not valid Java identifiers? Why?**

<strong>
 * <code>Factorial</code>
 * <code>anExtremelyLongIdentifierIfYouAskMe</code>
 * <code>2ndLevel</code>
 * <code>level2</code>
 * <code>MAX_SIZE</code>
 * <code>highest$</code>
 * <code>hook&ladder</code>
</strong>

The following two are not valid:
 * <code>2ndLevel</code>, because identifiers cannot begin with a number.
 * <code>hook&ladder</code>, because it contains an operator.

# Lewis EX 1.3 (1 point)

**Why are the following valid Java identifiers not considered good 
identifiers?**

 * <code>q</code>, because it doesn't specificy meaning.
 * <code>totVal</code>, because it uses shortened words.
 * <code>theNextValueInTheList</code>, becuase it's too long.

# Lewis EX 1.4 (1 point)

**Java is case-sensitive. What does that mean?**

That means that two variables or methods are different if they differ in case.

# Lewis EX 1.5 (1 point)

**What do we mean when we say that the English language is ambiguous? Give two
examples of ambiguity in the English language (other than the examples used in
this chapter), and explain the ambiguity. Why is ambiguity a problem for
programming languages?**

The english language is ambiguous because a sentence can often have two or more
different meanings.

Many different examples should be accepted here. Here is the one that I came
up with, "John told Steve the book was his."

Ambiguity is a problem for programming languages because if an instruction
could have two different meanings, a computer would not be able to determine
which one should be carried out.

# Lewis EX 1.6 (1 point)

**Categorize each of the following situations as a compile-time error, run-time
error, or logical error:**

<strong>
 * multiplying two numbers when you meant to add them
 * dividing by zero
 * forgetting a semicolon at the end of a programming statement
 * spelling a word wrong in the output
 * producing inaccurate results
 * typing a <code>{</code> when you should have typed a <code>(</code>
</strong>

Here are the corresponding error types:
 * logical error
 * run-time error
 * compile-time error
 * logical error
 * logical error
 * syntax error

# Lewis EX 2.1 (1 point)

**Explain the following program statement in terms of objects and the services
they provide.**

<strong>
```java
System.out.println("I gotta be me!");
```
</strong>

The <code>System.out</code> object provides a <code>println</code> service method.

# Lewis EX 2.4 (1 point)

**What output is produced by the following statement? Explain.**

<strong>
```java
System.out.println("50 plus 25 is " + 50 + 25);
```
</strong>

The output of the statement is the following:

```
50 plus 50 is 5025
```

This happens because the + operator between the String literal and the integer
50 is treated as String concatenation. The result of String concatenation is
another String. This String is concatenated with the integer 25, resulting
in the output described above.

# Lewis EX 2.6 (1 point)

**What calue is contained in the integer variable <code>size</code> after the
following statements are executed?**

<strong>
```java
size = 18;
size = size + 12;
size = size * 2;
size = size / 4;
```
</strong>

The value in <code>size</code> is 15.

(remainder of response not needed to receive credit)

Let's examine why:
```java
size = 18;        // assigns 18 to size; size is now 18
size = size + 12; // assigns 18 + 12 to size; size is now 30
size = size * 2;  // assigns 30 * 2 to size; size is now 60
size = size / 4;  // assigns 60 / 4 to size; size is now 15
```

# Lewis EX 2.7 (1 point)

**What value is contained in the floating point variable <code>depth</code> 
after the following statements are executed?**

<strong>
```java
depth = 2.4;
depth = 20 - depth * 4;
depth = depth / 5;
```
</strong>

The value of <code>depth</code> is 2.08

(remainder of response not needed to receive credit)

Let's examine why:

```java
depth = 2.4;            // assigns 2.4 to depth; depth is 2.4
depth = 20 - depth * 4; // assigns 20 - (2.4 * 4) = 10.4 to depth; depth
                        // is now 10.4
depth = depth / 5;      // assigns 10.4 / 5 = 2.08 to depth; depth is
                        // now 2.08
```

# Lewis EX 2.8 (1 point)

**What value is contained in the integer variable <code>length</code> after the
following statements are executed?**

<strong>
```java
length = 5;
length *= 2;
length *= length;
length /= 100;
```
</strong>

The value of <code>length</code> is 0.

(remainder of response not needed to receive credit)

```java
length = 5;        // assigns 5 to length
length *= 2;       // assigns 10 to length
length += length;  // assigns 20 to length
length /= 100;     // assigns 0 to length
```

