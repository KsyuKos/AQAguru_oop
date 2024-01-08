import Enums.Gender;
import Enums.Type;

import java.util.List;

public abstract class Birds extends Animals {

    protected boolean isFlight;
    protected double speed;
    protected boolean winterFly;
    protected static List<String> coldCountry = List.of("Россия", "Норвегия", "Финляндия");

    public Birds(Gender gender, int age, String nickname, boolean isPet, String countryBorn, String areaLiving, String sizing, boolean isFlight) {
        super(gender, age, nickname, Type.Bird, isPet, countryBorn, areaLiving, sizing);
        this.isFlight = isFlight;
    }

    public boolean isFlight() {
        return isFlight;
    }

    public void setWinterFly(boolean winterFly) {
        if (!isFlight()) {
            this.winterFly = false;
            System.out.println("Эта птица летать не умеет, установлен признак неперелетности по умолчанию.");
        } else this.winterFly = winterFly;
    }

    private boolean needWinterFly() {
        return this.winterFly;
    }

    public void setSpeed(double speed) {
        if (isFlight()) {
            this.speed = speed;
        } else {
            System.out.println("Эта птица летать не умеет. Скорость не задана.");
        }
    }

    private boolean isColdCountry(String country) {
        return coldCountry.contains(country);
    }

    public void getWinterFly() {
        if (needWinterFly()) {
            System.out.println("Эта птица улетает на зиму");
        } else if (!isColdCountry(this.countryBorn)) {
            System.out.println("Птица и так живет в теплом климате");
        } else System.out.println("Это неперелетная птица");
    }


}

