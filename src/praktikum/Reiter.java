package praktikum;

import java.util.List;

public class Reiter {
    private final String name;
    private final Schwierigkeitsgrad koennen;
    private final List<Pferd> wuenschpferde;

    public Reiter(String name, Schwierigkeitsgrad koennen, List<Pferd> wuenschpferde) {
        this.name = name;
        this.koennen = koennen;
        this.wuenschpferde = wuenschpferde;
    }

    public String getName() {
        return name;
    }

    public boolean kannReiten(Pferd pferd) {
        return koennen.ordinal() >= pferd.getSchwierigkeitsgrad().ordinal();
    }

    public boolean wuenscht(Pferd pferd) {
        return wuenschpferde.contains(pferd);
    }
}
