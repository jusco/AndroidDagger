package android.tokainum.baseproject.model;

/**
 * Created by Justin on 9/17/2017.
 */

public class ElectricHeater implements Heater {

    private int heat;

    public void setHeat(int heat) {
        this.heat = heat;
    }
    public int getHeat() {
        return heat;
    }
}
