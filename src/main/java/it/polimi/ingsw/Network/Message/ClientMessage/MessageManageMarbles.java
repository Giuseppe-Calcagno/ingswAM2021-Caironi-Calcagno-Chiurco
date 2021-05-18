package it.polimi.ingsw.Network.Message.ClientMessage;

import it.polimi.ingsw.Controller.GameController;
import it.polimi.ingsw.Network.Message.Message;
import it.polimi.ingsw.Network.Message.MessageType;

public class MessageManageMarbles extends Message {
    private static final long serialVersionUID = 5253235709158532912L;

    private int structure;
    private int row;
    private String changeFromWithe;

    public MessageManageMarbles(String nickname, char structure, int row, String changeFromWithe) {
        super(nickname, MessageType.MANAGEMARBLES);
        this.structure = structure;
        this.row = row;
        this.changeFromWithe = changeFromWithe;
    }

    public int getRow() {
        return row;
    }

    public int getStructure() {
        return structure;
    }

    public String getChangeFromWithe() {
        return changeFromWithe;
    }

    @Override
    public void action(GameController gameController) {

    }
}