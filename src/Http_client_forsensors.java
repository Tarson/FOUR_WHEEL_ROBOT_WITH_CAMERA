import javax.swing.*;
import java.io.*;
import java.net.Socket;


public class Http_client_forsensors extends Thread  {

    String Sensors_Info;

    Http_client_forsensors()

    {


        start();
    }

  // Sensors = " tangaz_1 "+ az+ " kren_1 " + ax + " tangaz_2 "+  y + " kren_2 " + z + " forvard_accel "+ hum + " light " + light+ "  ";







    public  void run() {

        GUI.jTextArea.append("Connection      with sensors established \r\n");
        while (GUI.connect_with_tel) {

            try {


                Socket socket = new Socket(Manifest.IP_ADDRESS, Manifest.port_number_forsensors);


                GUI.connect_with_tel = true;


                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);




                    Sensors_Info = br.readLine();


                    String[] subStr;
                    String delimeter = " "; // Разделитель
                    subStr = Sensors_Info.split(delimeter); // Разделения строки str с помощью метода split()
                    // Вывод результата на экран
                    GUI.jTextField1.setText(subStr[2]);

                    GUI.jTextField2.setText(subStr[4]);

                    GUI.jTextField3.setText(subStr[6]);

                    GUI.jTextField4.setText(subStr[8]);

                    GUI.jTextField5.setText(subStr[10]);

                    GUI.jTextField6.setText(subStr[12]);


                    if (Manifest.FARA)
                    {pw.println("FARAON");

            }
                  if(!Manifest.FARA)
                    {pw.println("FARAOFF");


                    }
                    pw.flush();




                    Thread.sleep(1000);



                br.close();
                pw.close();
                socket.close();


            } catch (Exception e) {


                System.out.println(e);


                GUI.jTextArea.append("Connection with sensors NOT established \r\n");


                GUI.connect_with_tel = false;


            }


        }


    }




}



