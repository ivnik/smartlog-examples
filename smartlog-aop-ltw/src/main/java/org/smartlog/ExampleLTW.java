package org.smartlog;

import org.smartlog.aop.Loggable;

public class ExampleLTW {
    @Loggable
    public static void example1() {
    }

    public static void main(final String[] args) {
        ExampleLTW.example1();
    }
}