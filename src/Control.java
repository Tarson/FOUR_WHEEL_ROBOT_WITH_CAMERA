public class Control extends Thread{



    public static  boolean File1_reception_complete=false;

    public static  boolean File2_reception_complete=false;


    Control(){

        new Http_client_forsensors().start();;
    }


    public void run() {






        new Http_client(1).start();


        while (!File1_reception_complete) {

            if(!GUI.connect_with_tel)
            {break;}
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }
        }


            while (GUI.connect_with_tel) //бесконечный цикл


            {


            new Http_client(2).start();

            if(!GUI.connect_with_tel)
            {break;}








            while (!File2_reception_complete) {

                if(!GUI.connect_with_tel)
                {break;}

                try {



                    Thread.sleep(1);
                } catch (Exception e) {
                }
            }


            new Http_client(1).start();



                if(!GUI.connect_with_tel)
                {break;}







            while (!File1_reception_complete) {

                if(!GUI.connect_with_tel)
                {break;}


               try {
                    Thread.sleep(1);
                } catch (Exception e) {
              }
            }

            //PlayFile.run(1);








        }

        GUI.jTextArea.append("выход из контроля\r\n");
       System.out.println();







        File1_reception_complete=false;
        File2_reception_complete=false;





    }


}
