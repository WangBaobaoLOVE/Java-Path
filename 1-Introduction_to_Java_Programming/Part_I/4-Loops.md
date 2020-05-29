## Objectives

- To write programs for executing statements repeatedly using a `while` loop (§4.2).
- To follow the loop design strategy to develop loops (§§4.2.1–4.2.3).
- To control a loop with a sentinel value (§4.2.4).
- To obtain large input from a file using input redirection rather than typing from the keyboard (§4.2.5).
- To write loops using `do-while` statements (§4.3).
- To write loops using `for` statements (§4.4).
- To discover the similarities and differences of three types of loop statements(§4.5).
- To write nested loops (§4.6).
- To learn the techniques for minimizing numerical errors (§4.7).
- To learn loops from a variety of examples (`GCD`, `FutureTuition`,`MonteCarloSimulation`) (§4.8).
- To implement program control with `break` and `continue` (§4.9).
- To write a program that displays prime numbers (§4.10).
- To control a loop with a confirmation dialog (§4.11).

## A simple example

```java
        int count = 0;
        while (count < 100) {
            System.out.println("Welcome to Java!");
            count++;
        }
```

## The while Loop

```java
        int count = 0;
        while (count < 100) {
            System.out.println("Welcome to Java!");
            count++;
        }
```

## The do-while Loop
A `do-while` loop is the same as a `while` loop except that it executes the loop body first and then checks the loop continuation condition.

```java
        int data;
        int sum = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print(
                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        }while(data != 0);

        System.out.println("The sum is " + sum);
```

```java
Enter an integer (the input ends if it is 0): 1
Enter an integer (the input ends if it is 0): 2
Enter an integer (the input ends if it is 0): 3
Enter an integer (the input ends if it is 0): 4
Enter an integer (the input ends if it is 0): 5
Enter an integer (the input ends if it is 0): 6
Enter an integer (the input ends if it is 0): 7
Enter an integer (the input ends if it is 0): 8
Enter an integer (the input ends if it is 0): 9
Enter an integer (the input ends if it is 0): 0
The sum is 45
```

## The for Loop
A for loop has a concise syntax for writing loops.

```java
        int i;
        for (i = 0; i < 100; i++) {
            System.out.println("Welcome to Java!");
        }
``` 