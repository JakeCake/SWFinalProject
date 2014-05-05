
package swdesign;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import swdesign.examplegames.stupidnumbergame.StupidNumberGame;
import swdesign.examplegames.stupidnumbergame.players.ConstantPlayer;
import swdesign.examplegames.stupidnumbergame.players.RandomPlayer;
import swdesign.game.*;
import swdesign.tournament.ParticipantInfo;
import swdesign.tournament.TournamentUI;
import swdesign.tournament.impl.ParticipantInfoImpl;
import swdesign.tournament.impl.TournamentUIImpl;


public class SWDesignFinalProject
{
    private static ExecutorService executor = Executors.newFixedThreadPool(50);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game game = new StupidNumberGame(1000);
        
        ParticipantInfo[] participants = new ParticipantInfo[3];
        participants[0] = (new ParticipantInfoImpl(new RandomPlayer("RandomPlayer", "RandomPlayer", 1, 9)));
        participants[1] = (new ParticipantInfoImpl(new ConstantPlayer("ConstantPlayer", "ConstantPlayer", 5)));
        participants[2] = (new ParticipantInfoImpl(new ConstantPlayer("ConstantPlayer2", "ConstantPlayer2", 6)));
        
        TournamentUIImpl tournament = new TournamentUIImpl(game);
        ParticipantInfo[] p = participants;
        tournament.tournamentStart("a name?", p, tournament.computeMatches(p));
        System.out.println("Number of Cores: " + Runtime.getRuntime().availableProcessors());
        
        //int numberOfMatches = (int)((participants.length +1 ) / 2.0 * participants.length); 
        //matches = new MatchInfo[numberOfMatches];
        
    }
    
}