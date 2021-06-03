package it.polimi.ingsw.Network.Message.UpdateMesssage;

import it.polimi.ingsw.Network.Message.Message;
import it.polimi.ingsw.Network.Message.MessageType;
import it.polimi.ingsw.View.ViewInterface;

import java.util.List;
import java.util.Map;

public class MessageUpdateOtherPlayer extends Message {
    private String OtherPlayerName;
    private String[][] warehouse;
    private Map<String,Integer> extrachest;
    private Map<String,Integer> strongbox;
    private List<String> leaderCards;
    private String [][] slotDevCard;

    public MessageUpdateOtherPlayer(String nickname, String OtherPlayerName, String[][] warehouse, Map<String, Integer> extrachest, Map<String, Integer> strongbox, List<String> leaderCards, String[][] slotDevCard) {
        super(nickname, MessageType.UPDATEPLAYERSTATE);
        this.OtherPlayerName = OtherPlayerName;
        this.warehouse = warehouse;
        this.extrachest = extrachest;
        this.strongbox = strongbox;
        this.leaderCards = leaderCards;
        this.slotDevCard = slotDevCard;
    }

    @Override
    public void update(ViewInterface view){
        view.getPlayerBoard().setOtherPlayer(OtherPlayerName,warehouse,extrachest,strongbox,leaderCards,slotDevCard);
        view.showOtherPlayer();
    }
}
