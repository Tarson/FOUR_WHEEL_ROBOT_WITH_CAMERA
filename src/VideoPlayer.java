import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface;

public class VideoPlayer {

    public static JPanel contentPane;







    public static String mrl;

    public static MediaPlayerFactory mpf;

    public static EmbeddedMediaPlayer MediaPlayer;

    public static CanvasVideoSurface videoSurface;

    public static Canvas canvas;


    public VideoPlayer() {





        mrl = "udp://@:40001";
        //mrl = "D:\\ttt.mp4";
        contentPane = new JPanel();
        contentPane.setSize(324,490);
        contentPane.setLayout(new BorderLayout());






         canvas = new Canvas();


        String[] args = {
                  "--video-filter=transform --transform-type=270",

           //    "--video-filter=rotate",
            //   "--rotate-angle=270",

                "--demux=h264",

                "--clock-jitter=300",


               "--live-caching=100",
                "--network-caching=100",

        };


        mpf = new MediaPlayerFactory(args);
       videoSurface = mpf.newVideoSurface(canvas);

        MediaPlayer = mpf.newEmbeddedMediaPlayer();
        MediaPlayer.setVideoSurface(videoSurface);

       contentPane.add(canvas, BorderLayout.CENTER);



    }

    }








