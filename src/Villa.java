public class Villa extends Ejendom
{
    private int antalRum;

    public Villa() {
    }

    @Override
    int getpris() {
       return pris/beboelsesareal;
    }

    public Villa(int pris, int beboelsesareal, int antalRum) {
        super(pris, beboelsesareal );
        this.antalRum = antalRum;
    }

    public int getAntalRum() {
        return antalRum;
    }

    public void setAntalRum(int antalRum) {
        this.antalRum = antalRum;
    }

    public int pris(){
       return pris/beboelsesareal;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "antalRum=" + antalRum +
                ", pris=" + pris +
                ", beboelsesareal=" + beboelsesareal +
                ", butiksareal=" +
                ", antaletager=" +
                '}';
    }
}
