package Unit;

public abstract class Human implements GameInterface {

    protected String name;
    protected Integer hp;
    protected Integer maxHp;
    protected Integer attack;
    protected Integer damage;
    protected Integer protection;
    protected Integer speed;

    public Human(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damage = damage;
        this.protection = protection;
        this.speed = speed;
    }

    public String getName() { return this.name; }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return this.attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getProtection() {
        return this.protection;
    }

    public void setProtection(Integer secrecy) {
        this.protection = secrecy;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getInfo() {
        return "   ";
    }

    public void step(int a) {
    }
}
