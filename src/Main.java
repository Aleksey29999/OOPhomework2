//Если в методе main() создать объекты этих классов, то можно узнать информацию о тарелке и
//        вызвать пустой метод eat() у кота. Эти объекты пока никак не могут взаимодействовать между собой.
//        Можно добавить в классы геттеры и сеттеры и получить код вроде.

//ЗАДАНИЕ
//       1/ Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//       2/ Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//        Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//       3/ Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//       4 Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
//        Достаточно выполнить первые 2 подпункта задачи.


class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 25, false);
//        Cat cat2 = new Cat("Myrzik", 15, false);
//        Cat cat3 = new Cat("Matroskin", 10, false);
//        Cat cat4 = new Cat("Leopold", 8, false);
//        Cat cat5 = new Cat("Tuzik", 9, false);

        Plate plate = new Plate(100);
        plate.info();
        cat1.eat();
//        cat2.eat();
//        cat3.eat();
//        cat4.eat();
//        cat5.eat();
        System.out.println(String.format("%s - %s -%s", cat1.getName(), cat1.getAppetite(), cat1.getFullness()));
        if (plate.getFood() > cat1.getAppetite()) {


            plate.setFood(plate.getFood() - cat1.getAppetite());
            boolean fullness = true;
            plate.info();
            System.out.println(String.format("%s - %s -%s", cat1.getName(), cat1.getAppetite(), fullness));
        }
        else {
            System.out.println("недостаточно еды в тарелке " + plate.getFood());
            plate.info();
        }
//        plate.setFood(plate.getFood() - cat2.getAppetite());
//        plate.setFood(plate.getFood() - cat3.getAppetite());
//        plate.setFood(plate.getFood() - cat4.getAppetite());
//        plate.setFood(plate.getFood() - cat5.getAppetite());
    }
}