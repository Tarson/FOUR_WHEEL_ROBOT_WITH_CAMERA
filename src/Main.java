import uk.co.caprica.vlcj.discovery.NativeDiscovery;

public class Main {public static void main (String [] args)

{


    java.awt.EventQueue.invokeLater(new Runnable()
    {
        public void run() {


         //  new Http_Client_forESP(Manifest.port_number_ESP);
         //   new Control().start();//запускаем контроллер событий
            new NativeDiscovery().discover();
            new VideoPlayer();
            GUI.gui  = new GUI();
            GUI.gui.setVisible(true);

            // System.out.println("программа запущена" );
            VideoPlayer.MediaPlayer.playMedia(VideoPlayer.mrl);


        }
    });



}






}


