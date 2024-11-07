package Fight;

public class Unit {
    private String name;
    private int attack;
    private int hp;
    private final int MAX_HP;

    Unit(int maxHp) {
        MAX_HP = maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMAX_HP() {
        return MAX_HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
