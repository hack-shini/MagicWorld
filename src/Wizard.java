public class Wizard extends Character{

    @Override
    public int basicAttack() {
       return getIntelligence();
    }

    @Override
    public int specialAttack() {
       return getLife() + (getIntelligence() * 2);
    }

    @Override
    public String  warCry() {
        return "Abracadabra, je suis le magicien de ";
    }
}
