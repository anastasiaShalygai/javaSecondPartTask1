package implementation;

import person.Boy;
import person.Girl;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Implementation {

    private Implementation() {
    }

    static public void createObject() {
        Boy boy1 = new Boy("Andrew", 19, 190, 70, "brown");
        Boy boy2 = new Boy("Ethan", 30, 170, 90, "black");
        Boy boy3 = new Boy("Michael", 50, 205, 100, "black");
        printBoys(boy1, boy2, boy3);

        Girl girl1 = new Girl("Emily", 16, 163, 50, "brown");
        Girl girl2 = new Girl("Emma", 25, 172, 65, "black");
        printGirls(girl1, girl2);

        printNumberOfObjects();
    }

    private static void printBoys(Boy... values) {
        for (Boy boy : values) {
            System.out.println("Name: " + boy.getName() + "\nAge: " + boy.getAge() + "\nHeight: " + boy.getHeight() + "\nWeight: " + boy.getWeight() + "\nHairColor: " + boy.getHairColor() + "\n");
        }
    }

    private static void printGirls(Girl... values) {
        for (Girl girl : values) {
            System.out.println("Name: " + girl.getName() + "\nAge: " + girl.getAge() + "\nHeight: " + girl.getHeight() + "\nWeight: " + girl.getWeight() + "\nHairColor: " + girl.getHairColor() + "\n");
        }
    }

    private static void printNumberOfObjects() {
        System.out.println("Total number of objects: " + (Boy.getNumberOfBoy() + Girl.getNumberOfGirls()));
    }
}
