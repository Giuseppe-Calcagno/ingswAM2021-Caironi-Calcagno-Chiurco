package it.polimi.ingsw.View;

import it.polimi.ingsw.Client.ClientController;
import it.polimi.ingsw.Client.PlayerBoard;

import java.util.List;

/**
 * this class is the interface where CLI and GUI take methods
 */
public interface ViewInterface {

    void askServerInfo();
    void askLogin();
    void askNumPlayer();



    /* ************************************ UPDATE ******************************** */
    void onUpdateStartGame();
    void onUpdateCurrPlayer();
    void onUpdateInitialLeaderCards(List<String> leaderCard);
    void onUpdateActivatedDevCardProduction(String devCard);
    void onUpdateError(String error);
    void onUpdateDevCardDeck(String devCard);
    void onUpdateFaithMarker();
    void onUpdateMarketTray();
    void onUpdateUpdateResources(); // solo current
    void onUpdateSinglePlayerGame(); //lorenzo fa turno e dice che token ha usato
    void onUpdateSlotDevCards(); //solo current
    void onUpdateStateLeaderAction(String leaderCard, boolean state);
    void onUpdateStrongbox();
    void onUpdateWarehouse();
    void onUpdateWinnerMultiplayer();
    void onUpdateWinnerSinglePlayer();

    void onDisconnect();

    void onPlayerDisconnect(String name);

    void onResume(String name);



    /* ************************************ SHOW PHASE ******************************** */
    void showMessage(String message);

    void showLeaderActionBox();
    void showSlotDevCard();
    void showWarehouse();
    void showStrongbox();
    void showFaithTrack();
    void showExtraChest();
    void showMarketTray();
    void showDevCardDeck();
    void showMarbleBuffer();
    void showDevCard(String ID);
    void showLeaderAction(String ID);

    void showOtherPlayer();

    void showLorenzoTurn();

    PlayerBoard getPlayerBoard();
}
