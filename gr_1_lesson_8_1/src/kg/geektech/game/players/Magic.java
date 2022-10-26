package kg.geektech.game.players;

public class Magic extends Hero {
    private int boost;
    public Magic(int health, int damage, int boost, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.boost=boost;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+this.boost);
            System.out.println("Magic using boots" + this.boost);



        }

    }
}
