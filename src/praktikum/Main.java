package praktikum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pferd alex = new Pferd("Alex", Schwierigkeitsgrad.ANFAENGER);
        Pferd nicki = new Pferd("Nicki", Schwierigkeitsgrad.GUT);
        Pferd pucki = new Pferd("Pucki", Schwierigkeitsgrad.ANFAENGER);
        Pferd wittchen = new Pferd("Wittchen", Schwierigkeitsgrad.ANFAENGER);
        Pferd hurrikan = new Pferd("Hurrikan", Schwierigkeitsgrad.GUT);
        Pferd tornado = new Pferd("Tornado", Schwierigkeitsgrad.SEHR_GUT);
        Pferd sturmwind = new Pferd("Sturmwind", Schwierigkeitsgrad.GUT);
        Pferd zausel = new Pferd("Zausel", Schwierigkeitsgrad.ANFAENGER);
        Pferd zackzack = new Pferd("Zackzack", Schwierigkeitsgrad.SEHR_GUT);

        List<Pferd> pferde = new ArrayList<>(Arrays.asList(
                alex,
                nicki,
                pucki,
                wittchen,
                hurrikan,
                tornado,
                sturmwind,
                zausel,
                zackzack
        ));

        List<Reiter> reiter = new ArrayList<>(Arrays.asList(
                new Reiter(
                        "Anja",
                        Schwierigkeitsgrad.ANFAENGER,
                        new ArrayList<>(Arrays.asList(nicki, pucki, wittchen, alex))
                ),
                new Reiter(
                        "Bertram",
                        Schwierigkeitsgrad.GUT,
                        new ArrayList<>(pferde)
                ),
                new Reiter(
                        "Christa",
                        Schwierigkeitsgrad.SEHR_GUT,
                        new ArrayList<>(Collections.singletonList(hurrikan)
                        )
                ),
                new Reiter(
                        "Doris",
                        Schwierigkeitsgrad.ANFAENGER,
                        new ArrayList<>(Arrays.asList(alex, wittchen, pucki))
                ),
                new Reiter(
                        "Emil",
                        Schwierigkeitsgrad.ANFAENGER,
                        new ArrayList<>(pferde)
                ),
                new Reiter(
                        "Fritz",
                        Schwierigkeitsgrad.SEHR_GUT,
                        new ArrayList<>(Arrays.asList(sturmwind, hurrikan))
                ),
                new Reiter(
                        "Gabi",
                        Schwierigkeitsgrad.GUT,
                        new ArrayList<>(Arrays.asList(hurrikan, alex, sturmwind, tornado))
                )
        )
        );

        Zuordner zuordner = new Zuordner(reiter, pferde);
        Map<Reiter, Pferd> zuordnung = zuordner.zuordnen(new HashMap<>());

        for (Reiter zugeordneterReiter : zuordnung.keySet()) {
            System.out.printf(
                    "%s reitet %s.\n",
                    zugeordneterReiter.getName(),
                    zuordnung.get(zugeordneterReiter).getName()
            );
        }
    }
}
