package pond.duck;

public class BadDuckling {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        duck.quack(); // Does not compile
        System.out.println((duck.noise)); // FatherDucks methods need to be public too.

    }
}
