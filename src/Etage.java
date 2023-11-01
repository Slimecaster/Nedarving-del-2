public class Etage extends Ejendom
{
    private int antalEtage;
    private int butiksareal;

    public Etage() {
    }

    @Override
    int getpris() {
        return pris/(butiksareal+beboelsesareal);
    }

    public Etage(int pris, int beboelsesareal, int butiksareal, int antalEtage) {
        super(pris, beboelsesareal);
        this.antalEtage = antalEtage;
        this.butiksareal=butiksareal;
    }

    public int getAntalEtage() {
        return antalEtage;
    }

    public void setAntalEtage(int antalEtage) {
        this.antalEtage = antalEtage;
    }

    public int getButiksareal() {
        return butiksareal;
    }

    public void setButiksareal(int butiksareal) {
        this.butiksareal = butiksareal;
    }

    @Override
    public String toString() {
        return "Etage{" +
                "antalEtage=" + antalEtage +
                ", pris=" + pris +
                ", beboelsesareal=" + beboelsesareal +
                ", butiksareal=" + butiksareal +
                '}';
    }
}
