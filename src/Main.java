public class Main {

    public static void main(String[] args) {

        final int CAPACITY = 5;

        ChaosRune[] runes = new ChaosRune[CAPACITY];

        runes[0] = new ChaosRune(1, "Flame Stone", RuneElement.FIRE);
        runes[1] = new ChaosRune(2, "Mystic Stone", RuneElement.ARCANE);
        runes[2] = new ChaosRune(3, "Shadow Stone", RuneElement.VOID);

        System.out.println(runes[0].name);
        System.out.println(runes[1].name);
        System.out.println(runes[3]);
    }
}