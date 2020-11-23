package com.company.lesson_25.eShop;

import java.util.ArrayList;

//        а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        б) Создать класс Категория, имеющий переменные имя и массив товаров.
//           Создать несколько объектов класса Категория.
//        в) Создать класс Basket, содержащий массив купленных товаров.
//        г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User. (Интернет магазин)
public class Main {

    private static Category categoryMilk;
    private static Category categoryBread;

    public static void main(String[] args) {


        ArrayList<Product> milkProducts = new ArrayList<>();
        milkProducts.add(
                new Product(
                        "Milk",
                        500,
                        Product.Rating.GOOD
                )
        );

        milkProducts.add(
                new Product(
                        "Cheese",
                        5000,
                        Product.Rating.GOOD
                )
        );
        milkProducts.add(
                new Product(
                        "Butter",
                        300,
                        Product.Rating.EXCELLENT
                )
        );

        Category categoryMilk = new Category(
                "Milk",
                milkProducts

        );


    }
}
