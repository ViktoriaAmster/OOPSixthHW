package Unit;

public class Farmer extends Human{
    protected int arrows;
    public Farmer(String name,Vector2D position) {
        super(name, 10f, 10, 3,1,3,1, 1, position.posX, position.posY);
        this.arrows = 1;
    }

    public int getArrows() {return arrows;}
    public void setArrows(int arrows) {this.arrows = arrows;}

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(name)
                .append("\t HP: \t").append(hp)
                .append("\t State: \t").append(state)
                .append(" \t|\t|")
                .append("\t|");
    }

    @Override
    public void step() {
        if (arrows == 0){
            arrows += 1;
        }

    }

}
