public abstract class Birds extends Animals {

    protected boolean isFlight;
    protected double speed;
    protected boolean winterFly;

    public Birds(int gender, int age, String nickname, String type, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        super(gender, age, nickname, type, isPet, countryBorn, areaLiving, sizing);
    }

    public void setFlight(boolean flight) {
        isFlight = flight;
    }

    public void setNeedWinterFly(boolean needWinterFly) {
        this.winterFly = needWinterFly;
    }

    public boolean isFlight() {
        return isFlight;
    }

    public void setSpeed(double speed) {
        if (isFlight()) {
            this.speed = speed;
        } else {
            System.out.println("Эта птица летать не умеет");
        }
    }

    public boolean needWinterFly() {
        return this.winterFly;
    };

    public void winterFly() {
        if(needWinterFly()) {
            System.out.println("Эта птица улетает на зиму");
        }
    };



}

