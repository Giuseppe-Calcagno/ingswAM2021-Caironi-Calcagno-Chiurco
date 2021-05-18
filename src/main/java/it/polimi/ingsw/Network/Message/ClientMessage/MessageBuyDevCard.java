package it.polimi.ingsw.Network.Message.ClientMessage;

import it.polimi.ingsw.Controller.GameController;
import it.polimi.ingsw.Network.Message.Message;
import it.polimi.ingsw.Network.Message.MessageType;

public class MessageBuyDevCard extends Message {

    private static final long serialVersionUID = 1325268486763010305L;

    private String ID;
    private int columnSlotDevCard;

    public MessageBuyDevCard(String nickname, String ID, int columnSlotDevCard) {
        super(nickname, MessageType.BUYDEVCARD);
        this.ID = ID;
        this.columnSlotDevCard = columnSlotDevCard;
    }

    public String getID() {
        return ID;
    }

    public int getColumnSlotDevCard() {
        return columnSlotDevCard;
    }

    @Override
    public void action(GameController gameController) {
        gameController.selectDevCard(ID,columnSlotDevCard);
    }
}