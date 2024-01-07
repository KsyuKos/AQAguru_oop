public abstract class Animals {
    protected int gender;
    protected int age;
    protected String nickname;
    protected String type;
    protected boolean isPet;
    protected String countryBorn;
    protected String areaLiving;

    public Animals(int gender, int age, String nickname, String type, boolean isPet, String countryBorn) {
        this.gender = gender;
        this.age = age;
        this.nickname = nickname;
        this.type = type;
        this.isPet = isPet;
        this.countryBorn = countryBorn;
    }

    public void setAreaLiving(String areaLiving) {
        this.areaLiving = areaLiving;
    }

    public boolean isPet() {
        return isPet;
    }

}
