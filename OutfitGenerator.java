import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class OutfitGenerator extends JFrame
{
    private JLabel titleLabel;
    private JPanel imagePanel;
    private JButton generateButton;
    private JLabel tshirtLabel, trousersLabel, shoesLabel;

    private String[] tshirts = {"src/images"};
    private String[] trousers = {"src/images"};
    private String[] shoes = {"src/images"};

    public OutfitGenerator()

    {
        //Main Configurations
        setTitle("OutfitGenerator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Title
        titleLabel = new JLabel("Luke's Closet", SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(20f));
        add(titleLabel, BorderLayout.NORTH);

        //Image Panel
        imagePanel = new JPanel();
        //Verticle Layout, Impersonates body
        imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.Y_AXIS));

        //Load Images
        tshirtLabel = new JLabel((new ImageIcon(new ImageIcon(tshirts[0]).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))));
        trousersLabel = new JLabel((new ImageIcon(new ImageIcon(trousers[0]).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))));
        shoesLabel = new JLabel((new ImageIcon(new ImageIcon(shoes[0]).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))));

        //Add to panel
        imagePanel.add(tshirtLabel);
        imagePanel.add(trousersLabel);
        imagePanel.add(shoesLabel);
        add(imagePanel, BorderLayout.CENTER);

        //Align maybe
        tshirtLabel.setHorizontalAlignment(SwingConstants.CENTER);
        trousersLabel.setHorizontalAlignment(SwingConstants.CENTER);
        shoesLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Random Button
        generateButton = new JButton("Generate");
        generateButton.addActionListener(e -> {
            Random rand = new Random();
            tshirtLabel.setIcon(new ImageIcon(tshirts[rand.nextInt(tshirts.length)]));
            trousersLabel.setIcon(new ImageIcon(trousers[rand.nextInt(trousers.length)]));
            shoesLabel.setIcon(new ImageIcon(shoes[rand.nextInt(shoes.length)]));
        });
        add(generateButton, BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args) {
        new OutfitGenerator();
    }
}
