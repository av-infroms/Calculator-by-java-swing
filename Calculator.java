package firstsample;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

	
	JFrame jf;
	JLabel DisplayLabel;
	
	//JButton button;
	
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton divbutton;
	JButton clearbutton;
	
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton mulbutton;
	JButton ACButton;
	
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton plusbutton;
	JButton permbutton;
	
	JButton dotbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton minusbutton;
	JButton combbutton;
	
	JButton sinbutton;
	JButton cosbutton;
	JButton tanbutton;
	JButton pibutton;
	JButton factbutton;
	
	String oldvalue;
	String newvalue;
	float  oldvalueF;
	float  newvalueF;
	float  result;
	int div=0,mul=0,plus=0,minus=0;
	double oldvalueD;
	double answer;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Calculator() {
		
	
	//DisplayLabel	
		
	DisplayLabel=new JLabel();
	DisplayLabel.setBounds(20, 45, 500, 50);
	DisplayLabel.setBackground(Color.gray);	
	DisplayLabel.setOpaque(true);
	DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	DisplayLabel.setForeground(Color.white );
	DisplayLabel.setFont(new Font("Serif", Font.PLAIN, 30));
	DisplayLabel.setFont(new Font("Serif", Font.BOLD, 25));
	
	//JFrame
	
	jf=new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(540,660);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.add(DisplayLabel);	
	
	
	
	//buttons

/*	
    button=new JButton("");
	button.setBounds(30, 130, 80, 80);
	button.addActionListener(this);
	button.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(button);
*/	
	
	//firstrow
	sevenbutton=new JButton("7");
	sevenbutton.setBounds(30, 130, 80, 80);
	sevenbutton.addActionListener(this);
	sevenbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(sevenbutton);
	
	eightbutton=new JButton("8");
	eightbutton.setBounds(130, 130, 80, 80);
	eightbutton.addActionListener(this);
	eightbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(eightbutton);

	ninebutton=new JButton("9");
	ninebutton.setBounds(230, 130, 80, 80);
	ninebutton.addActionListener(this);
	ninebutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(ninebutton);

	divbutton=new JButton("/");
	divbutton.setBounds(330, 130, 80, 80);
	divbutton.addActionListener(this);
	divbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(divbutton);
	
	ACButton=new JButton("AC");
	ACButton.setBounds(430, 130, 80, 80);
	ACButton.addActionListener(this);
	ACButton.setFont(new Font("Arial",Font.PLAIN, 25 ));
	jf.add(ACButton);
	
	
	//secondrow
	
	
	fourbutton=new JButton("4");
	fourbutton.setBounds(30, 230, 80, 80);
	fourbutton.addActionListener(this);
	fourbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(fourbutton);

	fivebutton=new JButton("5");
	fivebutton.setBounds(130, 230, 80, 80);
	fivebutton.addActionListener(this);
	fivebutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(fivebutton);
	
	sixbutton=new JButton("6");
	sixbutton.setBounds(230, 230, 80, 80);
	sixbutton.addActionListener(this);
	sixbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(sixbutton);
	
	mulbutton=new JButton("*");
	mulbutton.setBounds(330, 230, 80, 80);
	mulbutton.addActionListener(this);
	mulbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(mulbutton);

	clearbutton=new JButton("CLEAR");
	clearbutton.setBounds(430, 230, 80, 80);
	clearbutton.addActionListener(this);
	clearbutton.setFont(new Font("Arial",Font.PLAIN, 13 ));
	jf.add(clearbutton);
	
	
	

//third row
	
	onebutton=new JButton("1");
	onebutton.setBounds(30, 330, 80, 80);
	onebutton.addActionListener(this);
	onebutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(onebutton);
	
	twobutton=new JButton("2");
	twobutton.setBounds(130, 330, 80, 80);
	twobutton.addActionListener(this);
	twobutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(twobutton);
	
	threebutton=new JButton("3");
	threebutton.setBounds(230, 330, 80, 80);
	threebutton.addActionListener(this);
	threebutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(threebutton);
	
	plusbutton=new JButton("+");
	plusbutton.setBounds(330, 330, 80, 80);
	plusbutton.addActionListener(this);
	plusbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(plusbutton);

    permbutton=new JButton("perm");
	permbutton.setBounds(430, 330, 80, 80);
	permbutton.addActionListener(this);
	permbutton.setFont(new Font("Arial",Font.PLAIN, 17 ));
	jf.add(permbutton);
	
	
	//forth row
	
	dotbutton=new JButton(".");
	dotbutton.setBounds(30, 430, 80, 80);
	dotbutton.addActionListener(this);
	dotbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(dotbutton);
	
	zerobutton=new JButton("0");
	zerobutton.setBounds(130, 430, 80, 80);
	zerobutton.addActionListener(this);
	zerobutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(zerobutton);
	
	equalbutton=new JButton("=");
	equalbutton.setBounds(230, 430, 80, 80);
	equalbutton.addActionListener(this);
	equalbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(equalbutton);
	
	minusbutton=new JButton("-");
	minusbutton.setBounds(330, 430, 80, 80);
	minusbutton.addActionListener(this);
	minusbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(minusbutton);

	
    combbutton=new JButton("comb");
    combbutton.setBounds(430, 430, 80, 80);
    combbutton.addActionListener(this);
    combbutton.setFont(new Font("Arial",Font.PLAIN, 17 ));
	jf.add(combbutton);
	
	//fifth row
	
	sinbutton=new JButton("sin");
	sinbutton.setBounds(30, 530, 80, 80);
	sinbutton.addActionListener(this);
	sinbutton.setFont(new Font("Arial",Font.PLAIN, 30 ));
	jf.add(sinbutton);
	
	cosbutton=new JButton("cos");
	cosbutton.setBounds(130, 530, 80, 80);
	cosbutton.addActionListener(this);
	cosbutton.setFont(new Font("Arial",Font.PLAIN, 27 ));
	jf.add(cosbutton);
	
	tanbutton=new JButton("tan");
	tanbutton.setBounds(230, 530, 80, 80);
	tanbutton.addActionListener(this);
	tanbutton.setFont(new Font("Arial",Font.PLAIN, 27 ));
	jf.add(tanbutton);
	
    pibutton=new JButton("π");
    pibutton.setBounds(330, 530, 80, 80);
    pibutton.addActionListener(this);
    pibutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(pibutton);
	
    factbutton=new JButton("!");
    factbutton.setBounds(430, 530, 80, 80);
    factbutton.addActionListener(this);
    factbutton.setFont(new Font("Arial",Font.PLAIN, 40 ));
	jf.add(factbutton);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jf.getContentPane().setForeground(Color.BLUE);
		
		//buttons actions
		if(e.getSource()==sevenbutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"7");
		
		}
	
		
		else if(e.getSource()==eightbutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"8");
		
		}
		else if(e.getSource()==ninebutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"9");
		
		}
		else if(e.getSource()==fourbutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"4");
		
		}
		else if(e.getSource()==fivebutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"5");
		
		}
		else if(e.getSource()==sixbutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"6");
		
		}
		else if(e.getSource()==onebutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"1");
		
		}
		else if(e.getSource()==twobutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"2");
		
		}
		else if(e.getSource()==threebutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"3");
		
		}
		else if(e.getSource()==zerobutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+"0");
		
		}
		else if(e.getSource()==dotbutton) {
			
			DisplayLabel.setText(DisplayLabel.getText()+".");
		
		}
	
	
	
	
	
	
	//operations
		if(e.getSource()==divbutton) {
			oldvalue=DisplayLabel.getText();
			DisplayLabel.setText("");
			div=1;
		}
		else if(e.getSource()==mulbutton) {
			oldvalue=DisplayLabel.getText();
			DisplayLabel.setText("");
			mul=1;
		}
		else if(e.getSource()==plusbutton) {
			oldvalue=DisplayLabel.getText();
			DisplayLabel.setText("");
			plus=1;
		}
		else if(e.getSource()==minusbutton) {
			oldvalue=DisplayLabel.getText();
			DisplayLabel.setText("");
			minus=1;
		}
		else if(e.getSource()==ACButton) {
			DisplayLabel.setText("");
			newvalueF=0;
			oldvalueF=0;
			result=0;
		}
		else if(e.getSource()==clearbutton) {
			DisplayLabel.setText(DisplayLabel.getText().substring(0, DisplayLabel.getText().length() - 1));
		}
		else if(e.getSource()==pibutton){
			DisplayLabel.setText(""+Math.PI);
		}
		else if(e.getSource()==factbutton){
			
		}
		else if(e.getSource()==permbutton){
			
		}
		else if(e.getSource()==combbutton){
			
		}
		else if(e.getSource()==sinbutton){
			oldvalue=DisplayLabel.getText();
			oldvalueD=Float.parseFloat(oldvalue);
			answer=sinfunc(oldvalueD);
			DisplayLabel.setText(answer+"");
		}
		else if(e.getSource()==cosbutton){
			oldvalue=DisplayLabel.getText();
			oldvalueD=Float.parseFloat(oldvalue);
			answer=cosfunc(oldvalueD);
			DisplayLabel.setText(answer+"");
		}
		else if(e.getSource()==tanbutton){
			oldvalue=DisplayLabel.getText();
			oldvalueD=Float.parseFloat(oldvalue);
			answer=tanfunc(oldvalueD);
			DisplayLabel.setText(answer+"");
		}
		
	//equalbutton
		if(e.getSource()==equalbutton){
			newvalue=DisplayLabel.getText();
			oldvalueF=Float.parseFloat(oldvalue);
			newvalueF=Float.parseFloat(newvalue);
			
			
			if(div==1) {
				result=oldvalueF/newvalueF;
				DisplayLabel.setText(""+result);
				div=0;
				newvalueF=0;
				oldvalueF=0;
				result=0;
			}
			else if(mul==1) {
				result=oldvalueF*newvalueF;
				DisplayLabel.setText(""+result);
				mul=0;
				newvalueF=0;
				oldvalueF=0;
				result=0;
			}
			else if(plus==1) {
				result=oldvalueF+newvalueF;
				DisplayLabel.setText(""+result);
				plus=0;
				newvalueF=0;
				oldvalueF=0;
				result=0;
			}
			else if(minus==1) {
				result=oldvalueF-newvalueF;
				DisplayLabel.setText(""+result);
				minus=0;
				newvalueF=0;
				oldvalueF=0;
				result=0;
			}
			
			
			
			
			
		}//equalbuttoncloses
	
	

		

		
		
		
		
		
		
		
		
		
	}//action performed
	
	

	double sinfunc(double num1) {
		double result=num1;
		result=Math.sin(result);
		return result;
	}
	
	double cosfunc(double num1) {
		double result=num1;
		result=Math.cos(result);
		return result;
	}
	
	double tanfunc(double num1) {
		double result=num1;
		result=Math.tan(result);
		return result;
	}












}//class