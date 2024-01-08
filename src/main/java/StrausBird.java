import Interfaces.GroundAnimals;

public class StrausBird extends Birds implements GroundAnimals {

    public StrausBird(int gender, int age, String nickname, String type, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        super(gender, age, nickname, type, isPet, countryBorn, areaLiving, sizing);
    }

    @Override
    public void makeVoice() {
        System.out.println("Хрен тебе а не кар, я страус");
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
