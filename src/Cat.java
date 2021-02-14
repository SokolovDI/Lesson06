public class Cat extends Animal {

    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    void run(int length) {
        int maxRunLength = 200;
        if ((length >= 0) && (length <= maxRunLength))
             doSome("Кот","пробежал", length);
        else System.out.println(getName() + ": Коты не бегают больше " + length + "м");
    }

    @Override
    void swim(int length) {
        System.out.println(getName() + ": Кошки не умеет плавать");
    }
}
