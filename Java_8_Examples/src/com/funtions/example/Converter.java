package com.funtions.example;

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);
}
