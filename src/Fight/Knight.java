package Fight;

public class Knight extends Unit {
    Knight(String name, int attack, int hp) {
        super(hp);
        setAttack(attack);
        setName(name);
        setHp(hp);
    }

}
