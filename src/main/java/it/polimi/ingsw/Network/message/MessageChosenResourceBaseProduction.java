package it.polimi.ingsw.Network.message;

import it.polimi.ingsw.model.producible.Resources;

public class MessageChosenResourceBaseProduction extends Message{
    private static final long serialVersionUID = -5229293564538828139L;

    private Resources resources;

    public MessageChosenResourceBaseProduction(String nickname, MessageType messageType, Resources resources) {
        super(nickname, messageType);
        this.resources = resources;
    }

    public Resources getResources() {
        return resources;
    }
}