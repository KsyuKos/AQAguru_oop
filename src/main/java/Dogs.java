import Interfaces.GroundAnimals;

public class Dogs extends Animals implements GroundAnimals {


    public Dogs(int gender, int age, String nickname, String type, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        super(gender, age, nickname, type, isPet, countryBorn, areaLiving, sizing);
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
