package ac;

public class AirCondition {

        private boolean isOn;
    public void turn_on(boolean isOn){

        this.isOn = true;
    }
    public void turn_off(boolean isOff){

        this.isOn = false;
    }
    public  boolean isOn(){

        return isOn;
    }
    public int increaseTemperature( int temperature){
        if(temperature < 16) {
        }
        return temperature+1;
    }


    public int decreasedTemperature(int temperature) {
        if(temperature < 16){

        }
        return temperature -1;
    }

    public int temperatureBeyond30IsStill30(int temperature, int result) {
        if(temperature > 30){

            result = 30;

        }
        return result;

    }

    public int temperatureBelow16IsStill16(int temperature, int result) {
        if(temperature < 16){
            result = 16;
        }
        return result;
    }
}
