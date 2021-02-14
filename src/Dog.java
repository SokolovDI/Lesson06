public class Dog extends Animal {

    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    void run(int length) {
        int maxRunLength = 500;
        if ((length >= 0) && (length <= maxRunLength))
             doSome("Собака", "пробежала", length);
        else doSome("Собака", "не бегает больше", length);
    }

    @Override
    void swim(int length) {
        int maxSwimLength = 10;
        if ((length >= 0) && (length <= maxSwimLength))
             doSome("Собака", "проплыла", length);
        else doSome("Собака", "не плавает больше", length);
    }
}
