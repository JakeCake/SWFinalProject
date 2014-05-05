
package swdesign.tournament.impl;

import swdesign.game.AI;
import swdesign.tournament.ParticipantInfo;

public class ParticipantInfoImpl implements ParticipantInfo{

    private int score;
    
    private AI ai;

    public ParticipantInfoImpl(AI ai) {
        this.ai = ai;
        this.score = 0;
    }
    
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getID() {
        return ai.getID();
    }

    @Override
    public String getName() {
        return ai.getName();
    }
    
    public void addScore() {
        score++;
    }
    
    public void retractScore() {
        score--;
    }

    @Override
    public AI getAI() {
        return ai;
    }
    
}