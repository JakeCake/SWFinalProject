

package swdesign.gui;

/**
 *
 * @author tog
 * @param <AIInstance>
 */
public class SimpleGUI
{
    public void matchStarted(int matchIndex) {
        System.out.println("Match Started: " + matchIndex);
    }
    public void matchEnded(int matchIndex) {
        System.out.println("Match Ended: " + matchIndex);
    }
}
