package days.fourth;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //listExample();
       // setExample();
       // mapExample();
        User user = new User("andrius", "baltrunas");
        System.out.println(user.getName() + " " + user.getSurname());

    }
    private static void mapExample(){
        Map<Integer, String> cars = new HashMap<>();

        cars.put(1999, "audi");
        cars.put(2000, "bwm");

        cars.keySet().forEach(k -> System.out.println("key " + k + " value " + cars.get(k)));
        System.out.println(cars.size());
        System.out.println(cars.containsValue("bwm"));
    }

    private static void  setExample(){
        Set<Integer> number = new TreeSet<>();
        number.add(9);
        number.add(5);
        number.add(2);
        number.add(9);

        number.forEach(System.out::println); //sitas

     /*   for(Integer numb : number){
            System.out.println(numb);   // arba sitas
        } */

    }

    private static void listExample(){
        List<String> names = new ArrayList<>();

        names.add("Andrius");
        names.add("Petras");
        names.add("Jonas");
        names.add("Andrius");

        System.out.println(names.size());
        System.out.println(names.get(2));
        names.forEach(System.out::println);
        System.out.println(names.contains("Jonas"));
    }
}
