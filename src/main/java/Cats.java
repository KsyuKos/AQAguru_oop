import Interfaces.GroundAnimals;

public class Cats extends Animals implements GroundAnimals {


    public Cats(int gender, int age, String nickname, String type, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        super(gender, age, nickname, type, isPet, countryBorn, areaLiving, sizing);
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
