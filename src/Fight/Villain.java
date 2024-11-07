package Fight;

public class Villain extends Unit {
    Villain(String name, int attack, int hp) {
        super(hp);
        setAttack(attack);
        setName(name);
        setHp(hp);
    }

}
