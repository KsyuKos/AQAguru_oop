import Enums.Type;
import Interfaces.SwimAnimals;

public class Fishes implements SwimAnimals {

    protected Type type = Type.Fish;

    public Fishes(Type type) {
        this.type = type;
    }


    @Override
    public void swim() {

    }
}
