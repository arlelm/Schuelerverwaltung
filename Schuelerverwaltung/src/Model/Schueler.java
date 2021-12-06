package Model;

public abstract class Schueler {
    
    String _name;
    int _alter;
    String _klasse;
    String _adresse;


    public Schueler(String name, int alter, String klasse, String adresse){
        set_adresse(_adresse);
        set_alter(_alter);
        set_klasse(_klasse);
        set_name(_name);
    }

    public abstract String alleSchueler();

    public void set_adresse(String _adresse) {
        this._adresse = _adresse;
    }
    public void set_alter(int _alter) {
        this._alter = _alter;
    }
    public void set_klasse(String _klasse) {
        this._klasse = _klasse;
    }
    public void set_name(String _name) {
        this._name = _name;
    }
    
    
    public String get_adresse() {
        return _adresse;
    }
    public int get_alter() {
        return _alter;
    }
    public String get_klasse() {
        return _klasse;
    }

    public static void add(Unterstufe u) {
    }

    public static void add(Mittelstufe ms) {
    }

    public static void add(Oberstufe os) {
    }
}
