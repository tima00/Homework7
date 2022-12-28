public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(500, 50, "Big Hit");
            Magic magic = new Magic(400, 40, "with fire ");
            Medic medic = new Medic(200, 30, "cures");

            Hero[] heroes = new Hero[]{warrior, magic, medic};
        }
}