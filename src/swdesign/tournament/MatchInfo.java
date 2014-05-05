/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swdesign.tournament;

import swdesign.game.GameInstance.Result;

/**
 *
 * @author tog
 */
public interface MatchInfo
{
    public int matchID();
    public ParticipantInfo getParticipantA();
    public ParticipantInfo getParticipantB();
    public boolean hasFinished();
    public Result getResult();
}
