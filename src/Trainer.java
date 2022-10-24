import Stratregien.AufZeitSpielenStrategie;
import Stratregien.DefensivSpielenStrategie;
import Stratregien.OffensivStrategie;
import Team.Team;

public class Trainer {
    public static void main(String[] args) {
        System.out.println("Anpfiff, das Spiel kann losgehen");

        trainerAnweisungen();
    }
    public static void trainerAnweisungen(){
        Team fcFeuerbach = new Team(new OffensivStrategie(),"FC Bayern München");
        Team fcBotnang =  new Team(new DefensivSpielenStrategie(),"FC Botnang");
        Team fcRefki = new Team(new AufZeitSpielenStrategie(),"FC Refki");

        System.out.println(" ");
        System.out.println("-- Team 1 --");
        System.out.println(fcFeuerbach.getManschaftsName() +": ");
        fcFeuerbach.fuehreAus();

        System.out.println("\n");
        System.out.println("-- Team 2 --");
        System.out.println(fcBotnang.getManschaftsName()+" ");
        fcBotnang.fuehreAus();
        System.out.println("\n");
        System.out.println("-- Team 3 --");
        System.out.println(fcRefki.getManschaftsName()+" ");
        fcRefki.fuehreAus();
    }
}
