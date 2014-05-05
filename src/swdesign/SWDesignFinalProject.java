
package swdesign;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import swdesign.examplegames.stupidnumbergame.StupidNumberGame;
import swdesign.examplegames.stupidnumbergame.players.ConstantPlayer;
import swdesign.examplegames.stupidnumbergame.players.RandomPlayer;
import swdesign.game.*;
import swdesign.tournament.MatchInfo;
import swdesign.tournament.ParticipantInfo;
import swdesign.tournament.impl.ParticipantInfoImpl;


public class SWDesignFinalProject
{
    private static ExecutorService executor = Executors.newFixedThreadPool(50);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game game = new StupidNumberGame(1000);
        
        ArrayList<ParticipantInfo> participants = new ArrayList<>();
        participants.add(new ParticipantInfoImpl(new RandomPlayer("RandomPlayer", "RandomPlayer", 1, 9)));
        participants.add(new ParticipantInfoImpl(new ConstantPlayer("ConstantPlayer", "ConstantPlayer", 5)));
        
        System.out.println("Number of Cores: " + Runtime.getRuntime().availableProcessors());
        
        //int numberOfMatches = (int)((participants.length +1 ) / 2.0 * participants.length); 
        //matches = new MatchInfo[numberOfMatches];
        
    }
    
}