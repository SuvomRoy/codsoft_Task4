import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.*;
import java.util.*;
import java.awt.*;
public class WordCounterGUI extends JFrame implements ActionListener{
    JLabel jlabel1, jlabel, jlabel2,jlabel3;
    JTextField jfield;
    JButton jbutton;
    JButton jbutton2;
    public WordCounterGUI(){
        getContentPane().setBackground(Color.pink);
        Font f=new Font("verdana",Font.BOLD,14);
        Font f1=new Font("arial",Font.BOLD,12);
    setTitle("WORD COUNTER");
    jlabel=new JLabel("Enter Your Text or Insert FileName:");
    jlabel.setBounds(60,30,300,60);
    jlabel.setForeground(Color.black);
    jlabel.setFont(f);
    jfield=new JTextField();
    jfield.setBounds(80,100,250,30);
    jfield.setFont(f1);
    jlabel2=new JLabel();
    jlabel2.setBounds(90,220,300,30);
    jbutton=new JButton("RESULT");
    jbutton.setBounds(150,170,100,30);
    jbutton.setBackground(Color.green);
    jbutton.setForeground(Color.black);
    jbutton.setFont(f1);
    add(jbutton);
    jlabel1=new JLabel();
    jlabel1.setBounds(100,250,250,40);
    jlabel3=new JLabel();
    jlabel3.setBounds(100,250,250,40);
    jlabel3.setForeground(Color.red);
    add(jlabel3);
    jbutton2=new JButton("EXIT");
    jbutton2.setBounds(160,300,80,30);
    jbutton2.setBackground(Color.red);
    jbutton2.setForeground(Color.black);
    jbutton2.setFont(f1);
    add(jbutton2);
    add(jlabel1);
    add(jfield);
    add(jlabel);
    add(jlabel2);
    jbutton.addActionListener(this);
    jbutton2.addActionListener(this);
    setLayout(null);
    setSize(400,400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==jbutton2)
    System.exit(0);
    if(e.getSource()== jbutton){
    LinkedHashSet<String> set=new LinkedHashSet<>();
    String text=jfield.getText();
    int i;
    String c="";
    String res;
    if(text.length()==0){
    jlabel3.setText("Invalid Input Has Been Passed.");
    jlabel2.setText("");
    jlabel1.setText("");
    }
  else{
    try {
        FileReader read=new FileReader(text);
        File file=new File(text);
        if(file.length()==0){
            jlabel3.setText("Inserted File Content Is Empty.");
            jlabel2.setText("No Uniqie Words Has Been Found!!");
        }
        else{
            while((i=read.read())!=-1){
                c=c+(char)i;
            }
            String[] arr=c.split(" ");
            jlabel1.setText("Total Letter Is: "+file.length()+" Total Words Is: "+arr.length);
            for(int j=0;j<arr.length;j++){
                set.add(arr[j]);
            }
            jlabel2.setText("Total Number Of Unique Word Is: "+set.size());
            jlabel3.setText("");

        }
    } catch (Exception a) {
        if(text.contains("txt")){
        jlabel3.setText("Error File Has Been Passed");
        jlabel2.setText("");
        jlabel1.setText("");
        }
        else{
        res= text;
        String[] word=text.split(" ");
        jlabel3.setText("");
        jlabel1.setText("Total Letter Is: "+text.length()+"  \nTotal Words Is: "+word.length);
        for(int n=0;n<word.length;n++){
            set.add(word[n]);
        }
        jlabel2.setText("Total Number Of Unique Words Is: "+set.size());
        }
    }
}
}
}
public static void main(String args[])
{
    WordCounterGUI ob=new WordCounterGUI();
}
}