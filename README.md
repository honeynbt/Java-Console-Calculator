# Java Console Calculator

A simple **console-based calculator** built in Java.  
It supports addition, subtraction, multiplication, and division with clean screen transitions after each operation.

---

## Features
- **Four Basic Operations**: Addition, Subtraction, Multiplication, Division.
- **Input Validation**:
  - Re-prompts until a valid number or menu option is entered.
  - Gracefully handles non-numeric input.
- **Clear Screen Effect**:
  - Uses ANSI escape codes to clear the console for a fresh view on each step.
- **Division Safety**:
  - Checks for division by zero and shows an error instead of crashing.

---

## Requirements
- **Java 8** or later.
- Works best in a terminal that supports ANSI escape codes  
  (e.g., Linux terminal, macOS Terminal, Windows 10+ PowerShell/CMD).

---

## How to Run
1. Save the file as `ConsoleCalculator.java`.
2. Open a terminal in the file directory.
3. Compile the program:
   ```bash
   javac ConsoleCalculator.java
4. Run the compiled class:
   ```bash
   java ConsoleCalculator
