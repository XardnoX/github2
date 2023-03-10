package cz.oauh;

public class Zakaznik {
    private String jmeno;
    private int pocetProdeju;

    public Zakaznik(String jmeno, int pocetProdeju) {
        this.jmeno = jmeno;
        this.pocetProdeju = pocetProdeju;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public String getPocetProdejuCitelne() {
        return "1:"+getPocetProdeju();
    }

    public void setPocetProdeju(int pocetProdeju) {
        if (pocetProdeju <=0) {

            throw new RuntimeException("Počet prodejů nesmí být záporný ("+pocetProdeju+")!");
        }
        this.pocetProdeju = pocetProdeju;
    }

    @Override
    public String toString() {
        return "" +
                "jmeno :'" + jmeno +
                ", pocetProdeju :" + pocetProdeju
                +'\n' ;

    }
}
