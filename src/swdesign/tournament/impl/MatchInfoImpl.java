
package swdesign.tournament.impl;

import swdesign.game.Game;
import swdesign.game.GameInstance;
import swdesign.tournament.MatchInfo;
import swdesign.tournament.ParticipantInfo;
import swdesign.tournament.TournamentUI;

public class MatchInfoImpl implements MatchInfo, Runnable {
    private final int id;
    Game game;
    private GameInstance.Result result;
    private boolean hasFinished;
    private final ParticipantInfo participantA;
    private final ParticipantInfo participantB;
    private final TournamentUI tui;
    
    public MatchInfoImpl(int id, Game game, ParticipantInfo A, ParticipantInfo B, TournamentUI tui) {
        this.id = id;
        this.game = game;
        this.participantA = A;
        this.participantB = B;
        hasFinished = false;
        this.tui = tui;
        
    }
    
    @Override
    public int matchID() {
        return id;
    }
    
    @Override
    public ParticipantInfo getParticipantA() {
        return participantA;
    }

    @Override
    public ParticipantInfo getParticipantB() {
        return participantB;
    }

    @Override
    public boolean hasFinished() {
        return hasFinished;
    }

    @Override
    public GameInstance.Result getResult() {
        return result;
    }

    @Override
    public void run() {
        result = game.newInstance().playGame(getParticipantA().getAI().newInstance(), getParticipantB().getAI().newInstance());
        hasFinished = true;
        tui.matchFinished(id);
        
    }
    
}