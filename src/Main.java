public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(2000, 100, "Magical");

        System.out.println("Boss stats: " + boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefenceType());
    }
}