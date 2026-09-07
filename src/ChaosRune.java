public class ChaosRune {

    int id;
    String name;
    RuneElement element;
    double energyLevel;
    RuneCore core;

    public ChaosRune(int id, String name, RuneElement element,
                     double energyLevel, RuneCore core) {

        this.id = id;
        this.name = name;
        this.element = element;
        this.energyLevel = energyLevel;
        this.core = core;
    }
}