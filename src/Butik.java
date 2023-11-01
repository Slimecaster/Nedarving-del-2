public class Butik extends Ejendom
{
    private int butiksareal;
    public Butik() {
    }

    @Override
    int getpris() {
        return pris/butiksareal;
    }

    public Butik(int pris, int beboelsesareal, int butiksareal) {
        super(pris, beboelsesareal);
    }

    @Override
    public String toString() {
        return "Butik{" +
                "pris=" + pris +
                ", beboelsesareal=" + beboelsesareal +
                ", butiksareal=" + butiksareal +
                '}';
    }
}
