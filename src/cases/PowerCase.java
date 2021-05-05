package cases;

import character.Character;
import character.Wizard;
import exceptions.MaxStrengthException;
import powers.Power;

public class PowerCase extends Case{

    private Power power;
    private String sentence;

    public PowerCase(Power power){
        this.power = power;
        this.sentence = power.toString();
    }

    @Override
    public String toString() {
        return sentence;
    }

    @Override
    public void interaction(Character player) {
        if (player instanceof Wizard){
            if (player.getLeftHand() == null) {
                ((Wizard) player).setPower(power);
                player.setStrength(player.getStrength() + power.getPowerStrength());
            } else if (player.getLeftHand() != power.getPowerName()){
                ((Wizard) player).setPower(power);
                player.setStrength(8 + power.getPowerStrength());
            }

            //EXCEPTION FOR MAX STRENGTH /////////////////// EVEN ITS NOT REALLY POSSIBLE WITHOUT CHEAT
            try {
                if (player.getStrength() > 15 ) {
                    throw new MaxStrengthException();
                }
            } catch (MaxStrengthException e) {
                player.setStrength(15);
            }
        } else {
            System.out.println("==> Un gerrier crache sur la magie");
        }

    }
}
