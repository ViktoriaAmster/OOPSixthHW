package Unit;

import java.util.ArrayList;

public class Witch extends Magic {
    public Witch(String name, Vector2D position) {
        super(name, 40f, 40, 7, 1, 5, 2, 3,
                position.posX, position.posY, 60, 60,6);
    }

    @Override
    public void step() {}

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(name)
                .append("\t HP: \t").append(hp)
                .append("\t MP: \t").append(mana)
                .append("\t State: \t").append(state)
                .append("\t|")
                .append("\t|");
    }

    public void step(ArrayList<Human> ourTeam, ArrayList<Human> notOurTeam) {}
}
