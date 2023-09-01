package dir.aulas.methods;

public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A SmartTv está ligada?  " + smartTv.on);
        System.out.println("Volume inicial:  " + smartTv.volume);
        //System.out.println("Canal inicial:  " + smartTv.channel);

        smartTv.turnOn();
        //System.out.println("A SmartTv está ligada?  " + smartTv.on);

        smartTv.changeChannel(11);
        //System.out.println("Canal atual:  " + smartTv.channel);

        smartTv.upChannel();
        smartTv.upChannel();
        smartTv.upChannel();
        smartTv.downChannel();
        System.out.println("Canal atual:  " + smartTv.channel);

        smartTv.turnOff();

        smartTv.turnOn();
        smartTv.upVolume();
        smartTv.upVolume();
        System.out.println("Volume atual:  " + smartTv.volume);
    }
}