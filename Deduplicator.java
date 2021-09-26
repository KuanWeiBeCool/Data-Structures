package com.Week4;

import java.time.LocalDate;
import java.util.*;
public class Deduplicator {
    //
    // IMPLEMENT THIS METHOD!
    //
    // For testing purposes, do not edit the signature of the method.
    public List<Subscriber> deduplicate(List<Subscriber> originalList) {
//        Set<Subscriber> subscriberSet = new HashSet<Subscriber>();
        List<Subscriber> newList = new LinkedList<Subscriber>();
//        for (Subscriber sub : originalList){
//
//                subscriberSet.add(sub);
//        }
        Set<Subscriber> set = new HashSet<Subscriber>();
        List<Subscriber> list = new ArrayList<Subscriber>();
        for (Subscriber s: originalList) {
            set.add(s);
        }

        System.out.println(originalList.size());
        System.out.println(set.size());
        for (Subscriber sub : originalList) {
            if (newList.isEmpty()) {
                newList.add(sub);
            } else {
                if (!newList.contains(sub)) {
                    int i = 0;
                    while (i < newList.size() && sub.lastName.compareTo(newList.get(i).lastName) > 0) {
                        i++;
                    }
                    if (i < newList.size() && sub.lastName.equals(newList.get(i).lastName)) {
                        while (i < newList.size() && sub.firstName.compareTo(newList.get(i).firstName) > 0) {
                            i++;
                        }
                        if (i < newList.size() && sub.firstName.equals(newList.get(i).firstName)) {
                            while (i < newList.size() && sub.birthdate.compareTo(newList.get(i).birthdate) > 0) {
                                i++;
                            }
                            if (i < newList.size() && sub.birthdate.equals(newList.get(i).birthdate)){
                                continue;
                            }
                        }
                    }
                    newList.add(i, sub);
                }
            }
        }
        return newList;
    }

    // You may edit this class by adding fields, adding methods,
    // having it extend a class, or having it implement an interface,
    // but please do not edit any of the existing methods.
    class Subscriber {
        private String firstName;
        private String lastName;
        private LocalDate birthdate;

        // Do not edit this method.
        public Subscriber(String firstName, String lastName, LocalDate birthdate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthdate = birthdate;
        }

        // Do not edit this method.
        public String getFirstName() {
            return firstName;
        }

        // Do not edit this method.
        public String getLastName() {
            return lastName;
        }

        // Do not edit this method.
        public LocalDate getBirthdate() {
            return birthdate;
        }

        // Do not edit this method.
        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(lastName);
            stringBuilder.append(", ");
            stringBuilder.append(firstName);
            stringBuilder.append(" ... ");
            stringBuilder.append(birthdate);

