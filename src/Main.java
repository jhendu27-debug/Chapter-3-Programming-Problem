public class Main {

    public static void main(String[] args) {

        final int CAPACITY = 5;

        RuneCore sharedCore = new RuneCore("Aether Well");

        ChaosRune[] runes = new ChaosRune[CAPACITY];

        runes[0] = new ChaosRune(101, "Shadow Rune",
                RuneElement.VOID, 95.678, sharedCore);

        runes[1] = new ChaosRune(102, "Flame Rune",
                RuneElement.FIRE, 87.456, sharedCore);

        runes[2] = new ChaosRune(103, "Storm Rune",
                RuneElement.ARCANE, 76.891, sharedCore);


        // Phase 1 testing
        System.out.println("Testing specific array slots:");
        System.out.println(runes[0]);
        System.out.println(runes[3]);


        // Phase 2 casting
        int truncatedEnergy = (int) runes[0].energyLevel;
        System.out.println("\nTruncated Energy: " + truncatedEnergy);


        // Phase 3 shared reference test
        runes[0].core.powerSource = "Void Rift";
        System.out.println("Shared Core Power Source: "
                + runes[1].core.powerSource);


        // Phase 4 array traversal and null safety
        System.out.println("\n--- Archive Roster ---");

        for (int i = 0; i < runes.length; i++) {

            if (runes[i] != null) {

                int truncatedRuneEnergy = (int) runes[i].energyLevel;

                System.out.println("Slot [" + i + "]");
                System.out.println("ID: " + runes[i].id);
                System.out.println("Name: " + runes[i].name);
                System.out.println("Element: " + runes[i].element);
                System.out.println("Truncated Energy: "
                        + truncatedRuneEnergy);
                System.out.println("Core Power Source: "
                        + runes[i].core.powerSource);

                System.out.println();

            } else {
                System.out.println("Slot [" + i
                        + "] is empty / phased out");
            }
        }
    }
}