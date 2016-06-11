package com.retail.tw;

import java.io.PrintStream;

public class Display {
    private PrintStream printStream;

    public Display(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void print(String output) {
        this.printStream.println(output);
    }
}
