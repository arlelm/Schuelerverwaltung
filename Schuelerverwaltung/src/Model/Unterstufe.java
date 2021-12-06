package Model;

public class Unterstufe extends Schueler{
    
    int _klassengroesse;

    public Unterstufe(String name, int alter, String klasse, String adresse) {
        super(name, alter, klasse, adresse);
        set_klassengroesse(_klassengroesse);
    }
   
    public void set_klassengroesse(int _klassengroesse) {
        this._klassengroesse = _klassengroesse;
    }
    public int get_klassengroesse() {
        return _klassengroesse;
    }

    @Override
    public String alleSchueler() {
        return get_adresse() + get_alter() + get_klasse() + get_klasse() + get_klassengroesse();
    }

}
