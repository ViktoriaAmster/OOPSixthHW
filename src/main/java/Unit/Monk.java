package Unit;

import java.util.ArrayList;

public class Monk extends Magic {

    public Monk(String name, Vector2D position) {
        super(name, 40f, 40, 5,1,5,5,3, position.posX, position.posY,
                50, 50, 15);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(name)
                .append("\t HP: \t").append(hp)
                .append("\t MP: \t").append(mana)
                .append("\t State: \t").append(state)
                .append(" \t|\t|")
                .append("\t|");

    }

    @Override
    public void step() {

    }

    public void step(ArrayList<Human> ourTeam, ArrayList<Human> notOurTeam) {
        }

}
