package Unit;

public class Sniper extends Shooter{

    public Sniper(String name, Vector2D position) {
        super(name, 100f, 100, 10, 10, 30, 3, 4,
               position.posX, position.posY, 5, 5);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(name)
                .append("\t HP: \t").append(hp)
                .append("\t Arrows: ").append(cartridges)
                .append("\t State: \t").append(state)
                .append(" \t|\t|")
                .append("\t|");
    }

    @Override
    public void step() {

    }
}
