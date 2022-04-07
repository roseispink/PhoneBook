package src.src;

public class Osoba extends Wpis{
    private final String imie;
    private final String nazwisko;
    private final String adres;
    private final NrTelefoniczny nrTelefoniczny;

    Osoba(String imie, String nazwisko,String adres, NrTelefoniczny nrTelefoniczny){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nrTelefoniczny = nrTelefoniczny;
    }
  @Override
    public String getAdres(){
      return adres;
    }
   
    public NrTelefoniczny getNrTelefoniczny() {
      return nrTelefoniczny;
    }

    @Override
    String opis() {
        return "Imie i nazwisko: " +imie + " " + nazwisko + ", adres: " + adres+", Numer telefonu: "+ nrTelefoniczny.getNrTelefonu();
    }
}
