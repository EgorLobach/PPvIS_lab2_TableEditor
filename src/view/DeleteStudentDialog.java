package view;

import controller.StudentController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 30.03.2017.
 */
public class DeleteStudentDialog {
    private JDialog deleteStudentDialog = new JDialog();
    private StudentController controller;
    private MainFrame mainFrame;
    private SearchAndDeleteTabbedPanel deleteTabbedPane = new SearchAndDeleteTabbedPanel();
    private JButton deleteStudentButton = new JButton("Удалить");

    public DeleteStudentDialog(StudentController controller, MainFrame mainFrame)
    {

        this.controller=controller;
        this.mainFrame=mainFrame;
        deleteStudentDialog.setTitle("Удалить");
        deleteStudentDialog.setSize(700,600);
        deleteStudentDialog.setLocationRelativeTo(null);
        deleteStudentDialog.setLayout(new GridBagLayout());
        deleteStudentDialog.setResizable(false);
        deleteStudentDialog.setLayout(new BorderLayout());
        deleteStudentButton.setFont(new Font("", Font.ITALIC,17));
        deleteStudentDialog.setModal(true);


    }
    public void initDeleteStudentDialog()
    {
        deleteStudentButton.addActionListener(new DeleteStudentButtonActionListener(controller));
        deleteStudentDialog.getContentPane().add(deleteTabbedPane.initSearchAndDeletePanel());
        deleteStudentDialog.getContentPane().add(deleteStudentButton, BorderLayout.SOUTH);
        deleteStudentDialog.pack();
        deleteStudentDialog.setVisible(true);
    }
    private class DeleteStudentButtonActionListener implements ActionListener {

        private final StudentController controller;

        private DeleteStudentButtonActionListener(StudentController controller) {
            this.controller = controller;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int index = deleteTabbedPane.getSelectedIndex();
            switch (index)
            {
                case 0:
                    if(deleteTabbedPane.getSurname1().isEmpty()||deleteTabbedPane.getHouse().isEmpty())
                    {
                        JOptionPane.showMessageDialog(deleteStudentDialog, "Некоторые поля пустые",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        try
                        {
                        int countDeleteStudent = controller.deleteByHouseNumberAndLastName(deleteTabbedPane.getSurname1(),
                                Integer.parseInt(deleteTabbedPane.getHouse()));

                        mainFrame.updateMainFrame();

                        JOptionPane.showMessageDialog(deleteStudentDialog, "Удалено записей "+ countDeleteStudent,
                                "Удалено", JOptionPane.INFORMATION_MESSAGE);

                        deleteStudentDialog.dispose();
                        }
                        catch (NumberFormatException exception)
                        {
                            JOptionPane.showMessageDialog(deleteStudentDialog, "Несоответствие данных",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 1:
                    if(deleteTabbedPane.getStreet().isEmpty()||deleteTabbedPane.getApartment().isEmpty())
                    {
                        JOptionPane.showMessageDialog(deleteStudentDialog, "Некоторые поля пустые",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        try
                        {
                            int countDeleteStudent = controller.deleteByStreetAndApartment(deleteTabbedPane.getStreet(),
                                    Integer.parseInt(deleteTabbedPane.getApartment()));

                            mainFrame.updateMainFrame();

                            JOptionPane.showMessageDialog(deleteStudentDialog, "Удалено записей "+ countDeleteStudent,
                                    "Удалено", JOptionPane.INFORMATION_MESSAGE);

                            deleteStudentDialog.dispose();
                        }
                        catch (NumberFormatException exception)
                        {
                            JOptionPane.showMessageDialog(deleteStudentDialog, "Несоответствие данных",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 2:
                    if(deleteTabbedPane.getSurname2().isEmpty()||deleteTabbedPane.getNumbersInHouse().isEmpty())
                    {
                        JOptionPane.showMessageDialog(deleteStudentDialog, "Некоторые поля пустые",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        try
                        {
                            int countDeleteStudent = controller.deleteByNameAndNumbersFoundInTheRoomNumber(deleteTabbedPane.getSurname2(),
                                    Integer.parseInt(deleteTabbedPane.getNumbersInHouse()));

                            mainFrame.updateMainFrame();

                            JOptionPane.showMessageDialog(deleteStudentDialog, "Удалено записей "+ countDeleteStudent,
                                    "Удалено", JOptionPane.INFORMATION_MESSAGE);

                            deleteStudentDialog.dispose();
                        }
                        catch (NumberFormatException exception)
                        {
                            JOptionPane.showMessageDialog(deleteStudentDialog, "Несоответствие данных",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
            }

        }
    }
}
