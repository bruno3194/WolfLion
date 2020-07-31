package bruno.naveen.wolflion;

public class Lion implements Animal {
    @Override
    public String eat() {
        return "LION IS EATING";
    }

    @Override
    public String sleep() {
        return "LION IS SLEEPING";
    }

    @Override
    public String cub() {
        return "LITTLE LION";
    }

    @Override
    public String girl() {
        return "GIRL NEAR LION";
    }
}