            return stringBuilder.toString();
        }
    }

    // Do not edit this method.
    private static String toString(List<Subscriber> subscribers) {
        if (subscribers == null) {
            System.out.println("[!] List passed to toString is null.");
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < subscribers.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(subscribers.get(i));

            if (i < subscribers.size() - 1) {
                stringBuilder.append("\r\n");
            }
        }

        return stringBuilder.toString();
    }

    // Do not edit this method.
    public static void main(String[] args) {
        List<Subscriber> originalList = new ArrayList<>();
        Deduplicator deduplicator = null;

        try {
            deduplicator = new Deduplicator();
        } catch (Exception e) {
            System.out.println("[!] Deduplicator's constructor threw an exception: " + e.getMessage());
        }

        originalList.add(deduplicator.new Subscriber("Bihman", "Dhesta", LocalDate.of(1992, 6, 12)));
        originalList.add(deduplicator.new Subscriber("Qia", "Findrid", LocalDate.of(1973, 12, 21)));
        originalList.add(deduplicator.new Subscriber("Hiu", "Lang", LocalDate.of(1989, 10, 5)));
        originalList.add(deduplicator.new Subscriber("Oh", "Zao", LocalDate.of(1997, 10, 27)));
        originalList.add(deduplicator.new Subscriber("Serim", "Vev", LocalDate.of(1957, 3, 2)));
        originalList.add(deduplicator.new Subscriber("Lei", "Lia", LocalDate.of(1995, 12, 4)));
        originalList.add(deduplicator.new Subscriber("Castrava", "Vev", LocalDate.of(1988, 2, 18)));
        originalList.add(deduplicator.new Subscriber("Qia", "Findrid", LocalDate.of(1989, 6, 19)));
        originalList.add(deduplicator.new Subscriber("Hiu", "Lang", LocalDate.of(1989, 10, 5)));
        originalList.add(deduplicator.new Subscriber("Oh", "Zao", LocalDate.of(1997, 10, 27)));
        originalList.add(deduplicator.new Subscriber("Azeih", "Zao", LocalDate.of(1997, 10, 27)));
        originalList.add(deduplicator.new Subscriber("Serim", "Vev", LocalDate.of(1957, 3, 2)));
        originalList.add(deduplicator.new Subscriber("Arcu", "Benzahas", LocalDate.of(2001, 9, 19)));
        originalList.add(deduplicator.new Subscriber("Qia", "Niem", LocalDate.of(2003, 1, 13)));
        originalList.add(deduplicator.new Subscriber("Castrava", "Eshu", LocalDate.of(2004, 3, 7)));
        originalList.add(deduplicator.new Subscriber("Lei", "Lia", LocalDate.of(1995, 12, 4)));
        originalList.add(deduplicator.new Subscriber("Qia", "Findrid", LocalDate.of(1951, 4, 2)));
        originalList.add(deduplicator.new Subscriber("Serim", "Vev", LocalDate.of(1957, 3, 2)));
        originalList.add(deduplicator.new Subscriber("Se", "Bardisk", LocalDate.of(2007, 8, 24)));
        originalList.add(deduplicator.new Subscriber("Oh", "Zao", LocalDate.of(1997, 10, 27)));
        originalList.add(deduplicator.new Subscriber("Serim", "Vev", LocalDate.of(1992, 1, 14)));
        originalList.add(deduplicator.new Subscriber("Qia", "Findrid", LocalDate.of(1989, 6, 19)));

        List<Subscriber> deduplicatedList = null;

//        try {
        deduplicatedList = deduplicator.deduplicate(originalList);
//        } catch (Exception e) {
//            System.out.println("[!] .deduplicate threw an exception: " + e.getMessage());
//        }

        if (deduplicatedList == null) {
            System.out.println("[!] List returned by .deduplicate is null.");
            return;
        }

        if (deduplicatedList.isEmpty()) {
            System.out.println("[!] List returned by .deduplicate is empty.");
            return;
        }

        String expectedResult = "1. Bardisk, Se ... 2007-08-24\r\n" +
                "2. Benzahas, Arcu ... 2001-09-19\r\n" +
                "3. Dhesta, Bihman ... 1992-06-12\r\n" +
                "4. Eshu, Castrava ... 2004-03-07\r\n" +
                "5. Findrid, Qia ... 1951-04-02\r\n" +
                "6. Findrid, Qia ... 1973-12-21\r\n" +
                "7. Findrid, Qia ... 1989-06-19\r\n" +
                "8. Lang, Hiu ... 1989-10-05\r\n" +
                "9. Lia, Lei ... 1995-12-04\r\n" +
                "10. Niem, Qia ... 2003-01-13\r\n" +
                "11. Vev, Castrava ... 1988-02-18\r\n" +
                "12. Vev, Serim ... 1957-03-02\r\n" +
                "13. Vev, Serim ... 1992-01-14\r\n" +
                "14. Zao, Azeih ... 1997-10-27\r\n" +
                "15. Zao, Oh ... 1997-10-27";

        String actualResult = toString(deduplicatedList);

        System.out.println("--Expected Result--");
        System.out.println(expectedResult);

        System.out.println();

        System.out.println("--Actual Result--");
        System.out.println(actualResult);

        System.out.println();

        if (actualResult.equals(expectedResult)) {
            System.out.println("Correct result.");
        } else {
            System.out.println("Incorrect result.");
        }
    }
}