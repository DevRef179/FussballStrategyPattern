package Stratregien;

import StrategienInterface.StrategieInterface;

public class OffensivStrategie implements StrategieInterface {
    @Override
    public void fuehreAusStrategie() {
        System.out.println("Jetzt wird nach vorne gespielt!");
    }
}
