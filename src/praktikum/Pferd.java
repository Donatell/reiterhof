package praktikum;

public class Pferd {
    private final String name;
    private final Schwierigkeitsgrad schwierigkeitsgrad;

    public Pferd(String name, Schwierigkeitsgrad schwierigkeitsgrad) {
        this.name = name;
        this.schwierigkeitsgrad = schwierigkeitsgrad;
    }

    public Schwierigkeitsgrad getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    public String getName() {
        return name;
    }
}
