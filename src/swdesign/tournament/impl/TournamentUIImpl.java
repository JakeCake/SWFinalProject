package swdesign.tournament.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import swdesign.examplegames.stupidnumbergame.StupidNumberGame;
import swdesign.game.Game;
import swdesign.gui.SimpleGUI;
import swdesign.tournament.MatchInfo;
import swdesign.tournament.ParticipantInfo;
import swdesign.tournament.TournamentUI;

public class TournamentUIImpl implements TournamentUI {

    SimpleGUI gui = new SimpleGUI();

    boolean multithreaded = true;
    Game game;

    public TournamentUIImpl(Game game)
    {
        this.game = game;
    }
    
    
    @Override
    public void tournamentStart(String gameName, ParticipantInfo[] participants, MatchInfo[] matches)
    {

        ExecutorService executor;
        if (multithreaded)
        {
            executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        } else
        {
            executor = Executors.newFixedThreadPool(1);
        }
        for (int i = 0; i < matches.length; i++)
        {
            executor.execute((MatchInfoImpl) matches[i]);
            matchStarted(matches[i].matchID());
        }

        executor.shutdown();
        try
        {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(TournamentUIImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void matchStarted(int matchIndex)
    {
        gui.matchStarted(matchIndex);
    }

    @Override
    public void matchFinished(int matchIndex)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tournamentFinished(ParticipantInfo[] sortedParticipants)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MatchInfo[] computeMatches(ParticipantInfo[] participants)
    {
        int pNum = participants.length;
        int matchId = 0;
        ParticipantInfo p1;
        ParticipantInfo p2;
        MatchInfo[] m;
        m = new MatchInfo[numOfMatches(pNum)];

        for (int i = 0; i < pNum; i++)
        {
            p1 = participants[i];
            for (int j = i + 1; j < pNum; j++)
            {
                p2 = participants[j];
                m[matchId] = new MatchInfoImpl(matchId, game, p1, p2);
                matchId++;
            }
        }
        return m;
    }

    private static int numOfMatches(int participantNum)
    {
        int a = 0;
        for (int i = 1; i < participantNum; i++)
        {
            a += participantNum - i;
        }
        return a;
    }

}
