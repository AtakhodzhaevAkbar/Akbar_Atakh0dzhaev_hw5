package kg.geeks.hw5.templates;

public class Hero {
    private int health;
    private int damage;
    private String power;

    public Hero() {
    }

    public Hero(int health, int damage, String power) {
        this.health=health;
        this.damage=damage;
        this.power=power;
    }
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.power="Отсутствует";
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public String getPower(){
        return power;
    }
}