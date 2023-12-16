import kg.geeks.hw5.templates.*;

public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setHealth(1000);
    boss.setDamage(50);
    boss.setDefenseType("Armor");

    System.out.println("Информация о боссе:");
    System.out.println("Здоровье: " + boss.getHealth());
    System.out.println("Урон: " + boss.getDamage());
    System.out.println("Тип защиты: " + boss.getDefenseType());
    System.out.println();

    Hero[] heroes = createHeroes();

    System.out.println("Информация о героях:");
    for (Hero hero : heroes) {
        System.out.println("Здоровье: " + hero.getHealth());
        System.out.println("Урон: " + hero.getDamage());
        System.out.println("Суперспособность: " + hero.getPower());
        System.out.println();
    }
}


private static Hero[] createHeroes() {
    Hero hero1 = new Hero(100, 20, "Летающий");
    Hero hero2 = new Hero(150, 30);
    Hero hero3 = new Hero(120, 25, "Невидимый");

    return new Hero[]{hero1, hero2, hero3};
}
