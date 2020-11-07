package com.company.lesson_18.Task_1;

//        a) Создайте класс Phone, который содержит переменные number, model и weight.
//        б) Создайте три экземпляра этого класса.
//        в) Выведите на консоль значения их переменных.
//        г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//           Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
//           Вызвать эти методы для каждого из объектов.
//        д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
//           переменных класса - number, model и weight.
//        е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//        ж) Добавить конструктор без параметров.
//        з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
//           Вызвать этот метод.
//        к) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
//           которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
//        л) Изменить класс Phone в соответствии с концепцией JavaBean.

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	    Phone phone1 = new Phone("87719994168","Nokia", 160.3);
	    Phone phone2 = new Phone("87719994168","Nokia", 160.3);
	    Phone phone3 = new Phone("87719994168","Nokia", 160.3);

	    String[] numbers = new String[]{
                "87719994167","87719994166","87719994165","87719994164","87719994163","87719994162","87055580222","87007199941"
        };
	    phone1.sendMessage(numbers);

//	    phone2.sendMessage("5465", "8489", "8764", "489469", "12489", "15684699");
//	    phone1.receiveCall("Dauren", "87015380377");
//	    phone1.receiveCall("Dauren");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
