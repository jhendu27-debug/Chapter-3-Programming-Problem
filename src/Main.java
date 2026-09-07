public class Main {

    public static void main(String[] args) {

        final int CAPACITY = 5;

        ChaosRune[] runes = new ChaosRune[CAPACITY];

        runes[0] = new ChaosRune(1, "Flame Stone", RuneElement.FIRE, 95.75);
        runes[1] = new ChaosRune(2, "Mystic Stone", RuneElement.ARCANE, 82.50);
        runes[2] = new ChaosRune(3, "Shadow Stone", RuneElement.VOID, 67.99);

        System.out.println(runes[0].name);
        System.out.println(runes[1].name);
        System.out.println(runes[3]);

        int truncatedEnergy = (int) runes[0].energyLevel;

        System.out.println("Original energy: " + runes[0].energyLevel);
        System.out.println("Truncated energy: " + truncatedEnergy);
    }
}