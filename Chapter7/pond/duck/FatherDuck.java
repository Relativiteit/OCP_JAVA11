package pond.duck;

public class FatherDuck {
    public String noise = "quack";
    public void quack() {
        System.out.println((noise));
    }
    private void makeNoise() {
        quack();
    }
}
