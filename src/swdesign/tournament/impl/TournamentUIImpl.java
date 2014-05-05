
package swdesign.tournament.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import swdesign.examplegames.stupidnumbergame.StupidNumberGame;
import swdesign.gui.SimpleGUI;
import swdesign.tournament.MatchInfo;
import swdesign.tournament.ParticipantInfo;
import swdesign.tournament.TournamentUI;

public class TournamentUIImpl implements TournamentUI {
    
    SimpleGUI gui = new SimpleGUI();
    
    boolean multithreaded = true;
    
    @Override
    public void tournamentStart(String gameName, ParticipantInfo[] participants, MatchInfo[] matches) {
        
        ExecutorService executor;
        if(multithreaded) {
        executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        } else {
            executor = Executors.newFixedThreadPool(1);
        }
        for(int i = 0; i < matches.length; i++) {
            executor.execute((MatchInfoImpl) matches[i]);
            matchStarted(matches[i].matchID());
        }
        
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException ex) {
            Logger.getLogger(TournamentUIImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void matchStarted(int matchIndex) {
        gui.matchStarted(matchIndex);
    }

    @Override
    public void matchFinished(int matchIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tournamentFinished(ParticipantInfo[] sortedParticipants) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   

    
    
}