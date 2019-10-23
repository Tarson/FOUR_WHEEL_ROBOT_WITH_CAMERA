
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;




public class Udp_Client extends Thread
{

    int numb=10;
    String ip_address;
    byte [] data;
    int udp_port;
    InetAddress addr;
    DatagramSocket ds;


    public Udp_Client()

    {
        ip_address=Manifest.IP_ADDRESS_ESP;
        udp_port=Manifest.udp_port_number;

        try
        {
            ds = new DatagramSocket();
            addr = InetAddress.getByName(ip_address);

        }
        catch (Exception e)
        {
            System.out.println(e);

            GUI.jTextArea.append("НЕ МОГУ СОЗДАТЬ UDP ОТПРАВИТЕЛЯ\r\n");
        }

        start();
    }

    public void run()  {

/*
    keys servo 1  -  37 39 strelki
    keys servo 2  -  87  83 ws
    keys servo 3  -  65  68 ad
    keys servo 4   - 38  40 strelki
*/




        while (true)
        {

            switch (GUI.direction)
            {

                case (37):
                    numb=1;// влево
                    break;
                case (39):
                    numb=2;// вправо
                    break;
                case (38):
                    numb=3;// вверх
                    break;
                case (40):
                    numb=4;// вниз
                    break;

                case (87):
                    numb=5;
                    break;
                case (83):
                    numb=6;
                    break;
                case (65):
                    numb=7;//  переключение автоматики в ручной
                    break;
                case (68):
                    numb=8;//  переключение ручного в автоматику
                    break;
                case (60):
                    numb=GUI.speed;  // передаем скорость  от 11 до  21 , на ардуино переводим в нужные градации
                    break;

                case (50):
                    numb=0; // 0 - сигнал о конце передачи команд (чтобы не засорять линию трафиком)
                    break;
                default:
                    numb=10;  // ничего не отправляем по UDP
            }


            String s = "" + numb;
            data = s.getBytes();





            if(numb!=10) {
                DatagramPacket pack = new DatagramPacket(data, data.length, addr, udp_port);
                try {
                    ds.send(pack);


               //   GUI.jTextArea.append(s+ "\r\n");

                    Thread.sleep(100);

                } catch (Exception e) {
                    System.out.println(e);

                 //   GUI.jTextArea.append("НЕ МОГУ ПОСЛАТЬ  UDP ПАКЕТ\r\n");
                }
                if(numb==0){GUI.direction=0;}//перестаем отправлять нулевые пакеты
            }

        }
    }



}
