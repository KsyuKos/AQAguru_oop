import static Enums.Gender.Male;

public class Main {
    public static void main (String[] arg){
        StrausBird straus = new StrausBird(Male,3,"Alex",true,"Россия","Land","Крупный",false);
        straus.makeVoice();
        straus.setSpeed(55.99);
        straus.setWinterFly(true);
        straus.winterFly();
        straus.run();
    }
}