package by.itstep.vikvik.javalesson21.controller;

import by.itstep.vikvik.javalesson21.model.logic.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(5, 6));
        System.out.println(Calculator.sub(5, 6));
        System.out.println(Calculator.mul(5, 6));
        System.out.println(Calculator.div(5, 6));
    }
}
