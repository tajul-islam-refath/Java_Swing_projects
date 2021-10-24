
package javaquizelogin;

import java.awt.*;

import javax.swing.*;

public class JavaQuizeLogin {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Login Form");
        jf.setLocation(400, 200);

       
        JPanel jp = new JPanel(new GridLayout(3, 1, 10, 10));
        
        JTextField name = new JTextField("Enter Your name");
        JTextField email = new JTextField("Enter your email");
        JButton jb = new JButton("Submit");
        
        
        jp.add(name);
        jp.add(email);
        jp.add(jb);


        jf.add(jp);
        jf.setSize(400, 200);
        jf.setVisible(true);
    }

}
