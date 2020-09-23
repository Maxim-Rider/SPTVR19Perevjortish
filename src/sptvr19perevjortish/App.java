/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19perevjortish;

import java.util.Scanner;

/**
 *
 * @author Comp
 */
class App {
    public void run() {
        System.out.println("=== Перевертыш ===");
        // просим пользователя ввести строку
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // полученную строку преобразуем в массив char[]
        char[] chStr = str.toCharArray();
        // создадим новый массив для обратной строки
        char[] rChStr = new char[str.length()];
        // в цикле пройдём по rChStr и поместим из chStr символы в обратном порядке
        for (int i = 0; i < rChStr.length; i++) {
        rChStr[i] = chStr[(chStr.length -1) -i];
        }
        // преобразуем массив символов rChStr в строку
        String rStr = new String(rChStr);
        System.out.println("Перевёртыш: "+rStr);
    }
}
