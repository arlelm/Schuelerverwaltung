package Model;

public class Mittelstufe extends Schueler{
   
    String _klassensprecher;

    public Mittelstufe(String name, int alter, String klasse, String adresse, String klassensprecher){
        super(name, alter, klasse, adresse);
        set_klassensprecher(_klassensprecher);
    }

    public void set_klassensprecher(String _klassensprecher) {
        this._klassensprecher = _klassensprecher;
    }
    public String get_klassensprecher() {
        return _klassensprecher;
    }

    @Override
    public String alleSchueler() {
      return get_adresse() + get_alter() + get_klasse() + get_klassensprecher();
    }
   



}
