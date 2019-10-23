import java.io.*;
import java.net.Socket;


public class Http_client_forsensors extends Thread  {

    Http_client_forsensors()

    {


        start();
    }

  //  Sensors = " tangaz_1 "+ az+ " kren_1 " + ax + " tangaz_2 "+  y + " kren_2 " + z + " forvard_accel "+ hum + " light " + light+ "  ";







    public  void run(){







            try {


                Socket socket = new Socket(Manifest.IP_ADDRESS, Manifest.port_number_forsensors);

                GUI.jTextArea.append("Connection      with sensors established \r\n");
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String Sensors_Info = br.readLine();


               // System.out.println(Sensors_Info);
                br.close();


                socket.close();

                //String str = "разделить-строку-по-разделителю";
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






            //   Thread.sleep(1000);



            } catch (Exception e) {


                System.out.println(e);


                GUI.jTextArea.append("Connection with sensors NOT established \r\n");


                GUI.connect_with_tel = false;


            }





    }

















}



