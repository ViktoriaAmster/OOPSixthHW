package Unit;

public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected double getDistance(Vector2D otherPers) {
        return Math.sqrt(Math.pow(otherPers.posY-posY,2)+ Math.pow(otherPers.posX-posX,2));
    }
}

