package wyphyoe.annotations.callsuper;

/**
 * Created by Wai Yan on 12/10/18.
 */
public class Cat extends Animal {

    @Override
    protected void run() {
        super.run();
    }

    public static void test() {
        Cat cat = new Cat();
        cat.run();
    }
}
