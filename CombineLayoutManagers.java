package baitap;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CombineLayoutManagers extends JFrame {
	private boolean addBool;
	private boolean subBool;
	private boolean mulBool;
	private boolean divBool;
	TextField tx;
	String display="";
	private double TEMP;
    private double SolveTEMP;
	
	public CombineLayoutManagers()
	{
//Frame f = new Frame();//BorderLayout by default
		
        JPanel P1 = new JPanel();//FlowLayout by default
        JPanel P2 = new JPanel();
		
        P2.setLayout(new GridLayout(3,4));
        this.setBounds(600,200,0,0);
        Button one = new Button("1");
        one.addActionListener(new One());
        Button two = new Button("2");
        two.addActionListener(new Two());
        Button three = new Button("3");
        three.addActionListener(new Three());
        Button four = new Button("4");
        four.addActionListener(new Four());
        Button five = new Button("5");
        five.addActionListener(new Five());
        Button six = new Button("6");
        six.addActionListener(new Six());
        Button seven = new Button("7");
        seven.addActionListener(new Seven());
        Button eight = new Button("8");
        eight.addActionListener(new Eight());
        Button nine = new Button("9");
        nine.addActionListener(new Nine());
        Button zero = new Button("0");
        zero.addActionListener(new Zero());
        Button equal = new Button("=");
        equal.addActionListener(new Equal());
        Button ac = new Button("AC");
        ac.addActionListener(new AC());
        P2.add(one);
        P2.add(two);
        P2.add(three);
        P2.add(four);
        P2.add(five);
        P2.add(six);
        P2.add(seven);
        P2.add(eight);
        P2.add(nine);
        P2.add(zero);
        P2.add(equal);
        P2.add(ac);
        Button add= new Button("+");
        add.addActionListener(new Add());
        Button sub= new Button("-");
        sub.addActionListener(new Sub());
        Button mul= new Button("*");
        mul.addActionListener(new Mul());
        Button div= new Button("/");
        div.addActionListener(new Div());
        P1.add(add);
        P1.add(sub);
        P1.add(mul);
        P1.add(div);
        
       tx = new TextField();
       
       getContentPane().add(tx,"North");
       getContentPane().add(P1,"South");
       getContentPane().add(P2);//remainder space of frame is center
       
       this.show();
       this.pack();
           
	}
	class One implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"1";
			tx.setText(display);
		}
		
	}
	class Two implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"2";
			tx.setText(display);
		}
		
	}
	class Three implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"3";
			tx.setText(display);
		}
		
	}
	class Four implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"4";
			tx.setText(display);
		}
		
	}
	class Five implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"5";
			tx.setText(display);
		}
		
	}
	class Six implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"6";
			tx.setText(display);
		}
		
	}
	class Seven implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"7";
			tx.setText(display);
		}
		
	}
	class Eight implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"8";
			tx.setText(display);
		}
		
	}
	class Nine implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"9";
			tx.setText(display);
		}
		
	}
	class Zero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display=display+"0";
			tx.setText(display);
		}
		
	}
	class Equal implements ActionListener {


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			SolveTEMP = Double.parseDouble(tx.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = SolveTEMP - TEMP;
            else if ( mulBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                            SolveTEMP = SolveTEMP / TEMP;
            tx.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
		}
		
	}
	class AC implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display="";
			tx.setText(display);
			addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
		}
		
	}
	class Add implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			TEMP = Double.parseDouble(tx.getText());
			display="";
			tx.setText(display);
			addBool=true;
		}
		
	}
	class Sub implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			TEMP = Double.parseDouble(tx.getText());
			display="";
			tx.setText(display);
			subBool=true;
		}
		
	}
	class Mul implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			TEMP = Double.parseDouble(tx.getText());
			display="";
			tx.setText(display);
			mulBool=true;
		}
		
	}
	class Div implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			TEMP = Double.parseDouble(tx.getText());
			display="";
			tx.setText(display);
			divBool=true;
		}
		
	}
	public static void main(String[] args) {
		
        try {
        	new CombineLayoutManagers();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
	}

	
}

