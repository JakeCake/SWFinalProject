
package swdesign;

import swdesign.examplegames.stupidnumbergame.StupidNumberGame;
import swdesign.examplegames.stupidnumbergame.players.ConstantPlayer;
import swdesign.examplegames.stupidnumbergame.players.RandomPlayer;
import swdesign.game.*;
import swdesign.tournament.ParticipantInfo;
import swdesign.tournament.impl.ParticipantInfoImpl;
import swdesign.tournament.impl.TournamentUIImpl;


public class SWDesignFinalProject
{    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game game = new StupidNumberGame(100);
        
        System.out.println("Number of Cores: " + Runtime.getRuntime().availableProcessors() + '\n');
        
        ParticipantInfo[] participants = new ParticipantInfo[7];
        participants[0] = (new ParticipantInfoImpl(new RandomPlayer("RandomPlayer1", "RandomPlayer1", 1, 9)));
        participants[1] = (new ParticipantInfoImpl(new ConstantPlayer("ConstantPlayer1", "ConstantPlayer1", 5)));
        participants[2] = (new ParticipantInfoImpl(new ConstantPlayer("ConstantPlayer2", "ConstantPlayer2", 6)));
        participants[3] = (new ParticipantInfoImpl(new ConstantPlayer("ConstantPlayer3", "ConstantPlayer3", 6)));
        participants[4] = (new ParticipantInfoImpl(new RandomPlayer("RandomPlayer2", "RandomPlayer2", -1, 11)));
        participants[5] = (new ParticipantInfoImpl(new RandomPlayer("RandomPlayer3", "RandomPlayer3", -25, 30)));
        participants[6] = (new ParticipantInfoImpl(new RandomPlayer("RandomPlayer4", "RandomPlayer4", 6, 8)));
        
        
        TournamentUIImpl tournament = new TournamentUIImpl(game);
        ParticipantInfo[] p = participants;
        tournament.tournamentStart("a name?", p, tournament.computeMatches(p));
        
    }
    
}