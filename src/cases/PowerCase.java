package cases;

import character.Character;
import character.Jcvd;
import character.Wizard;
import exceptions.MaxStrengthException;
import game.Board;
import powers.Power;

public class PowerCase extends Case{

    private Power power;

    public PowerCase(Power power){
        super(power.toString());
        this.power = power;
    }


    @Override
    public void interaction(Character player, Board board) {
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
        } else if (player instanceof Jcvd){
            if (player.getLeftHand() == null) {
                ((Jcvd) player).setPower(power);
                player.setStrength(player.getStrength() + power.getPowerStrength());
            } else if (player.getLeftHand() != power.getPowerName()){
                ((Jcvd) player).setPower(power);
                player.setStrength(8 + power.getPowerStrength());
            }
        } else {
            System.out.println("==> Un gerrier crache sur la magie");
        }

    }
}
