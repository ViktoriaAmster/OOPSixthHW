package Unit;

public class Sniper extends Shooter{

    public Sniper(String name, Vector2D position) {
        super(name, 100f, 100, 10, 10, 20, 3, 4,
               position.posX, position.posY, 5, 5);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(Sniper.super.name)
                .append("\t ATK: \t").append(Sniper.super.attack)
                .append("\t HP: \t").append(Sniper.super.hp)
                .append("\t Arrows: ").append(Sniper.super.cartridges)
                .append("\t Speed: \t").append(Sniper.super.speed);
    }

    @Override
    public void step() {

    }
}
