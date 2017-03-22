# Annotations exercise

# Installation

1. Fork this repository.
1. Clone your fork using IntelliJ.

## Configuration

IntelliJ compiles and executes our code from the terminal without our direct intervention. For this
exercise we will not use it, because it would *hide* the warnings that we want to fix. For this
exercise we will use the *terminal* instead.

### Compilation

To compile we will use the Java Compiler `javac`. `javac` generates the byte code used by the Java 
Virtual Machine by creating files with the extension `.class`. Those `.class` files are the ones 
executed by the JVM.

You will need to run the following command several times for the exercises in this lesson.

```
javac -d out/ src/*
```

In the previous command, the option `-d` specifies the directory where the `.class` files are going
to be saved, `out` for this example. `src/*` tells the compiler to compile all the `.java` files in
the `src` directory.

Sometimes the compiler produces unrelated error messages when there are existing `.class` files in
the output directory. In order to avoid this issue, it is very recommended to cleanup the `out`
directory before compiling.

```
rm out/*.class
```

### Execution

In order to execute a Java class you will use the `java` command as follows.

```
java -cp out/ Main
```

The option `-cp` tells Java where to look for the class to be executed, in this case the `out`
folder, which is where our `.class` files are. `Main` is the name of the class with the `main` 
method. 

## Finally

1. Follow the instructions in the curriculum.
1. Enjoy!
