
import java.io.*;
import java.net.Socket;
import java.net.InetAddress;
/**
 * Created by User on 27.07.2017.
 */
class Http_Client_forESP extends Thread {
    int port;
    String s;
    String Greetings_from_S;
    public static Boolean connected = false;
    public static Boolean udp_link = false;
    //public static PrintWriter pw;


    InetAddress iaLocal;

    Http_Client_forESP(int port) {

        new MakingDots();
        this.port = port;
        start();


    }


    class MakingDots extends Thread{

        MakingDots()
        {start();}

        public void run ()
        {

            int i =0;
            while (!connected)

            {
                try {Thread.sleep(500);}// мастрячим точки на экране пока ждём соединения

                catch(Exception e)
                {}
                if (i==0)
                {i++;}
                else GUI.jTextArea.append(" . ");}


        }


    }










    public void run() {








        String  addr = Manifest.IP_ADDRESS_ESP;

        try (Socket socket = new Socket(addr.trim(), port))//будем отправлять адрес компа на ESP
        {


            connected = true;

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw.println("stop data");//на всякий случай, вдруг вышли некорректно

            pw.println("data");// Greetings with SERVER
            GUI.jTextArea.append("КОНТАКТ УСТАНОВЛЕН \r\n");



            Greetings_from_S = br.readLine();
            if (Greetings_from_S.equals("ready"))
            {
                iaLocal = InetAddress.getLocalHost();
                String ip_address = iaLocal.getHostAddress();
                GUI.jTextArea.append("ПЕРЕДАЕМ АДРЕС КОМПА  \r\n");
                GUI.jTextArea.append(ip_address + "  \r\n");
                pw.println(ip_address);// отправляем адрес компа на ESP






                Greetings_from_S = br.readLine();
                GUI.jTextArea.append(Greetings_from_S+"\r\n");// получаем адрес компа обратно


                if(!udp_link)// проверяем на ранее запущенные udp, если ону уже были запущены, то новые не городим
                {
                   new Udp_Client();
                   new Udp_recipient();
                    udp_link = true;
                }






            }

        } catch (Exception e) {
            connected=true;
            GUI.jTextArea.append(" \r\n");
            GUI.jTextArea.append("НЕ МОГУ НАЙТИ РОБОТА\r\n");



        }






















    }



}


