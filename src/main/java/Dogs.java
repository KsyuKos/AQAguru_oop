import Enums.Gender;
import Enums.Type;
import Interfaces.LandAnimals;

public class Dogs extends Animals implements LandAnimals {


    public Dogs(Gender gender, int age, String nickname, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        super(gender, age, nickname, Type.Mammal, isPet, countryBorn, areaLiving, sizing);
    }

    @Override
    public void makeVoice() {
        System.out.println(nickname + " говорит Гав");
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
