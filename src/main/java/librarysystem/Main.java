package librarysystem;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;



public class Main {

	public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
	      EventQueue.invokeLater(() -> 
	         {
	            LibrarySystem.INSTANCE.setTitle("Sample Library Application");
	            LibrarySystem.INSTANCE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            
	            LibrarySystem.INSTANCE.init();
	            centerFrameOnDesktop(LibrarySystem.INSTANCE);
	            LibrarySystem.INSTANCE.setVisible(true);
	         });
	   }
	   
	   public static void centerFrameOnDesktop(Component f) {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			int height = toolkit.getScreenSize().height;
			int width = toolkit.getScreenSize().width;
			int frameHeight = f.getSize().height;
			int frameWidth = f.getSize().width;
			f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
		}
}
