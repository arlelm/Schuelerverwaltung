package Model;

public class Oberstufe extends Schueler{
  
    int _klassengroesse;
  
    public Oberstufe(String name, int alter, String klasse, String adresse, int GroesseDesJahrgangs) {
        super(name, alter, klasse, adresse);
        set_klassengroesse(_klassengroesse);
    }

    public void set_klassengroesse(int _klassengroesse) {
        this._klassengroesse = _klassengroesse;
    }
    public int get_klassengroesse() {
        return _klassengroesse;
    }
}
