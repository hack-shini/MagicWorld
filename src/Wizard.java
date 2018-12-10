public class Wizard extends Character{

    @Override
    public int basicAttack() {
       return getIntelligence();
    }

    @Override
    public int specialAttack() {
        int basicLife = getLife();
        int newVitality = getLife() + (getIntelligence() * 2);

        // condition for not having more life than at the beginning
        if (newVitality > basicLife){
            System.out.println("En faisant cette attaque spéciale vous auriez plus de vie qu'au début du combat, ce qui est impossible.");
            System.out.println("Vous revenez donc au point de vie de départ, soit : " + getLife());
            setLife(basicLife);
        }else {
            System.out.println("Vous gagner : " + newVitality + " de vie.");
            setLife(newVitality);
        }


       return 0;
    }

    @Override
    public String  warCry() {
        return "Abracadabra, je suis le magicien de ";
    }
}
