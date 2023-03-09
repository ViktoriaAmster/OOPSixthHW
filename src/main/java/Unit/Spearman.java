package Unit;

public class Spearman extends Infantry{
    public Spearman(String name, Vector2D position) {
        super(name, 20f,20,10, 9,15, 5,4, position.posX, position.posY);}

    public void runAway() {    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(name)
                .append("\t HP: \t").append(hp)
                .append("\t State: \t").append(state)
                .append(" \t|\t|")
                .append("\t|");
    }

    @Override
    public void step() {

    }
}
