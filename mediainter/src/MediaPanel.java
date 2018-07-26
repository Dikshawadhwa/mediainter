/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.swing.JPanel;
import static sun.audio.AudioPlayer.player;
import javax.media.*;


/**
 *
 * @author Diksha
 */
public class MediaPanel extends JPanel {
public MediaPanel (URL mediaURL)
{
    setLayout(new BorderLayout());
    Manager.setHint(Manager.LIGHTWEIGHT_RENDERER,true);
    try
    {
    Player mediaPlayer=Manager.createRealizedPlayer(mediaURL);
    Component video=mediaPlayer.getVisualComponent();
    Component controls=mediaPlayer.getControlPanelComponent();
    if(video!=null)
        add(video,BorderLayout.CENTER);
    if(controls!=null)
    
        add(controls,BorderLayout.SOUTH);
        mediaPlayer.start();
    }
catch(NoPlayerException noPlayerException)
{
    System.err.println("No MEdiaPlaYer fOunD");
}
    catch(CannotRealizeException cannotRealizeException)
    {
     System.err.println("coulD nOT ReaLiZe Media PlayeR");
    
    }
 catch(IOException Exception)
    {
     System.err.println("ErrOr rEaDinG FroM The sOurCe");
    }
}

    //MediaPanel(URL mediaURL) 
    /*{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/


}
