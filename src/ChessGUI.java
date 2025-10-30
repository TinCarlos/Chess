import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class ChessGUI extends mainBoard implements ActionListener {
    private JFrame frame = new JFrame();

    ImageIcon boardBackgroundIcon = new ImageIcon("/Users/carlosolvera/Downloads/Woodronic 19_ Professional Wood Chess Board, Tournament Chess Board with 2_0_ Squares, Ideal Gift for Chess Players.jpeg");
    ImageIcon pawnIcon = new ImageIcon("/Users/carlosolvera/Downloads/1-pawn-chess-piece-ktsdesign.jpg");

    public ChessGUI() {
        frame.setTitle("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 600));

        Image boardImage = boardBackgroundIcon.getImage();
        Image scaledBoardImage = boardImage.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        ImageIcon scaledBoardIcon = new ImageIcon(scaledBoardImage);

        JLabel backgroundLabel = new JLabel(scaledBoardIcon);
        backgroundLabel.setBounds(0, 0, 800, 600);

        int pawnWidth = 100;
        int pawnHeight = 110;
        Image pawnImage = pawnIcon.getImage();
        Image pawnScaledImage = pawnImage.getScaledInstance(pawnWidth, pawnHeight, Image.SCALE_SMOOTH);
        ImageIcon pawn = new ImageIcon(pawnScaledImage);
        
        JLabel pawnLabel = new JLabel(pawn);
        pawnLabel.setBounds(350, 250, pawnWidth, pawnHeight); // Center of the board

        layeredPane.add(backgroundLabel, new Integer(0)); // Background layer
        layeredPane.add(pawnLabel, new Integer(1)); // Foreground layer (on top)

        frame.add(layeredPane);
        frame.pack(); // This will size the frame to fit the preferred size
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle action events here
    }

    public static void main(String[] var0) {
        new ChessGUI();
    }
}