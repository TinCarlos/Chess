import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChessGUI extends mainBoard implements ActionListener {
    private JLabel label1;
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    ImageIcon icon = new ImageIcon("/Users/carlosolvera/Downloads/Woodronic 19_ Professional Wood Chess Board, Tournament Chess Board with 2_0_ Squares, Ideal Gift for Chess Players.jpeg"); // Corrected path
    JLabel backgroundLabel = new JLabel(icon);

    public ChessGUI() { // Constructor for ChessGUI
        frame.setTitle("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Set appropriate size

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1)); // Example layout

        panel.add(backgroundLabel); // Add background image to panel
        

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle action events here (e.g., button clicks)
    }

    public static void main(String[] var0) {
        new ChessGUI();
    }
}