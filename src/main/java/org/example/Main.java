package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //HAVLAYAN KOPEK
        boolean wakeUp = shouldWakeUp(true, 9);
        System.out.println("Should wake up: " + wakeUp);

        //YAS HESAPLAMA
        int firstAge = 12;
        int secondAge = 16;
        int thirdAge = 25;

        boolean result = hasTeen(firstAge, secondAge, thirdAge);
        System.out.println("Has Teen: " + result);

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && (clock < 8 || clock >= 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }

    }

    public static double area(double width, double height) {

        if(width<0 || height<0){
            return -1;
        } else {
            return width * height;
        }

    }

    public static double area(double radius) {
        if(radius < 0){
            return -1;
        }else {
            return radius*radius*Math.PI;
        }
    }



}
