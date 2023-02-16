package Unit;

public class Monk extends Supernatural{

    int FreezeStep;
    public Monk(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
    }

    public Monk(String name) { super(name,7,10,8,8,6,2,10,15); }

    public Integer FreezeWitch(Witch witch){
        return FreezeStep;
    }


    //замораживает ходы колдуна на несколько ходов
    //повышает HP игроков
}
