package pond.swan;
import pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
      //  duck.quack();  Does not compile because out of package
      //  System.out.println(duck.noise); does not compile out of package
    }
}
