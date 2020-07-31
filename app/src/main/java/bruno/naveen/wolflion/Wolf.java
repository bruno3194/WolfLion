package bruno.naveen.wolflion;

public class Wolf implements Animal {
    @Override
    public String eat() {
        return "WOLF IS EATING";
    }

    @Override
    public String sleep() {
        return "WOLF IS SLEEPING";
    }

    @Override
    public String cub() {
        return "LITTLE WOLF";
    }

    @Override
    public String girl() {
        return "GIRL NEAR WOLF";
    }
}
