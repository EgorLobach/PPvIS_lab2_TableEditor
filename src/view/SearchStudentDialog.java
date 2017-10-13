package view;

import controller.StudentController;
import model.StudentDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 29.03.2017.
 */
class SearchStudentDialog {
    private JDialog searchStudentDialog = new JDialog();
    private StudentController controller;
    private MainFrame mainFrame;
    private SearchAndDeleteTabbedPanel searchTabbedPane = new SearchAndDeleteTabbedPanel();
    private JButton searchButton = new JButton("Найти");
    private StudentDataBase searchStudentDataBase = new StudentDataBase();
    private TableOfStudents tableOfStudents;


    SearchStudentDialog(StudentController controller, MainFrame mainFrame) {
        this.controller = controller;
        this.mainFrame = mainFrame;
        searchStudentDialog.setModalityType(Dialog.DEFAULT_MODALITY_TYPE);
        searchStudentDialog.setTitle("Найти");
        searchStudentDialog.setSize(700, 600);
        searchStudentDialog.setLocationRelativeTo(null);
        searchStudentDialog.setLayout(new GridBagLayout());
        searchStudentDialog.setResizable(false);
        searchStudentDialog.setLayout(new BorderLayout());
        searchButton.setFont(new Font("", Font.ITALIC, 17));
        tableOfStudents = new TableOfStudents(searchStudentDataBase);
        tableOfStudents.setPreferredSize(new Dimension(700, 400));


    }

    void initSearchStudentDialog() {
        searchStudentDialog.add(tableOfStudents.initTableOfStudents(), BorderLayout.SOUTH);
        searchButton.addActionListener(new SearchStudentButtonActionListener(controller));
        searchStudentDialog.getContentPane().add(searchTabbedPane.initSearchAndDeletePanel(), BorderLayout.NORTH);
        searchStudentDialog.getContentPane().add(searchButton, BorderLayout.CENTER);

        searchStudentDialog.pack();
        searchStudentDialog.setVisible(true);
    }


    private class SearchStudentButtonActionListener implements ActionListener {
        private final StudentController controller;

        SearchStudentButtonActionListener(StudentController controller) {
            this.controller = controller;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int index = searchTabbedPane.getSelectedIndex();
            boolean error = false;
            switch (index) {
                case SearchAndDeleteTabbedPanel.PANEL_ONE:
                    if (searchTabbedPane.getSurname1().isEmpty() || searchTabbedPane.getHouse().isEmpty()) {
                        JOptionPane.showMessageDialog(searchStudentDialog, "Некоторые поля пустые",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        error = true;
                    } else
                        try {
                            searchStudentDataBase = controller.searchByHouseNumberAndLastName(searchTabbedPane.getSurname1(),
                                    Integer.parseInt(searchTabbedPane.getHouse()));
                        } catch (NumberFormatException exception) {
                            JOptionPane.showMessageDialog(searchStudentDialog, "Несоответствие данных",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            error = true;
                        }
                    break;
                case SearchAndDeleteTabbedPanel.PANEL_TWO:
                    if (searchTabbedPane.getStreet().isEmpty() || searchTabbedPane.getApartment().isEmpty()) {
                        JOptionPane.showMessageDialog(searchStudentDialog, "Некоторые поля пустые",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        error = true;
                    } else {
                        try {
                            searchStudentDataBase = controller.searchByStreetAndApartment(searchTabbedPane.getStreet(),
                                    Integer.parseInt(searchTabbedPane.getApartment()));
                        } catch (NumberFormatException exception) {
                            JOptionPane.showMessageDialog(searchStudentDialog, "Несоответствие данных",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            error = true;
                        }
                    }
                    break;
                case SearchAndDeleteTabbedPanel.PANEL_THREE:
                    if (searchTabbedPane.getSurname2().isEmpty() || searchTabbedPane.getNumbersInHouse().isEmpty()) {
                        JOptionPane.showMessageDialog(searchStudentDialog, "Некоторые поля пустые",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        error = true;
                    } else {
                        try {
                            searchStudentDataBase = controller.searchByNameAndNumbersFoundInTheRoomNumber(searchTabbedPane.getSurname2(),
                                    Integer.parseInt(searchTabbedPane.getNumbersInHouse()));

                        } catch (NumberFormatException exception) {
                            JOptionPane.showMessageDialog(searchStudentDialog, "Несоответствие данных",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            error = true;
                        }
                    }
                    break;
            }
            if (error) {
            } else if (searchStudentDataBase.size() == 0) {
                JOptionPane.showMessageDialog(searchStudentDialog, "Записей не найдено",
                        "Результат", JOptionPane.INFORMATION_MESSAGE);
                searchStudentDialog.dispose();
            } else {
                tableOfStudents.reloadTableOfStudent(searchStudentDataBase);
                tableOfStudents.updateUI();
            }

        }
    }
}
