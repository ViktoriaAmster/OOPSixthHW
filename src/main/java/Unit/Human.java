package Unit;

public abstract class Human implements GameInterface {

    protected String name;
    protected Float hp;
    protected Integer maxHp;
    protected Integer attack;
    protected Integer minDamage;
    protected Integer maxDamage;
    protected Integer protection;
    protected Integer speed;
    protected Integer posX;
    protected Integer posY;


    public Human(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.protection = protection;
        this.speed = speed;

    }


    public Integer getAttack() {
        return attack;
    }
    public Integer getProtection() { return protection; }
//    public Integer getDamage() { return damage; }

    public int getSpeed() {
        return speed;
    }


    public abstract void step();
}
