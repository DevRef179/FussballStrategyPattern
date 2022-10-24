package Stratregien;

import StrategienInterface.StrategieInterface;

public class AufZeitSpielenStrategie implements StrategieInterface {
    @Override
    public void fuehreAusStrategie() {
        System.out.println("Auf zeit Spielen ball wechsel!");
    }
}
