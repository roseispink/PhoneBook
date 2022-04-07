package src.src;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Osoba[] ludzie = {
                new Osoba("Arek", "Włodarczyk", "Smolna 5", new NrTelefoniczny(48, 784321564)),
                new Osoba("Ala", "Makota", "Gdanska 141", new NrTelefoniczny(42, 767213948)),
                new Osoba("Damian", "Kowalski", "Zamkowa 14", new NrTelefoniczny(48, 743233164)),
                new Osoba("Daniel", "Chrost", "Rawdwanska 40", new NrTelefoniczny(48, 784998564)),
                new Osoba("Basia", "Orpel", "Wschodnia 62", new NrTelefoniczny(48, 724321764)),
                new Osoba("Ludwik", "Nowak", "Smolna 5", new NrTelefoniczny(48, 786621564))
        };
        Firma[] firmy = {
                new Firma("Dantex", "Piekna 6", new NrTelefoniczny(42, 987564231)),
                new Firma("PresentationDeveloper", "Galicji 45", new NrTelefoniczny(42, 687522281)),
                new Firma("Reserved", "Dobra 14", new NrTelefoniczny(42, 617564258))
        };
  
        TreeMap<NrTelefoniczny, Wpis> treeMap = new TreeMap<>();

        for (Osoba osoba : ludzie) {
            treeMap.put(osoba.getNrTelefoniczny(), osoba);
        }
        for (Firma firma : firmy) {
            treeMap.put(firma.getNrTelefoniczny(), firma);
        }
        //wyswietlanie
        Set<Map.Entry<NrTelefoniczny, Wpis>> entrySet = treeMap.entrySet();
        Iterator<Map.Entry<NrTelefoniczny, Wpis>> iterator = entrySet.iterator();
        Map.Entry<NrTelefoniczny, Wpis> wpis;
        while (iterator.hasNext()) {
            wpis = iterator.next();
            System.out.println(wpis.getValue().opis());
        }

        // kopia, iteratory itp
        int index = 1;
        iterator = entrySet.iterator();
        Iterator<Map.Entry<NrTelefoniczny, Wpis>> iterator2;
        Map.Entry<NrTelefoniczny, Wpis> wpis2;
        TreeMap<NrTelefoniczny, Wpis> copyMap = new TreeMap<>();
        copyMap.putAll(treeMap);

        //porownywanie i usuwanie
        while (iterator.hasNext()) {
            wpis = iterator.next();
            iterator2 = entrySet.iterator();
            for (int j = 0; j < index; j++) {
                wpis2 = iterator2.next();
            }
            while (iterator2.hasNext()) {
                wpis2 = iterator2.next();
                String adres1 = wpis.getValue().getAdres();
                String adres2 = wpis2.getValue().getAdres();
                if (adres1.equals(adres2)) {
                    NrTelefoniczny keyToRemove = wpis2.getKey();
                    copyMap.remove(keyToRemove);
                }
            }
            index++;
        }


        //wystwietlanie po zmianie

        treeMap.clear();
        treeMap.putAll(copyMap);
        iterator = entrySet.iterator();
        System.out.println("---------------------");
        while (iterator.hasNext()) {
            wpis = iterator.next();
            System.out.println(wpis.getValue().opis());
        }
    }
}

