package praktikum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zuordner {
    private final List<Reiter> reiter;
    private final List<Pferd> pferde;

    public Zuordner(List<Reiter> reiter, List<Pferd> pferde) {
        this.reiter = reiter;
        this.pferde = pferde;
    }

    public Map<Reiter, Pferd> zuordnen(Map<Reiter, Pferd> zuordnung) {
        Map<Reiter, Pferd> neueZuordnung = new HashMap<>();

        return neueZuordnung;
    }
}
