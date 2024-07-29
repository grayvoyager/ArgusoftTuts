package com.src;

class DefaultOuterClass {
    private int privateField = 10;
    private void privateMethod() {
        System.out.println("Private method in outer class");
    }

    public class PublicNestedClass {
        public void accessAndExposePrivateMembers() {
            System.out.println(privateField);
            privateMethod();
        }
    }
}

class AnotherClass {
    void tryAccess() {
        DefaultOuterClass outer = new DefaultOuterClass();
        DefaultOuterClass.PublicNestedClass nested = outer.new PublicNestedClass();
        nested.accessAndExposePrivateMembers(); // This works
    }
}