package com.example.design.patterns.creational.prototype.document;

public interface Document extends Cloneable {
    Document clone();
    void print();
}
