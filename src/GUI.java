import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GUI extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField9;
    public static javax.swing.JTextArea jTextArea;
    private javax.swing.JToggleButton jToggleButton1;

    public static  boolean connect_with_tel=false;
    public static int direction;
    public static int speed=15;
    public static GUI gui;
    boolean stop=false;

    public GUI() {

        super("ПРИЛОЖЕНИЕ ДЛЯ УПРАВЛЕНИЯ РОБОТЕЛЕЖКОЙ");
        jPanel1 = new javax.swing.JPanel();// вызываем окно VLC
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jSlider1 = new javax.swing.JSlider(11,21,15);

        jToggleButton1 = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 325, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 490, Short.MAX_VALUE)
        );



        jPanel1.add(VideoPlayer.contentPane);

        jLabel4.setText("ТАНГАЖ 1");

        jLabel5.setText("КРЕН 1");

        jLabel6.setText("ТАНГАЖ 2");

        jTextField1.setText("         0 ");

        jTextField2.setText("          0");

        jTextField3.setText("          0");



        jLabel7.setText("КРЕН 2");

        jLabel8.setText("УСКОРЕНИЕ ПО ХОДУ ДВИЖЕНИЯ");

        jLabel9.setText("ОСВЕЩЕННОСТЬ");

        jTextField4.setText("           0");

        jTextField5.setText("           0");

        jTextField6.setText("           0");

        jLabel10.setText("ПРОЙДЕННЫЙ ПУТЬ");

        jTextField7.setText("           0 ");

        jLabel11.setText("ОБНУЛИТЬ ПУТЬ");

        jButton8.setText("C");

        jLabel13.setText("ТЕМПЕРАТУРА ДРАЙВЕРА");

        jTextField9.setText("TEMPERAT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap())
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(15, 15, 15))))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jButton8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButton1.setText("НАЗАД");


        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 40;
               GUI.jTextArea.append("НАЗАД\r\n");
                reqFocus(true);
            }
        });

        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 50;
           //     GUI.jTextArea.append(direction + "\r\n");
                reqFocus(true);

            }
        });




        jButton3.setText("ВПЕРЕД");

        jButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 38;
                GUI.jTextArea.append("ВПЕРЕД\r\n");
                reqFocus(true);
            }
        });

        jButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 50;
          //      GUI.jTextArea.append(direction + "\r\n");
                reqFocus(true);

            }
        });



        jButton2.setText("ВЛЕВО");

        jButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 37;
                GUI.jTextArea.append("ВЛЕВО\r\n");
                reqFocus(true);
            }
        });

        jButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 50;
           //     GUI.jTextArea.append(direction + "\r\n");
                reqFocus(true);

            }
        });





        jButton4.setText("НАПРАВО");
        jButton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 39;
                GUI.jTextArea.append("НАПРАВО\r\n");
                reqFocus(true);
            }
        });

        jButton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 50;
           //     GUI.jTextArea.append(direction + "\r\n");
                reqFocus(true);

            }
        });












        jSlider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {

                speed = jSlider1.getValue();
          //     GUI.jTextArea.append(""+speed);


            }
        });

        jButton7.setText("СКОРОСТЬ");

        jButton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 60;
            //    GUI.jTextArea.append(direction + "\r\n");
                GUI.jTextArea.append("СКОРОСТЬ = "+ (speed-11)+"\r\n");//
                reqFocus(true);
            }
        });

        jButton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 50;
           //     GUI.jTextArea.append(direction + "\r\n");
                reqFocus(true);

            }
        });







        jToggleButton1.setText("РУЧНОЕ");





        jToggleButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                direction = 50;
          //      GUI.jTextArea.append(direction + "\r\n");

            }
        });

        jToggleButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

                if (jToggleButton1.isSelected()) {
                    jToggleButton1.setText("АВТО");
                    direction = 68;
        //            GUI.jTextArea.append(direction + "\r\n");
                }
                else {
                    jToggleButton1.setText("РУЧНОЕ");
                    direction = 65;
         //           GUI.jTextArea.append(direction + "\r\n");
                }

                reqFocus(true);


            }


        });




        jButton5.setText("CONNECT");


        addKeyListener(new KeyListener()
        {
            public void keyTyped(KeyEvent keyEvent)
            {

            }


            @Override
            public void keyPressed(KeyEvent keyEvent)
            {
                direction = keyEvent.getKeyCode();
                reqFocus(true);


                switch (direction) {

                    case 40:
                        GUI.jTextArea.append("НАЗАД\r\n");
                        break;
                    case  38:
                        GUI.jTextArea.append("ВПЕРЕД\r\n");
                        break;
                    case 37:
                        GUI.jTextArea.append("ВЛЕВО\r\n");
                        break;
                    case 39:
                    GUI.jTextArea.append("НАПРАВО\r\n");
                    break;


                }
            }


            @Override
            public void keyReleased(KeyEvent keyEvent)
            {
                reqFocus(true);
                direction=50;
             //   GUI.jTextArea.append(""+ direction+"\r\n");

            }
        });















        jButton5.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)


            {

                    new Http_Client_forESP(Manifest.port_number_ESP);




            }
        });











        jButton6.setText("CONNECT");// связь с телефоном

        jButton6.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                reqFocus(true);


                    new Http_client_forsensors();
                    connect_with_tel =true;


            }
        });

        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                reqFocus(true);
                jTextField7.setText("          0 ");
                Udp_recipient.count=0;

            }
        });











        jLabel1.setText("РЕЖИМ");

        jLabel2.setText("РОБОТ");

        jLabel3.setText("ВИДЕО");



        jLabel12.setText("                             РУЧНОЕ  УПРАВЛЕНИЕ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton3)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jButton5)))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jButton2)
                                                                .addGap(70, 70, 70)))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                                                .addComponent(jButton4)
                                                                .addGap(36, 36, 36))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton5)
                                                        .addComponent(jButton6)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)))
                                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setFocusable(true);
        setLocationRelativeTo(null);
       // setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        DefaultCaret caret1 = (DefaultCaret)jTextArea.getCaret();
        caret1.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);




    }// </editor-fold>





    public  static void reqFocus(Boolean b){

        if(b){gui.requestFocus(true);}
        else{gui.requestFocus(false);}
    }





}
