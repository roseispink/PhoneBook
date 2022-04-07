package src.src;

public class NrTelefoniczny implements  Comparable{
    private final int nrKierunkowy;
    private final long nrTelefonu;

    NrTelefoniczny(int nrKierunkowy, int nrTelefonu){
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }
    public int getNrKierunkowy(){
        return nrKierunkowy;
    }

    public long getNrTelefonu() {
        return nrTelefonu;
    }

    @Override
    public int compareTo(Object o) {
        return (int)(nrTelefonu - ((NrTelefoniczny)o).getNrTelefonu());
    }
}
