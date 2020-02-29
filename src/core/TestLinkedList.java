package core;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList <String> listOfNames = new LinkedList<>();
        listOfNames.add("Binoy");
        listOfNames.add("Tejas");
        listOfNames.add("Jay");
        listOfNames.add("Samir");
        listOfNames.add("MD");
        listOfNames.addFirst("Pranav");
        listOfNames.remove("Jay");
        listOfNames.removeLast();

        System.out.println(listOfNames);
        System.out.println(listOfNames.size());

    }
}
