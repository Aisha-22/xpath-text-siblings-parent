package com.company;

import com.company.Test;

class main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello World");

        // Need to create a Driver object to drive all automation from the Test class
        Test test = new Test();

        test.runTest();


    }
}