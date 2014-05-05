/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swdesign.tournament;

/**
 *
 * @author tog
 */
public interface TournamentUI
{
    public void tournamentStart(String gameName, ParticipantInfo[] participants, MatchInfo[] matches);
    public void matchStarted(int matchIndex);
    public void matchFinished(int matchIndex);
    public void tournamentFinished(ParticipantInfo[] sortedParticipants);
}
