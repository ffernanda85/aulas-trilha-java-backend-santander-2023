public class SmartTv {
    
    boolean on = false;
    int volume = 25;
    int channel = 1;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void upVolume() {
        if(on){
            if(volume < 100){
                volume++;
            } 
        }
    }

    public void downVolume() {
        if(on){
            if(volume >= 1){
                volume--;
            } 
        }
    }

    public void upChannel() {
        if(on){
            if(channel < 999){
                channel++;
            } 
        }
    }

    public void downChannel() {
        if(on){
            if(channel > 1){
                channel--;
            } 
        }
    }

    public void changeChannel(int newChannel) {
        if(on){
            channel = newChannel;    
        }
    }

}
