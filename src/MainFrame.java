import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame {
    private int dirflag = 1, objx = 50, objy = 50, objh, w = 50;

    private Container cp;
    private JLabel setBounds(objx,objy)
    private JLabel jbtn = new JLabel();
    private JButton jbtn1 = new JButton("Run");
    private JButton jbtn2 = new JButton("↑");
    private JButton jbtn3 = new JButton("↓");
    private JButton jbtn4 = new JButton("←");
    private JButton jbtn5 = new JButton("→");
    private JButton jbtn6 = new JButton("Exit");
    private ImageIcon icon = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\untitled\\src");
    private JLabel jlb = new JLabel();
    private JPanel jpnc = new JPanel(new GridLayout());
    private JPanel jpns = new JPanel(new GridLayout(1,6,3,3));
    private Timer t1;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(200, 100);
        this.setSize(800, 600);
        cp = this.getContentPane();
        jlb.setIcon(icon);
        jpns.add(jbtn);
        jpns.add(jbtn1);
        jpns.add(jbtn2);
        jpns.add(jbtn3);
        jpns.add(jbtn4);
        jpns.add(jbtn5);
        jpns.add(jbtn6);
        jpnc.add(jlb);
        cp.add(jpnc,BorderLayout.CENTER);
        cp.add(jpns,BorderLayout.SOUTH);
        t1 = new Timer(200, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (dirflag){
                    case 1:
                        if(objy - 2 >0){
                            objy-=2;
                        }
                        break;
                    case 2:
                        if(objy<600-objy){
                            objy+=2;
                        }
                    break;
                    case 3:
                        if (objx-2<0){
                            objx = 2;
                        }
                        break;
                    case  4:
                        if(objx<500-objh){
                            objx +=2;
                        }
                }

            }
        });

        jbtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
