package src.src;

public class Firma extends Wpis{
    private final String nazwa;
    private final String adres;
    private final NrTelefoniczny nrTelefoniczny;

    Firma(String nazwa, String adres, NrTelefoniczny nrTelefoniczny){
        this.nazwa = nazwa;
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
        return "Nazwa firmy: " + nazwa + ", adres: " + adres + ", Numer telefonu: "+ nrTelefoniczny.getNrTelefonu();
    }
}
