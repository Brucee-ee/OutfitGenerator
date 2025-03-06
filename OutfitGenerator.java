import javax.swing.*;
import java.awt.*;

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
        titleLabel = new JLabel("Luke's Closet");

        //Image Panel

        //Load Images

        //Add to panel

        //Align maybe

        //Random Button
    }

}
