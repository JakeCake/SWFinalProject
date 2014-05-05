

package swdesign.gui;

/**
 *
 * @author tog
 */
public class SimpleGUI
{
    public void matchStarted(int matchIndex) {
        System.out.println("Match Started: " + matchIndex);
    }
    public void matchEnded(int matchIndex) {
        System.out.println("Match Ended: " + matchIndex);
    }
    public void tournamentStarted(int matchIndex) {
        System.out.println("Tournament Started: " + matchIndex);
    }
}
