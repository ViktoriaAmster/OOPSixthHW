package Unit;

public class Crossbowman extends Shooter{

    public Crossbowman(String name,Vector2D position) {
        super(name, 100f, 100, 10, 7, 15, 3,
                5, position.posX, position.posY, 15,5);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t ATK: \t").append(Crossbowman.super.attack)
                .append("\t HP: \t").append(Crossbowman.super.hp)
                .append("\t Arrows: ").append(Crossbowman.super.cartridges)
                .append("\t Speed: \t").append(Crossbowman.super.speed);
    }

    @Override
    public void step() {}

}
