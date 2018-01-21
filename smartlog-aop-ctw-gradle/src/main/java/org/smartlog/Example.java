package org.smartlog;

import org.smartlog.aop.Loggable;

public class Example {
    @Loggable
    public static void example1() {
    }

    public static void main(final String[] args) {
        Example.example1();
    }
}