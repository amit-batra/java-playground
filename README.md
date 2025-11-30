# Java Playground

A collection of Java code examples demonstrating various Stream API operations.

## Prerequisites

- **Java SE 25** or higher
- A terminal/command line interface

To verify your Java installation, run:

```bash
java -version
```

You should see output indicating Java version 25 or higher.

## Project Structure

```
java-playground/
├── src/
│   └── streams/          # Stream API examples
├── bin/                  # Compiled .class files
└── README.md
```

## Examples

### Streams Package

- **ExtractAllCharacters.java** - Demonstrates how to extract all characters from a list of words using `flatMapToInt`
- **FlattenListOfIntegers.java** - Shows how to flatten a list of lists into a single list using `flatMap`
- **ListAllEmailsForUsers.java** - Extracts all email addresses from a list of user objects
- **SplitSentencesIntoWords.java** - Splits sentences into individual words using streams

## How to Run

### Compile the Code

From the project root directory, compile all Java files:

```bash
javac -d bin src/streams/*.java
```

This compiles all `.java` files in the `src/streams/` directory and places the compiled `.class` files in the `bin/` directory.

### Run Individual Examples

To run a specific example, use the following command pattern:

```bash
java -cp bin streams.<ClassName>
```

#### Examples:

**Extract All Characters:**
```bash
java -cp bin streams.ExtractAllCharacters
```

**Flatten List of Integers:**
```bash
java -cp bin streams.FlattenListOfIntegers
```

**List All Emails for Users:**
```bash
java -cp bin streams.ListAllEmailsForUsers
```

**Split Sentences into Words:**
```bash
java -cp bin streams.SplitSentencesIntoWords
```

## Notes

- The `-cp bin` flag sets the classpath to the `bin` directory where compiled classes are located
- All examples are self-contained and include sample data within the main method
- Each example demonstrates a specific Stream API operation and prints the results to the console

## Learning Resources

These examples are designed to help understand Java Stream API operations including:
- `flatMap` and `flatMapToInt` for flattening nested structures
- `map` and `mapToObj` for transformations
- Method references (`::`syntax)
- Terminal operations like `toList()`