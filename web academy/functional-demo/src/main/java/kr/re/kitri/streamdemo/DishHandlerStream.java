package kr.re.kitri.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DishHandlerStream {
    public static void main(String[] args) {
        List<Dish> dishes = getDishes();


        // select * from dishes where calrories >=300
        //long count = dishes.stream()
        //        .filter(new Predicate<Dish>() {
        //            @Override
        //            public boolean test(Dish dish) {
        //                return dish.getCalrories() >= 300;
        //            }
        //        }).count();

        long count = dishes.stream()
                .filter(dish -> dish.getCalrories() >= 500)
                .count();

        System.out.println(count);

        //selete count(*) from dishes where type == 'MEAT'
        //select count(*) from dishes where calrories > 200 & calrories < 450
        //dish.getCalrories > 200 && dish.getCalrories < 450

        long count2 = dishes.stream()
                .filter(dish -> dish.getType().equals("MEAT"))
                .count();
        System.out.println("type=MEAT : " + count2);

        long count3 = dishes.stream()
                .filter(dish -> dish.getCalrories() >200 && dish.getCalrories() <450)
                .count();
        System.out.println("200~450 : " + count3);

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