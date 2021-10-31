package it.campe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(name  + militaryCommissar);
    }
}
/*About
Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
 то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.*/