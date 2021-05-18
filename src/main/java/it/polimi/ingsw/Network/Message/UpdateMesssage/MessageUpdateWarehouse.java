package it.polimi.ingsw.Network.Message.UpdateMesssage;

import it.polimi.ingsw.Client.PlayerBoard;
import it.polimi.ingsw.Network.Message.Message;
import it.polimi.ingsw.Network.Message.MessageType;

import java.util.Map;

public class MessageUpdateWarehouse extends Message {
    private static final long serialVersionUID = 3757146638417054874L;

    private String[][] warehouse;
    private Map<String , Integer> extraChest;
    private boolean removeMarblefromBuffer;

    public MessageUpdateWarehouse(String nickname, String[][] warehouse, Map<String , Integer> extraChest, boolean removeMarblefromBuffer) {
        super(nickname, MessageType.UPDATEWAREHOUSE);
        this.warehouse = warehouse;
        this.extraChest = extraChest;
        this.removeMarblefromBuffer=removeMarblefromBuffer;
    }

    public String[][] getWarehouse() {
        return warehouse;
    }

    public Map<String, Integer> getExtraChest() {
        return extraChest;
    }


    @Override
    public void update(PlayerBoard playerBoard) {
        super.update(playerBoard);
    }


}
