public abstract class Animal {

    private final String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    abstract void run(int length);
    abstract void swim(int length);

    void doSome(String animal, String action, int length){
        System.out.printf(getName() + ": %s " + getName() + " %s " + "%d" + "м\n", animal, action, length);
    }
}
