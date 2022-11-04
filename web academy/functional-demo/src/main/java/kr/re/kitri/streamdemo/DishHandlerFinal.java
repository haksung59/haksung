package kr.re.kitri.streamdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishHandlerFinal {
    public static void main(String[] args){
        List<Dish> menu = getDishes();

        List<String> collect = menu.stream()
                .filter(dish -> dish.getCalrories() > 400)
                //.sorted((a, b) -> a.getCalrories() - b.getCalrories())
                .sorted(Comparator.comparingInt(Dish::getCalrories))
                //.map(dish -> dish.getName())
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
    public static List<Dish> getDishes() {
        return Arrays.asList(
                new Dish("pork", false, 800, "MEAT"),
                new Dish("beef", false, 700, "MEAT"),
                new Dish("chicken", false, 450, "MEAT"),
                new Dish("french fries", true, 350, "OTHER"),
                new Dish("rice", true, 300, "OTHER"),
                new Dish("spagetti", true, 420, "NOODLE"),
                new Dish("apple", true, 350, "FRUIT"),
                new Dish("melon", true, 300, "FRUIT"),
                new Dish("salmon", true, 430, "FISH"),
                new Dish("prawn", true, 210, "FISH")
        );
    }

}
