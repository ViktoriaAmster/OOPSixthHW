package Unit;

import java.util.ArrayList;

public abstract class Infantry extends Human{

    public Infantry(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage, int protection,
                    int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }

    @Override
    public void step(ArrayList<Human> ourTeam, ArrayList<Human> notOurTeam) {
        if (position.getDistance(findNearest(notOurTeam).position)<2) {
            makeDamage(findNearest(notOurTeam));
        } else {
            stepCloser(findNearest(notOurTeam));
        }
    }

    protected void stepCloser(Human pers) {
        int myX = position.posX;
        int myY = position.posY;
        int enemyX = pers.position.posX;
        int enemyY = pers.position.posY;
        if (myY - enemyY < -1) {
            position.posY += 1;
        } else if (myY - enemyY > 1) {
            position.posY -= 1;
        }else if (myX - enemyX < -1){
            position.posX += 1;
        } else if (myX - enemyX > 1) {
            position.posX -= 1;
        }
    }

}
