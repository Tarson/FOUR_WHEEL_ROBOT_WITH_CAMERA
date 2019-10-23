
import java.awt.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;



public class Udp_recipient extends Thread {



    DatagramSocket ds;
    DatagramPacket packet;
    static int count=0;

    Udp_recipient() {


        start();




        try {ds = new DatagramSocket(Manifest.udp_port_number);
            packet = new DatagramPacket(new byte[1], 1);


        }
        catch (Exception e) {


           GUI.jTextArea.append("НЕ МОГУ СОЗДАТЬ ВХОДЯЩЕЕ\r\n");
            GUI.jTextArea.append("UDP СОЕДИНЕНИЕ\r\n");


        }

    }
    public void run() {
        while (true) {
            try {


                ds.receive(packet);


                int t = packet.getData()[0];

                if (t==1)
                {
                    count++;
                    GUI.jTextField7.setText("           "+count);
                }

                else

                {GUI.jTextField9.setText("        "+t);

                if (t <= 40){ GUI.jTextField9.setBackground(Color.GREEN);}
                if ((t > 40) & (t<=70)){ GUI.jTextField9.setBackground(Color.YELLOW);}
                if (t > 70) { GUI.jTextField9.setBackground(Color.RED);}
                }



           //     GUI.jTextArea.append("ПРИШЛО       "+t+ " \r\n");

           //     System.out.println(t);


            } catch (Exception e) {

                GUI.jTextArea.append("НЕТ ВХОДЯЩИХ ПАКЕТОВ"+ " \r\n");



            }

        }
    }


}

