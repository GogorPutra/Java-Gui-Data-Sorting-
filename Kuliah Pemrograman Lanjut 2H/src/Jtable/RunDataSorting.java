package Jtable;

import javax.swing.*;

public class RunDataSorting {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                UnsupportedLookAndFeelException ignored) {
        }
        //set image icon
        ImageIcon imageIcon = new ImageIcon("res/icon.png");
        JFrame jFrame = new JFrame("Form Sorting");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new DataSorting().getPanel1());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1000, 800);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
