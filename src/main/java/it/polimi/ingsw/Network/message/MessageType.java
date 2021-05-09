package it.polimi.ingsw.Network.message;

public enum MessageType {
    LOGIN,
    NUMPLAYERS,
    EXTRACTIONMARBLES,
    ADDDISCARDMARBLES,
    EXCHANGEWAREHOUSE,
    CHOOSELEADERCARDS,
    CHOOSERESOURCESFIRSTTURN,
    CHOOSERESOURCESDEVCARDPRODUCTION,
    CHOOSERESOURCESPURCHASEDEVCARD,
    INSERTCARD,
    SELECTDEVCARD,
    CHOOSERESOURCESBASEPRODUCTION,
    CHOSENRESOURCEBASEPRODUCTION,
    ACTIVEPRODUCTIONDEVCARD,
    ACTIVELEADERCARDPRODUCTION,
    UPDATESTATELEADERACTION,
    ENDTURN,
    PING,
    DISCONNECT,
    EXTRACTEDMARBLESLIST,
    CHECKOK,
    REQUESTNUMPLAYERS,
    WAITINGOTHERPLAYERS,
    INITIALSITUATIONGAME,
    DELETEDEVCARD,
    ENDPRODUCTION,


    UPDATEMARKETTRAY,
    UPDATEFAITHPOINTS,
    UPDATESTRONGBOX,
    UPDATECURRENTPLAYER,
    UPDATEWAREHOUSE,
    UPDATESLOTDEVCARDS,

    CONNECT,
}
