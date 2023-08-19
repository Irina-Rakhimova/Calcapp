package ru.rakgimova.calcapp.service;

public class ResultWriterService {

    public static void resultWrite(int num1, int num2, int result, String operationName) {
        System.out.println(operationName + ": " + num1 + ", " + num2 + " = " + result);
    }
}
