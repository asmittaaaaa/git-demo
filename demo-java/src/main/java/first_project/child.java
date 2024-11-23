package main.java.first_project;

import first_project.parent;

public class child extends parent {
    public static void main(String[] args) {
        System.out.println("This is Child class");

        child mychild = new child();

        mychild.parent_print();
    }
}
