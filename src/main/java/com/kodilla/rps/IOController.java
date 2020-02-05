package com.kodilla.rps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IOController {

    private static final Scanner scanner = new Scanner(System.in);

    public static void showRules(){
        System.out.println("klawisz 1 - zagranie \"kamień\"");
        System.out.println("klawisz 2 - zagranie \"papier\"");
        System.out.println("klawisz 3 - zagranie \"nożyce\"");
        System.out.println("klawisz x - zakończenie gry");
        System.out.println("klawisz n - uruchomienie gry od nowa");
    }

    public static String getName(){
        System.out.println("Podaj swoje imię: ");
        String name;
        do{
            name = scanner.nextLine();
        }while(name.trim().length() <= 0);
        return name.trim();
    }

    public static int getGameCount(){
        System.out.println("Podaj ilość rund: ");
        int count;
        String value;
        do {
            value = scanner.nextLine();
        } while(value.isEmpty() || !value.chars().allMatch(Character::isDigit));
        count = Integer.parseInt(value);
        return count;
    }

    public static int getMove(){
        int move = 0;
        do{
            System.out.println("Wykonaj swoj ruch: ");
            String value = scanner.nextLine();
            if(value != null && !value.isEmpty() && value.chars().allMatch(Character::isDigit)) move = Integer.parseInt(value);
        }while (move < 1 || move > 3);
        return move;
    }

    public static void afterRoundRespond(Player player) {
        if(player != null){
            System.out.println("Wynik rundy: " + player.getName() + " zwyciężył");
        }else{
            System.out.println("Wynik rundy: remis");
        }
    }

    public static void pickWinner(Player player){
        if(player != null){
            System.out.println(player.getName() + " zwyciężył rozgrywkę!");
        }else{
            System.out.println("Rozgrywka zakończona remisem");
        }
    }

    public static void checkState(Player p1, Player p2){
        System.out.println(p1.getName() + ": " + p1.getPoints() + " punktów, " + p2.getName() + ": " + p2.getPoints() + " puntków");
    }

    public static void moveInfo(String name, Moves value) {
        System.out.println(name + " wybrał " + value);
    }

    public static int afterGameQ(){
        System.out.println("Jeżeli chcesz zakończyć grę wciśnij X. Jeśli chcesz rozpocząć nową rozgrywkę wciśnij N");
        String chare;
        int res;
        Set<String> admissible = new HashSet<>();
        admissible.add("n");
        admissible.add("x");
        admissible.add("N");
        admissible.add("X");
        do{
            chare = scanner.nextLine();
        }while(chare.trim().length() != 1 && !admissible.contains(chare.trim()));

        if(chare.equals("n") || chare.equals("N")) {
            res = 1;
        }else{
            res = 0;
        }

        return res;

    }

}
