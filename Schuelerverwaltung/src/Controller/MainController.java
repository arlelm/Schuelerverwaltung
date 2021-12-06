package Controller;
import Model.*;
import View.*;
import java.util.ArrayList;

public class MainController {
    
    public void MainController(){
        
        ArrayList<Schueler> schuelers = new ArrayList<Schueler>();


        Output o = new Output();

        Unterstufe us = new Unterstufe("Leo", 11, "a", "Langenhornerchausse");
        Schueler.add(us);

        Oberstufe os = new Oberstufe("Lennard", 16, "S.1", "Wulfgrund", 10);
        Schueler.add(os);

        Mittelstufe ms = new Mittelstufe("Alexander", 14, "d", "Diekmoor", "Bennet");
        Schueler.add(ms);

        for(Schueler schueler : schuelers){
            o.printData(schueler.alleSchueler());
        }
    }

}
