import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class SNULinks {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createGUI();
        });
    }

    private static void createGUI() {
        JFrame frame = new JFrame("SNULinks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a panel with a BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);

        // Modify the topPanel to use BorderLayout instead of FlowLayout
       JPanel topPanel = new JPanel(new BorderLayout());
       Color topColor = new Color(0, 81, 151); // #005197
       topPanel.setBackground(topColor);
       topPanel.setPreferredSize(new Dimension(frame.getWidth(), 150)); // 100 pixels for margin-block-start
       panel.add(topPanel, BorderLayout.NORTH);

       // Add the image to the top-left corner using BorderLayout
       ImageIcon topImageIcon = new ImageIcon("SNULOGO.png"); 
       JLabel topImageLabel = new JLabel(topImageIcon);
       topPanel.add(topImageLabel, BorderLayout.WEST); // Position in the WEST (left) of BorderLayout

       // Create a search container panel with the search option
       JPanel searchPanel = new JPanel(new BorderLayout());
       JTextField searchField = new JTextField(10);
       JButton searchButton = new JButton("Search");
       searchPanel.add(searchField);
       searchPanel.add(searchButton);
       topPanel.add(searchPanel, BorderLayout.CENTER); // Position in the CENTER of BorderLayout
       searchPanel.setVisible(true);


        // Create a label to display the user's name
        JLabel userNameLabel = new JLabel("Hi, Rishika.");
        topPanel.add(userNameLabel);
        userNameLabel.setForeground(Color.WHITE);
        topPanel.add(userNameLabel, BorderLayout.EAST);

        // Create a content panel with a GridLayout to display the rectangles
        JPanel contentPanel = new JPanel(new GridLayout(6, 6, 10, 10)); // 10 pixels for margin-inline-start and margin-inline-end
        contentPanel.setBackground(Color.WHITE);
        panel.add(contentPanel, BorderLayout.CENTER);

        // Create an array of texts and corresponding images for the rectangles
        String[] texts = {
            "University ERP", "Assistantship/Award", "Blackboard", "CCT",
            "Certificate Issuance", "Course Evaluation Survey", "Doctoral Portal", "Fastrack",
            "Hostel Management", "ID Card Management", "Mobile App CMS", "On Campus Job", "Student Outbound Mobility",
            "Student Attendance Recording", "Student Attendance Management", "Student Clearance", "Student Payment Centre"
        };
        ImageIcon[] rectangleImages = {
            new ImageIcon("ERP.png"),
            new ImageIcon("AA.jpeg"),
            new ImageIcon("BB.jpeg"),
            new ImageIcon("CCT.jpeg"),
            new ImageIcon("CI.jpeg"),
            new ImageIcon("CES.jpeg"),
            new ImageIcon("DP.jpeg"),
            new ImageIcon("Fastrack.jpeg"),
            new ImageIcon("HM.jpeg"),
            new ImageIcon("IDCM.jpeg"),
            new ImageIcon("MACMS.jpeg"),
            new ImageIcon("OCJ.jpeg"),
            new ImageIcon("SOM.jpeg"),
            new ImageIcon("SAMR.jpeg"),
            new ImageIcon("SAMR.jpeg"),
            new ImageIcon("SC.jpeg"),
            new ImageIcon("SPC.jpeg")
        };

        for (int i = 0; i < texts.length; i++) {
            JPanel rectangle = new JPanel();
            rectangle.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rectangle.setPreferredSize(new Dimension(10, 10));
            rectangle.setBackground(Color.WHITE);

            // Add an image to the rectangle
            if (i < rectangleImages.length) {
                JLabel imageLabel = new JLabel(rectangleImages[i]);
                rectangle.add(imageLabel);
            }

            JLabel label = new JLabel(texts[i]);
            rectangle.add(label);
            contentPanel.add(rectangle, BorderLayout.CENTER);
        }
        

        class HoverMouseListener extends MouseAdapter {
        private final JPanel panel;
        private final Color originalColor;
        private final Color hoverColor;

        public HoverMouseListener(JPanel panel, Color originalColor, Color hoverColor) {
            this.panel = panel;
            this.originalColor = originalColor;
            this.hoverColor = hoverColor;
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panel.setBackground(hoverColor);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panel.setBackground(originalColor);
        }
        }
    
        

        // Add empty panels for 4 rows
       for (int i = 0; i < 16; i++) {
       JPanel emptyRow = new JPanel();
        contentPanel.add(emptyRow);
        emptyRow.setBackground(Color. WHITE);
}

 

    

        // Create a bottom panel with the color #17141f and the same height as the top
        JPanel bottomPanel = new JPanel();
        Color bottomColor = new Color(23, 20, 31);  // #17141f
        bottomPanel.setBackground(bottomColor);
        bottomPanel.setPreferredSize(topPanel.getPreferredSize());
        panel.add(bottomPanel, BorderLayout.SOUTH);

        // Add options at the bottom with corresponding images
        ImageIcon[] optionImages = {
            new ImageIcon("SP.png"),
            new ImageIcon("SH.png"),
            new ImageIcon("AR.png"),
            new ImageIcon("UL.png"),
            new ImageIcon("MM.png"),
            new ImageIcon("NIDH.png")
        };

        for (int i = 0; i < 6; i++) {
            JButton button = new JButton(optionImages[i]);
            button.setPreferredSize(new Dimension(225, 50));
            bottomPanel.add(button);
        }
        

        frame.setVisible(true);
    }}
        


    





