import javax.swing.*;
import java.awt.*;
public class Text extends JFrame {
    public static void main(String[] args) {
        Text text = new Text();
    }
public Text(){
    JPanel jp1 = new JPanel();
    JButton jb1 = new JButton("北");
    JButton jb2 = new JButton("南");
    JButton jb3 = new JButton("中");
    JButton jb4 = new JButton("东");
    JButton jb5 = new JButton("西");
    JTextArea jt1 = new JTextArea();
//    布局
    jp1.setLayout(new BorderLayout());
    jp1.add(jb1);
    jp1.add(jb2);
    jp1.add(jb3);
    jp1.add(jb4);
    jp1.add(jb5);
    jp1.add(jt1);


    jp1.add(jb1,BorderLayout.NORTH);

    jp1.add(jb2,BorderLayout.SOUTH);
    jp1.add(jb3,BorderLayout.CENTER);
    jp1.add(jb4,BorderLayout.EAST);
    jp1.add(jb5,BorderLayout.WEST);

    this.setLayout(new BorderLayout());
    this.add(jp1,BorderLayout.CENTER);
//窗口
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);;
    this.setBounds(0,0,300,200);


}



}
