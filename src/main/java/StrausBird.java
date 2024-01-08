public class StrausBird extends Birds {

    public StrausBird(int gender, int age, String nickname, String type, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        super(gender, age, nickname, type, isPet, countryBorn, areaLiving, sizing);
    }

    @Override
    public void makeVoice() {
        System.out.println("Хрен тебе а не кар, я страус");
    }

    public void getEggSize() {
        
    }


}
