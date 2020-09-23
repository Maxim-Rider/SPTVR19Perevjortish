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
        // решение с помощью класса StringBuilder
        StringBuilder sbStr = new StringBuilder(str);
        System.out.println("Перевёртыш 2: "+sbStr.reverse().toString());
        // вернуть второе слово из строки
        // 1. находим index проблема в строке.
        // 2. если в строке нет пробелов то нет второго слова
        // 3. если один символ пробела в строке, то выводим с индекса первого пробела до конца строки
        // 4. если в строке два пробела, то выводим подстроку от первого пробела до второго
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" ", firstSpace+1);
        if(firstSpace < 0) {
            System.out.println("Второго слова нет");
        }else if(secondSpace < 0) {
            System.out.println("Второе слово: " + str.substring(firstSpace));
        }else{
            System.out.println("Второе слово: " + str.substring(firstSpace+1,secondSpace));
        }
        // второй способ решения
        for (String str2 : str.split(" ")) {
            System.out.println(str2);
        }
    }
}