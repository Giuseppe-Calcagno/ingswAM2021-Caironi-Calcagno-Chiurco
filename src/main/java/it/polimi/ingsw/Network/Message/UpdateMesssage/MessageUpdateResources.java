package it.polimi.ingsw.Network.Message.UpdateMesssage;

import it.polimi.ingsw.Client.PlayerBoard;
import it.polimi.ingsw.Network.Message.Message;
import it.polimi.ingsw.Network.Message.MessageType;

import java.util.Map;

public class MessageUpdateResources extends Message {
    private static final long serialVersionUID = 8191601085287964506L;

    private String[][] warehouse;
    private Map<String, Integer> extraChest;
    private Map<String,Integer> strongbox;

    public MessageUpdateResources(String nickname, String[][] warehouse, Map<String, Integer> extraChest, Map<String, Integer> strongbox) {
        super(nickname, MessageType.UPDATERESOURCES);
        this.warehouse = warehouse;
        this.extraChest = extraChest;
        this.strongbox = strongbox;
    }

    public String[][] getWarehouse() {
        return warehouse;
    }

    public Map<String, Integer> getExtraChest() {
        return extraChest;
    }

    public Map<String, Integer> getStrongbox() {
        return strongbox;
    }

    @Override
    public void update(PlayerBoard playerBoard) {
        super.update(playerBoard);
    }
}