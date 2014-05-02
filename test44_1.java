import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test44_1 extends JFrame{
	
	private JLabel item1;
	
	public test44_1(){
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is the text");
		item1.setToolTipText("This is the hower tip");
		add(item1);
	}
	
	
	
}
