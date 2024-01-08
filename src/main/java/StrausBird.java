import Enums.Gender;
import Enums.Type;
import Interfaces.LandAnimals;

public class StrausBird extends Birds implements LandAnimals {

    public StrausBird(Gender gender, int age, String nickname, boolean isPet, String countryBorn, String areaLiving, String sizing, boolean isFlight) {
        super(gender, age, nickname, isPet, countryBorn, areaLiving, sizing, isFlight);
    }

    @Override
    public void makeVoice() {
        System.out.println("Хрен тебе а не кар, я страус");
    }

    @Override
    public void run() {
        System.out.println("Страус бежит");
    }

    @Override
    public void stay() {
        System.out.println("Страус стоит");
    }

    @Override
    public void jump() {
        System.out.println("Страус прыгает");
    }



}
