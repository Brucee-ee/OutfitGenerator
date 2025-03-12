import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.formdev.flatlaf.FlatLightLaf;

public class OutfitGenerator extends JFrame
{
    private JLabel titleLabel;
    private JPanel imagePanel;
    private JButton generateButton;
    private JLabel tshirtLabel, trousersLabel, shoesLabel;

    private String[] tshirts =
            {
                    "images/tshirt1.png",
                    "images/tshirt2.png"
            };
    private String[] trousers =
            {
                    "images/trousers1.png",
                    "images/trousers2.png"
            };
    private String[] shoes =
            {
                    "images/shoes1.png",
                    "images/shoes2.png"
            };

    public OutfitGenerator()

    {
        //FlatL New design maybe
        try
        {
            UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.err.println("Failed to set look and feel.");
        }

        //Main Configurations
        setTitle("OutfitGenerator");
        setSize(300, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(240, 240, 240));

        //Title
        titleLabel = new JLabel("Luke's Closet", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titleLabel, BorderLayout.NORTH);

        //Image Panel
        imagePanel = new JPanel();
        imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.Y_AXIS));

        //Load Images
        tshirtLabel = new JLabel(new ImageIcon(new ImageIcon(tshirts[0]).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        trousersLabel = new JLabel(new ImageIcon(new ImageIcon(trousers[0]).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        shoesLabel = new JLabel(new ImageIcon(new ImageIcon(shoes[0]).getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH)));

        //Add to panel
        imagePanel.add(tshirtLabel);
        imagePanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing
        imagePanel.add(trousersLabel);
        imagePanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing
        imagePanel.add(shoesLabel);
        add(imagePanel, BorderLayout.CENTER);

        //Align maybe
        tshirtLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        trousersLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        shoesLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Random Button
        generateButton = new JButton("Generate Outfit"); //Top Text
        generateButton.setFont(new Font("Segoe UI", Font.BOLD, 14));//Font and size
        generateButton.setBackground(new Color(0, 120, 215)); //Blue background
        generateButton.setForeground(Color.white);//White text
        generateButton.setFocusPainted(false);
        generateButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        generateButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        generateButton.addActionListener(e -> {
            Random rand = new Random();
            tshirtLabel.setIcon(new ImageIcon(new ImageIcon(tshirts[rand.nextInt(tshirts.length)]).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
            trousersLabel.setIcon(new ImageIcon(new ImageIcon(trousers[rand.nextInt(trousers.length)]).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
            shoesLabel.setIcon(new ImageIcon(new ImageIcon(shoes[rand.nextInt(shoes.length)]).getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
        });
        add(generateButton, BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new OutfitGenerator().setVisible(true));
    }
}
