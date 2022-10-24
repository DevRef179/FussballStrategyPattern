package Stratregien;

import StrategienInterface.StrategieInterface;

public class DefensivSpielenStrategie implements StrategieInterface {
    @Override
    public void fuehreAusStrategie() {
        System.out.println("Jetzt wird Verteidigt!");
    }
}
