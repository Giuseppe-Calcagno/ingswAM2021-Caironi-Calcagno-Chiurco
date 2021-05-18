package it.polimi.ingsw.Network.Message.UpdateMesssage;

import it.polimi.ingsw.Client.PlayerBoard;
import it.polimi.ingsw.Network.Message.Message;
import it.polimi.ingsw.Network.Message.MessageType;

import java.util.Map;

public class MessageUpdateStrongbox extends Message {
    private static final long serialVersionUID = 1138583085556221628L;

    private Map<String,Integer> strongbox;

    public MessageUpdateStrongbox(String nickname, Map<String, Integer> strongbox) {
        super(nickname, MessageType.UPDATESTRONGBOX);
        this.strongbox = strongbox;
    }

    public Map<String, Integer> getStrongbox() {
        return strongbox;
    }


    @Override
    public void update(PlayerBoard playerBoard) {
        super.update(playerBoard);
    }
}