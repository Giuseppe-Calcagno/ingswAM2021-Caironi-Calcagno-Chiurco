package it.polimi.ingsw.model.game;

import it.polimi.ingsw.model.exceptions.GameFinishedException;
import it.polimi.ingsw.model.player.Player;

import java.util.ArrayList;

public class FaithTrack {
    /**
     * this attribute is a integer  indicating the faithtrack vector length
     */
    private final static int faithtracksize = 25;

    /**
     * this attribute is a integer  indicating the popsfavouritetilepoints vector length
     */
    private final static int popsfavouritetilepointsize = 3;

    /**
     * this attribute is a integer vector indicating the Victorypoints on the faith track
     */
    private final int[] faithtrack;

    /**
     * this attribute is a integer vector indicating the Victorypoints on the popsfavouritetile
     */
    private final int[] popsfavouritetilepoints;


    /**
     * this attribute is a integer  indicating the current PopTile
     */
    private int currentPopTile;


    /**
     * this attribute is a vector indicating the initial and the final point of the Vatican Report Section
     * index 0 -> start of the first Vatican Report Section
     * index 1 -> end of the first Vatican Report Section
     * index 2 -> start of the second Vatican Report Section
     * index 3 -> end of the second Vatican Report Section
     * index 4 -> start of the third Vatican Report Section
     * index 5 -> end of the third Vatican Report Section
     */
    private final static int[] VaticanReportSection = {5, 8, 12, 16, 19, 24};

    /**
     * this is the costructor of the faithtrack
     */
    public FaithTrack() {
        faithtrack = new int[faithtracksize];
        faithtrack[0] = 0;
        faithtrack[1] = 0;
        faithtrack[2] = 0;
        faithtrack[3] = 1;
        faithtrack[4] = 0;
        faithtrack[5] = 0;
        faithtrack[6] = 2;
        faithtrack[7] = 0;
        faithtrack[8] = 0;
        faithtrack[9] = 4;
        faithtrack[10] = 0;
        faithtrack[11] = 0;
        faithtrack[12] = 6;
        faithtrack[13] = 0;
        faithtrack[14] = 0;
        faithtrack[15] = 9;
        faithtrack[16] = 0;
        faithtrack[17] = 0;
        faithtrack[18] = 12;
        faithtrack[19] = 0;
        faithtrack[20] = 0;
        faithtrack[21] = 16;
        faithtrack[22] = 0;
        faithtrack[23] = 0;
        faithtrack[24] = 20;

        popsfavouritetilepoints = new int[popsfavouritetilepointsize];
        popsfavouritetilepoints[0] = 2;
        popsfavouritetilepoints[1] = 3;
        popsfavouritetilepoints[2] = 4;

        currentPopTile = 0;
    }

    /**
     * this method returns the number of VictoryPoints of the selected space
     *
     * @param i is the index of the faithtrack space
     * @return the number VictoryPoints of the selected space
     */
    public int getVictoryPoints(int i) {
        return faithtrack[i];
    }

    /**
     * this method returns the number of Victory points of a popsfavouritetile
     *
     * @param i is the index of the popsfavouritetile Vector
     * @return the number of Victory points of the selected popsfavouritetile
     */
    public int getPopsfavouritetilepoints(int i) {
        return popsfavouritetilepoints[i];
    }

    /**
     * this method returns the current popTile
     *
     * @return currentPopTile
     */
    public int getCurrentPopTile() {
        return currentPopTile;
    }

    /**
     * this method manages the Faithtrack.
     * Updates player VictoryPoints and
     * actives or discards Players'popfavortiles
     *
     * @param p               is the Players Vector
     * @param blackCrossToken is LorenzoIlMagnifico's blackCrossToken (=O if Multiplayer Game)
     */
    public void checkPopeSpace(ArrayList<Player> p, int blackCrossToken) throws GameFinishedException {
        int actived = 0;
        int VaticanReportSectionindex = 1 + currentPopTile * 2;

        if (currentPopTile < 3) {
            for (Player player : p) {
                if (player.getFaithMarker() == VaticanReportSection[VaticanReportSectionindex] || blackCrossToken == VaticanReportSection[VaticanReportSectionindex])
                    actived = 1;
            }

            VaticanReportSectionindex--;

            if (actived == 1) {
                for (Player player : p) {
                    player.setPopsfavortiles(currentPopTile, player.getFaithMarker() >= VaticanReportSection[VaticanReportSectionindex]);
                }
                currentPopTile++;
            }
        }
        if(currentPopTile==3) throw new GameFinishedException();
    }

    /**
     * this method return the number of VictoryPoints of a player
     * @param player is the selected player
     * @return int indicating the number of VictoryPoints of a player
     */
    public int getPlayerPoint(Player player) {
        int totale = 0;
        int tracker= player.getFaithMarker();

        //adding Board Points
        while (faithtrack[tracker]==0 && tracker>0)tracker--;
            totale += faithtrack[tracker];

        //adding popsfavouritetile points
        for (int j = 0; j < popsfavouritetilepointsize; j++) {
            if (player.getPopsfavortiles(j))
                totale += popsfavouritetilepoints[j];
        }
    return totale;
    }

    /**
     * this is a getter of Faithtracksize
     * @return the faithtracksize attribute
     */
    public int getFaithtracksize() {
        return faithtracksize-1;
    }
}