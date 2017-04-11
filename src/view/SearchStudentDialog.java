package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anonymous on 29.03.2017.
 */
public class SearchStudentDialog {
    private JDialog searchStudentDialog = new JDialog();
    private SearchAndDeleteTabbedPanel searchTabbedPane = new SearchAndDeleteTabbedPanel();
    private JButton searchButton = new JButton("Найти");



    public SearchStudentDialog()
    {

        searchStudentDialog.setTitle("Найти");
        searchStudentDialog.setSize(700,600);
        searchStudentDialog.setLocationRelativeTo(null);
        searchStudentDialog.setLayout(new GridBagLayout());
        searchStudentDialog.setResizable(false);
        searchStudentDialog.setLayout(new BorderLayout());
        searchButton.setFont(new Font("", Font.ITALIC,17));


    }
    public void initSearchStudentDialog()
    {
        searchStudentDialog.getContentPane().add(searchTabbedPane.initSearchAndDeletePanel());
        searchStudentDialog.getContentPane().add(searchButton, BorderLayout.SOUTH);

        searchStudentDialog.setVisible(true);
        searchStudentDialog.pack();
    }

}
