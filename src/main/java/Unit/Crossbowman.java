package Unit;

public class Crossbowman extends Shooter{

    public Crossbowman(String name,Vector2D position) {
        super(name, 100f, 100, 10, 15, 20, 3,
                5, position.posX, position.posY, 15,5);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(name)
                .append("\t HP: \t").append(hp)
                .append("\t Arrows: ").append(cartridges)
                .append("\t State: \t").append(state)
                .append(" \t|\t|")
                .append("\t|");
    }

    @Override
    public void step() {}

}
