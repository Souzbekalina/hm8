package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage,int savedDamage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
        this.savedDamage=savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth()-this.getDamage()+this.savedDamage);
        System.out.println("Berserk usingablity" +  this.getDamage()+this.savedDamage );


    }
}
