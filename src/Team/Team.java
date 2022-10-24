package Team;

import StrategienInterface.StrategieInterface;

public class Team {
    private StrategieInterface strategieInterface;
    private String manschaftsName;

    public Team(StrategieInterface strategieInterface, String manschaftsName) {
        this.strategieInterface = strategieInterface;
        this.manschaftsName = manschaftsName;
    }
    public void fuehreAus(){
        strategieInterface.fuehreAusStrategie();
    }

    public StrategieInterface getStrategieInterface() {
        return strategieInterface;
    }

    public void setStrategieInterface(StrategieInterface strategieInterface) {
        this.strategieInterface = strategieInterface;
    }

    public String getManschaftsName() {
        return manschaftsName;
    }

    public void setManschaftsName(String manschaftsName) {
        this.manschaftsName = manschaftsName;
    }
}
