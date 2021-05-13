package it.polimi.ingsw.View.Cli;

import it.polimi.ingsw.Client.PlayerBoard;
import it.polimi.ingsw.View.Cli.Structure.*;
import it.polimi.ingsw.View.view;

import java.io.PrintStream;

public class Cli implements view {
    PlayerBoard playerBoard;

    private final PrintStream out;

    public Cli(PlayerBoard playerBoard) {
        this.playerBoard = playerBoard;
        out = System.out;
    }

    @Override
    public void askServerInfo() {

    }

    @Override
    public void endturn() {

    }

    @Override
    public void askNickname() {
        out.println("Enter your nickname: ");
    }

    @Override
    public void askNumPlayer() {
        out.println("Enter the number of players: ");
    }

    @Override
    public void askChooseLeaderCards() {
        showLeaderActionBox();
        out.println("Enter the first Leader card: ");

        out.println("Enter the second Leader card: ");
    }

    @Override
    public void askChooseResourcesFirstTurn(int num) {
        if (num == 2 || num == 3) {
            out.println("Enter a resource: ");
        }
        else {
            if (num == 4) {
                out.println("Enter the first resource: ");

                out.println("Enter the second resource: ");
            }
        }
    }

    @Override
    public void askChooseTurn() {
        out.println("Actions: \n0: Extract marbles from Market tray\n1: Buy a Development card\n2: Choose resources to activate a base production\n3: Activate production of a Development card\n4: Active production of the Leader card\n5: Activate or discard a Leader card");
        out.println("Enter the relative number: ");
    }



    @Override
    public void askActiveLeaderAction() {

    }

    @Override
    public void askExtractMarble() {
        showMarketTray();
        out.println("Do you want to extract a column or a row? [c/r]: ");

        /*
        //se scrive 'r'
        if (input.equals('r')) {
            out.println("Which number of row do you want to extract? [0-2]: ");
        }

        //se scrive 'c'
        if (input.equals('r')) {
            out.println("Which number of column do you want to extract? [0-3]: ");
        }

         */
    }

    @Override
    public void askAfterTakeMarble() {
        showMarbleBuffer();
        showWarehouse();

        out.println("Actions:\n0: Exchange two rows of the Warehouse depots\n1: Add or discard an extracted marble (if you discard a marble, you'll give a faith point to each other player)\n2: Choose with which resource you'll convert an extracted white marble (if yuo have the special effect of the relative Leader card)");
        out.println("Enter the relative action's number: ");
    }

    @Override
    public void askExchange() {
        showWarehouse();
        out.println("Enter the first row to exchange: ");

        out.println("Enter the second row to exchange: ");
    }

    @Override
    public void askAddDiscardMarble() {
        showMarbleBuffer();
        showWarehouse();

        out.println("0: Discard this marble\n1: Add this marble to the Warehouse depots");
        out.println("Enter your choice: ");
    }

    @Override
    public void askSelectTrasformationWhiteMarble() {
        showWhiteMarbleEffectList();
        out.println("Enter the resource with which do you want to convert the White marble [0-1]: ");
    }

    @Override
    public void askSelectDevCard() {
        boolean wantToWatch = true;

        showDevCardDeck();

        /*
        while (wantToWatch) {
            out.println("Do you want to see a Development card? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                out.println("Enter the Development card's ID: ");
                showDevCard(input);
            }
        }

         */

        out.println("Enter the Development card's ID to buy: ");
    }

    @Override
    public void askChooseResourcesPurchaseDevCard() {
        showWarehouse();
        out.println("Enter the type of resources from the Warehouse depots [Coins, Servants, Shields, Stones]: ");

        out.println("Enter the number of resources: ");

        showStrongbox();
        out.println("Enter the type of resources from the Strongbox [Coins, Servants, Shields, Stones]: ");

        out.println("Enter the number of resources: ");

        if (!playerBoard.getExtrachest().isEmpty()) {
            showExtraChest();
            out.println("Enter the type of resources from the Extra Chest [Coins, Servants, Shields, Stones]: ");

            out.println("Enter the number of resources: ");
        }
    }

    @Override
    public void askInsertCard() {
        boolean wantToWatch = true;

        showSlotDevCard();

        /*
        while (wantToWatch) {
            out.println("Do you want to see a Development card? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                out.println("Enter the Development card's ID: ");
                showDevCard(input);
            }
        }

         */

        out.println("Enter the slot in which do you want to insert the card [0-2]: ");
    }

    @Override
    public void askProductionType() {
        boolean wantToWatch = true;

        /*
        while (wantToWatch) {
            out.println("Do you want to see the Warehouse depots? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                showWarehouse();
                wantToWatch = false;
            }
        }

        wantToWatch = true;

        while (wantToWatch) {
            out.println("Do you want to see the Strongbox? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                showStrongbox();
                wantToWatch = false;
            }
        }

        if (!playerBoard.getExtrachest().isEmpty()) {
            wantToWatch = true;

            while (wantToWatch) {
                out.println("Do you want to see the Extra chest? [0-1]: ");
                if (!input)
                    wantToWatch = false;
                else {
                    showExtraChest();
                    wantToWatch = false;
                }
            }
        }

        showSlotDevCard();

        wantToWatch = true;

        while (wantToWatch) {
            out.println("Do you want to see a Development card? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                out.println("Enter the Development card's ID: ");
                showDevCard(input);
            }
        }

         */

        out.println("Productions:\n0: Activate base production\n1: Activate the production power of a Development card\n2: Activate the production power of the relative Leader card\n3: End production");
    }

