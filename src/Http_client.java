import java.io.*;
import java.net.Socket;


public class Http_client extends Thread  {



    public int Number;


    public BufferedOutputStream bos;





    Http_client(int Number)
    {
        this.Number = Number;



    }

    public  void run(){









        try  {





            Socket socket= new Socket(Manifest.IP_ADDRESS, Manifest.port_number);
            GUI.jTextArea.append("установили соединение с телефоном \r\n");


            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());



            if (Number ==1)

            {


                Control.File1_reception_complete=false;

                GUI.jTextArea.append("качаем файл 1, можно играть файл 2");
                GUI.jTextArea.append("\r\n");


                bos = new BufferedOutputStream(new FileOutputStream(Manifest.mr1));



                byte[] buffer = new byte[32768];
                while (true) {
                    // читаем данные в буфер
                    int readBytesCount = bis.read(buffer);
                    if (readBytesCount == -1) {
                        // данные закончились
                        break;
                    }
                    if (readBytesCount > 0) {
                        // данные были считаны - есть, что записать
                        bos.write(buffer, 0, readBytesCount);
                    }
                }


                GUI.jTextArea.append("файл считан");
                GUI.jTextArea.append("\r\n");


                GUI.jTextArea.append("файл получен");
                GUI.jTextArea.append("\r\n");

                bos.flush();

                bos.close();




                Control.File1_reception_complete=true;







            }





            if (Number==2)

            {

                Control.File2_reception_complete=false;


                GUI.jTextArea.append("качаем файл 2, можно играть файл 1");
                GUI.jTextArea.append("\r\n");


                bos = new BufferedOutputStream(new FileOutputStream(Manifest.mr2));



                byte[] buffer = new byte[32768];
                while (true) {
                    // читаем данные в буфер
                    int readBytesCount = bis.read(buffer);
                    if (readBytesCount == -1) {
                        // данные закончились
                        break;
                    }
                    if (readBytesCount > 0) {
                        // данные были считаны - есть, что записать
                        bos.write(buffer, 0, readBytesCount);
                    }
                }


                GUI.jTextArea.append("файл считан");

                GUI.jTextArea.append("\r\n");

                GUI.jTextArea.append("файл получен");

                GUI.jTextArea.append("\r\n");


                bos.flush();

                bos.close();


                Control.File2_reception_complete=true;



            }







           //     BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           //     String Sensors_Info = br.readLine();
           //     System.out.println(Sensors_Info);
           //     br.close();


                bis.close();
             socket.close();



        }








        catch(Exception e){


            System.out.println(e);
            GUI.jTextArea.append(e+"\r\n");
            GUI.jTextArea.append("телефон клиент отвалился\r\n");

            //System.out.println();






            //VideoPlayer.mediaPlayerComponent.release();



            GUI.connect_with_tel=false;








        }





    }

















}


