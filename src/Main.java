public class Main {
    public static void main(String[] args) {
        for (Hero heroes : createHeroes()) {
            System.out.println(heroes);

        }
    }

    private static Hero[] createHeroes() {
        Warrior warrior = new Warrior(500, 50, "Big Hit");{
            Magic magic = new Magic(400, 40, "with fire ");
            Medic medic = new Medic(200, 30, "cures");


        }

}