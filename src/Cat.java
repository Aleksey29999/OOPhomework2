//Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
//        Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
//        пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
//        кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:


public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;

    }
    public void eat() { }

    public int getAppetite() {
        return appetite;

    }

    public String getName() {
        return name;
    }
    public Boolean getFullness() {boolean fullness;
        return false;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
            }

    public void setName(String name) {
        this.name = name;
    }

}