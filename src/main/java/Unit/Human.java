package Unit;

import java.util.ArrayList;

public abstract class Human implements GameInterface {

    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int minDamage;
    protected int maxDamage;
    protected int protection;
    protected int speed;
    protected Vector2D position;

    public Human(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage,
                 int protection, int speed, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.protection = protection;
        this.speed = speed;
        this.position = new Vector2D(posX, posY);
    }

    public int getSpeed() {return this.speed;}
    public float getHp() {return this.hp;}
    public void setHp(float hp) {this.hp = hp;}
    public int getProtection() {return this.protection;}

    protected Human findNearest (ArrayList<Human> team) {
        double distance = position.getDistance(team.get(0).position);
        int indexOfNearest = 0;
        for (int i = 1; i < team.size(); i++) {
            double distanceWithI = position.getDistance(team.get(i).position);
            if (distanceWithI < distance){
                indexOfNearest = i;
                distance = distanceWithI;
            }
        }
        return team.get(indexOfNearest);
    }

    public static ArrayList<Human> findLive(ArrayList<Human> team) {
        ArrayList<Human> liveTeam = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getHp() > 0){liveTeam.add(team.get(i));}
        }
        return liveTeam;
    }

    protected void makeDamage (Human enemy) {
        int damage = enemy.getProtection() - attack;
        if (damage > 0){enemy.setHp((enemy.getHp() - minDamage)>=0?(enemy.getHp() - minDamage):0);}
        else if (damage < 0) {enemy.setHp((enemy.getHp() - maxDamage)>=0?(enemy.getHp() - maxDamage):0);}
        else {
            float averageDamage = (minDamage+maxDamage)/2;
            enemy.setHp((enemy.getHp() - averageDamage)>=0?(enemy.getHp() - averageDamage):0);}
    }

    public void step(ArrayList<Human> lightSide, ArrayList<Human> darkSide) {
    }
}



