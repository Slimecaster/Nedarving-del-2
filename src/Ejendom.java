abstract class Ejendom
{
    protected int pris;
    protected int beboelsesareal;


    public Ejendom() {
    }

    public Ejendom(int pris, int beboelsesareal) {
        this.pris = pris;
        this.beboelsesareal = beboelsesareal;
    }


    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getBeboelsesareal() {
        return beboelsesareal;
    }

    public void setBeboelsesareal(int beboelsesareal) {
        this.beboelsesareal = beboelsesareal;
    }

    abstract int getpris();


    @Override
    public String toString() {
        return "Ejendom{" +
                "pris=" + pris +
                ", beboelsesareal=" + beboelsesareal +
                ", butiksareal=" +
                '}';
    }
}

