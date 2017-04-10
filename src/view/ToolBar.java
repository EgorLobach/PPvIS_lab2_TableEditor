package view;


import controller.AddStudentDialog;
import controller.DeleteStudentDialog;
import controller.ExitActionListener;
import controller.SearchStudentDialog;

import javax.swing.*;

/**
 * Created by anonymous on 28.03.2017.
 */
public class ToolBar {
    private JToolBar toolBar = new JToolBar(SwingConstants.HORIZONTAL);

    private JButton openButton = new JButton(new ImageIcon("resources/png/24x24/Folder.png"));
    private JButton addButton = new JButton(new ImageIcon("resources/png/24x24/Add.png"));
    private JButton saveButton = new JButton(new ImageIcon("resources/png/24x24/Save.png"));
    private JButton searchButton = new JButton(new ImageIcon("resources/png/24x24/View.png"));
    private JButton deleteButton = new JButton(new ImageIcon("resources/png/24x24/Delete.png"));
    private JButton exitButton = new JButton(new ImageIcon("resources/png/24x24/Exit.png"));

    public JToolBar initToolBar()
    {
        openButton.setSize(24,24);
        addButton.setSize(24,24);
        saveButton.setSize(24,24);
        searchButton.setSize(24,24);
        deleteButton.setSize(24,24);
        exitButton.setSize(24,24);


        exitButton.addActionListener(new ExitActionListener());
        addButton.addActionListener(e -> {
            AddStudentDialog addStudentDialog = new AddStudentDialog();
            addStudentDialog.initAddStudentDialog();} );
        searchButton.addActionListener(e -> {
            SearchStudentDialog searchStudentDialog = new SearchStudentDialog();
            searchStudentDialog.initSearchStudentDialog();
        });
        deleteButton.addActionListener(e -> {
            DeleteStudentDialog deleteStudentDialog = new DeleteStudentDialog();
            deleteStudentDialog.initDeleteStudentDialog();
        });

        toolBar.add(openButton);
        toolBar.add(saveButton);
        toolBar.add(addButton);
        toolBar.add(searchButton);
        toolBar.add(deleteButton);
        toolBar.add(exitButton);

        return toolBar;
    }
}
