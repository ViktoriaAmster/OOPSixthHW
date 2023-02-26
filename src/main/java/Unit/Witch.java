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
        return builder.append("Колдун: \t").append(Witch.super.name)
                .append("\t ATK: \t").append(Witch.super.attack)
                .append("\t HP: \t").append(Witch.super.hp)
                .append("\t MP: \t").append(Witch.super.mana)
                .append("\t Speed: \t").append(Witch.super.speed);
    }

    public void step(ArrayList<Human> ourTeam, ArrayList<Human> notOurTeam) {}
}
