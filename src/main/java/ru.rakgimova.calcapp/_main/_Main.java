package ru.rakgimova.calcapp._main;

import ru.rakgimova.calcapp.service.ResultWriterService;

import java.util.Scanner;

import static ru.rakgimova.calcapp.util.Calculator.*;

public class _Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        num1 = in.nextInt();
        System.out.print("Введите число: ");
        num2 = in.nextInt();
        int result;
        result = subtract(num1, num2);
        ResultWriterService.resultWrite(num1, num2, result, "Разность");
        result = summarize(num1, num2);
        ResultWriterService.resultWrite(num1, num2, result, "Сумма");
        result = multiply(num1, num2);
        ResultWriterService.resultWrite(num1, num2, result, "Произведение");
    }
}
