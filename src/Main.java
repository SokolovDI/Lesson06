/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль.
 * (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
 * кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */

public class Main {
    public static void main(String[] args) {

        Dog bobikDog = new Dog("Бобик");
        Dog rexDog = new Dog("Рэкс");
        Dog sharickDog = new Dog("Шарик");
        Dog poligrafDog = new Dog("Полиграф");

        Cat barsikCat = new Cat("Барсик");
        Cat stasikCat = new Cat("Стасик");



        System.out.println("Общее количество животных: " + Animal.getAnimalCount() + "\nв том числе:");
        System.out.println("Количество кошек: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount() + "\n");

        sharickDog.run(500);
        sharickDog.swim(5);
        System.out.println();

        poligrafDog.run(600);
        poligrafDog.swim(15);
        System.out.println();

        bobikDog.run(600);
        bobikDog.swim(5);
        System.out.println();

        rexDog.run(400);
        rexDog.swim(15);
        System.out.println();

        barsikCat.run(100);
        barsikCat.swim(5);
        System.out.println();

        stasikCat.run(300);
        stasikCat.swim(5);
        System.out.println();

    }
}
