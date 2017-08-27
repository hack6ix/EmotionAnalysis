import java.awt.Dimension;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstPage extends JLabel{

	public static ImageIcon IDPage;
	JTextField textArea;
	static {
		ClassLoader loader = FirstPage.class.getClassLoader();

		try{
			IDPage = new ImageIcon(ImageIO.read(loader.getResource("PAGE1BACKGROUNDCOVER.PNg")));
			
		}catch(IOException e){
			System.out.println("Could not find file");
		}
		
		
	}
	
	public FirstPage(){
		
		super.setIcon(IDPage);
		this.setPreferredSize(new Dimension(375,641));
//		this.textArea =  new JTextField(30);
//		this.add(this.textArea);
		JButton button = new JButton("ANALYZE");
		this.revalidate();
	}
	
	
	
}
