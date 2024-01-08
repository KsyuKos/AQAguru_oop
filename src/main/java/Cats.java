import Enums.Gender;
import Enums.Type;
import Interfaces.LandAnimals;

public class Cats extends Animals implements LandAnimals {


    public Cats(Gender gender, int age, String nickname, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        super(gender, age, nickname, Type.Mammal, isPet, countryBorn, areaLiving, sizing);
    }

    @Override
    public void makeVoice() {
        System.out.println(nickname + " говорит Мяу");
    }

    @Override
    public void run() {

    }

    @Override
    public void stay() {

    }

    @Override
    public void jump() {

    }
}
