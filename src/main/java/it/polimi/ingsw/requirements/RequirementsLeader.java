package it.polimi.ingsw.requirements;

import it.polimi.ingsw.player.Player;
import it.polimi.ingsw.requirements.Requirements;

public abstract class RequirementsLeader implements Requirements {
    /**
     * check if the card requirements are met
     * @param player is the player who uses the Card
     * @return 1 if the requirements are met, 0 otherwise
     */
    public abstract boolean checkResources(Player player);
}