    @Override
    public void askChooseResourcesBaseProduction() {
        showWarehouse();
        out.println("Enter the type of resources from the Warehouse depots [Coins, Servants, Shields, Stones]: ");

        out.println("Enter the number of resources: ");

        showStrongbox();
        out.println("Enter the type of resources from the Strongbox [Coins, Servants, Shields, Stones]: ");

        out.println("Enter the number of resources: ");

        if (!playerBoard.getExtrachest().isEmpty()) {
            showExtraChest();
            out.println("Enter the type of resources from the Extra Chest [Coins, Servants, Shields, Stones]: ");

            out.println("Enter the number of resources: ");
        }
    }

    @Override
    public void askChosenResourceBaseProduction() {
        out.println("Enter the type of the chosen resource [Coins, Servants, Shields, Stones]: ");
    }

    @Override
    public void askActiveProductionDevCard() {
        boolean wantToWatch = true;

        showSlotDevCard();

        /*
        while (wantToWatch) {
            out.println("Do you want to see a Development card? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                out.println("Enter the Development card's ID: ");
                showDevCard(input);
            }
        }

         */

        out.println("Enter the number of the Slot Development cards' column [0-2]: ");
    }

    @Override
    public void askChooseResourcesDevCardProduction() {
        showWarehouse();
        out.println("Enter the type of resources from the Warehouse depots [Coins, Servants, Shields, Stones]: ");

        out.println("Enter the number of resources: ");

        showStrongbox();
        out.println("Enter the type of resources from the Strongbox [Coins, Servants, Shields, Stones]: ");

        out.println("Enter the number of resources: ");

        if (!playerBoard.getExtrachest().isEmpty()) {
            showExtraChest();
            out.println("Enter the type of resources from the Extra Chest [Coins, Servants, Shields, Stones]: ");

            out.println("Enter the number of resources: ");
        }
    }

    @Override
    public void askActiveLeaderCardProduction() {
        boolean wantToWatch = true;

        showLeaderActionBox();

        /*
        while (wantToWatch) {
            out.println("Do you want to see a Leader card? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                out.println("Enter the Leader card's ID: ");
                showLeaderAction(input);
            }
        }

         */

        out.println("Enter the index of the Leader card [0-1]: ");

        showWarehouse();
        showStrongbox();
        if (!playerBoard.getExtrachest().isEmpty())
            showExtraChest();

        out.println("Depots:\n0: Warehouse depots\n1: Strongbox\n2: ExtraChest(if you have)");
        out.println("Enter the relative number from where you want to take the resource: ");

        out.println("Enter the type of the given resource [Coins, Servants, Shields, Stones]: ");
    }

    @Override
    public void askEndTurnActiveLeaderCard() {
        boolean wantToWatch = true;

        showLeaderActionBox();

        /*
        while (wantToWatch) {
            out.println("Do you want to see a Leader card? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                out.println("Enter the Leader card's ID: ");
                showLeaderAction(input);
            }
        }

         */

        out.println("Do you want to activate or discard a Leader card or do you want to end your turn? [0-1]: ");
    }

    @Override
    public void askUpdateStateLeaderAction() {
        boolean wantToWatch = true;

        showLeaderActionBox();

        /*
        while (wantToWatch) {
            out.println("Do you want to see a Leader card? [0-1]: ");
            if (!input)
                wantToWatch = false;
            else {
                out.println("Enter the Leader card's ID: ");
                showLeaderAction(input);
            }
        }

         */

        out.println("Which card do you want to activate or discard [0-1]: ");

        out.println("Do you want to activate or discard this card? [0-1]: ");
    }

    //show
    @Override
    public void showMessage(String message) {
        out.println(message);
    }

    @Override
    public void showLeaderActionBox() {
        ViewLeaderActionBox viewLeaderActionBox = new ViewLeaderActionBox(playerBoard);
        viewLeaderActionBox.plot();
    }

    @Override
    public void showSlotDevCard() {
        ViewSlotDevCard viewSlotDevCard = new ViewSlotDevCard(playerBoard);
        viewSlotDevCard.plot();
    }

    @Override
    public void showWarehouse() {
        ViewWarehouse viewWarehouse = new ViewWarehouse(playerBoard);
        viewWarehouse.plot();
    }

    @Override
    public void showStrongbox() {
        ViewStrongbox viewStrongbox = new ViewStrongbox(playerBoard);
        viewStrongbox.plot();
    }

    @Override
    public void showProductionBuffer() {

    }

    @Override
    public void showWhiteMarbleEffectList() {

    }

    @Override
    public void showFaithTrack() {
        ViewFaithTrack viewFaithTrack = new ViewFaithTrack(playerBoard);
        viewFaithTrack.plot();
    }

    @Override
    public void showMarketTray() {
        ViewMarketTray viewMarketTray = new ViewMarketTray(playerBoard);
        viewMarketTray.plot();
    }

    @Override
    public void showMarbleBuffer() {

    }

    @Override
    public void showDevCardDeck() {
        ViewDevCardDeck viewDevCardDeck = new ViewDevCardDeck(playerBoard);
        viewDevCardDeck.plot();
    }

    @Override
    public void showExtraChest(){
        ViewExtraChest viewExtraChest = new ViewExtraChest(playerBoard);
        viewExtraChest.plot();
    }

    @Override
    public void showDevCard(String ID) {

    }

    @Override
    public void showLeaderAction(String ID) {

    }

    @Override
    public void showPlayerState(String name) {

    }

    @Override
    public void showWinner() {

    }

    @Override
    public void showVictoryPoint() {

    }
}