package com.epam.rd.autotasks.meetautocode;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        System.out.println(someMeth(seconds));


    }
    static public String someMeth(Integer second){
        LocalTime localDateTime= LocalTime.of(0,0,0);
        return localDateTime.plusSeconds(second).format(DateTimeFormatter.ofPattern("H:mm:ss"));


    }
}
