public class Wizard extends Character{

    @Override
    public int basicAttack() {
       return getIntelligence();
    }

    @Override
    public void specialAttack() {
    }

    @Override
    public String  warCry() {
        return "Abracadabra, je suis le magicien de ";
    }
}
