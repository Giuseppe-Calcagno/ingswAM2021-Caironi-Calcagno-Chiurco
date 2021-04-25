package it.polimi.ingsw.model.marbles;

import it.polimi.ingsw.model.exceptions.ActiveVaticanReportException;
import it.polimi.ingsw.model.player.Player;

public class RedMarble extends Marbles {
    /**
     * This method converts a red marble into a faith point
     * @param p reference to the player's Warehouse depots
     */
    @Override
    public boolean addtoWarehouse(Player p, int i) throws ActiveVaticanReportException {
        if (p.getFaithMarker() == 24)
            return false;
        else {
            p.increasefaithMarker();
            return true;
        }
    }
}