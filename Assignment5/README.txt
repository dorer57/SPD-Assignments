# Assignment 5 - Strategy Pattern

A simple calculator in Java that uses the **Strategy** pattern. Each arithmetic operation is its own class, and the calculator can switch between them at runtime.

## Roles

Role                     Class 
Strategy interface - `CalculationStrategy` 
Concrete Strategies - `Add`, `Subtract`, `Multiply`, `Divide` 
Context - `Calculator` 
Client - `Main` 

## How it works

`Calculator` holds one `CalculationStrategy` and passes `calculate(a, b)` to it. `Main` chooses the strategy and changes it with `setStrategy()`. `Calculator` has no `if` or `switch` for choosing the operation.

To add a new operation, create a new class that implements `CalculationStrategy`. `Calculator` does not change.

## How to run

Run the Main.java