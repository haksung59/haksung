package kr.re.kitri.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DishHandler {

    public static void main(String[] args){
        List<Dish> dishes = getDishes();

        List<Dish> result = new ArrayList<>();
        for(Dish dish : dishes) {
            if(dish.getCalrories() >= 300) {
                result.add(dish);
            }
        }
        System.out.println(result);
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
