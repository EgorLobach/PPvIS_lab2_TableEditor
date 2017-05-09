package view;

import controller.StudentController;
import model.Student;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 29.03.2017.
 */
public class AddStudentDialog {
    private JDialog addStudentDialog = new JDialog();

    private StudentController controller;
    private MainFrame mainFrame;

    private JLabel surNameLabel = new JLabel("Фамилия");
    private JLabel firstNameLabel = new JLabel("Имя");
    private JLabel secondNameLabel = new JLabel("Отчество");
    private JLabel countryLabel = new JLabel("Страна");
    private JLabel regionLabel = new JLabel("Область");
    private JLabel cityLabel = new JLabel("Город");
    private JLabel streetLabel = new JLabel("Улица");
    private JLabel houseLabel = new JLabel("Дом");
    private JLabel housingLabel = new JLabel("Корпус");
    private JLabel apartmentLabel = new JLabel("Квартира");

    private JTextField surNameTextField = new JTextField(20);
    private JTextField firstNameTextField = new JTextField(20);
    private JTextField secondNameTextField = new JTextField(20);
    private JTextField countryTextField = new JTextField(20);
    private JTextField regionTextField = new JTextField(20);
    private JTextField cityTextField = new JTextField(20);
    private JTextField streetTextField = new JTextField(20);
    private JTextField houseTextField = new JTextField(20);
    private JTextField housingTextField = new JTextField(20);
    private JTextField apartmentTextField = new JTextField(20);

    private JButton addStudentButton = new JButton("Добавить");


    public AddStudentDialog(StudentController controller, MainFrame mainFrame) {
        this.controller = controller;
        this.mainFrame = mainFrame;
        addStudentDialog.setTitle("Добавить");
        addStudentDialog.setSize(700, 600);
        addStudentDialog.setLocationRelativeTo(null);
        addStudentDialog.setLayout(new GridBagLayout());
        addStudentDialog.setResizable(false);
        addStudentDialog.setModal(true);

        surNameTextField.setFont(new Font("", Font.ITALIC, 17));
        firstNameTextField.setFont(new Font("", Font.ITALIC, 17));
        secondNameTextField.setFont(new Font("", Font.ITALIC, 17));
        countryTextField.setFont(new Font("", Font.ITALIC, 17));
        regionTextField.setFont(new Font("", Font.ITALIC, 17));
        cityTextField.setFont(new Font("", Font.ITALIC, 17));
        streetTextField.setFont(new Font("", Font.ITALIC, 17));
        houseTextField.setFont(new Font("", Font.ITALIC, 17));
        housingTextField.setFont(new Font("", Font.ITALIC, 17));
        apartmentTextField.setFont(new Font("", Font.ITALIC, 17));

        surNameLabel.setFont(new Font("", Font.ITALIC, 17));
        firstNameLabel.setFont(new Font("", Font.ITALIC, 17));
        secondNameLabel.setFont(new Font("", Font.ITALIC, 17));
        countryLabel.setFont(new Font("", Font.ITALIC, 17));
        regionLabel.setFont(new Font("", Font.ITALIC, 17));
        cityLabel.setFont(new Font("", Font.ITALIC, 17));
        streetLabel.setFont(new Font("", Font.ITALIC, 17));
        houseLabel.setFont(new Font("", Font.ITALIC, 17));
        housingLabel.setFont(new Font("", Font.ITALIC, 17));
        apartmentLabel.setFont(new Font("", Font.ITALIC, 17));

        addStudentButton.setFont(new Font("", Font.ITALIC, 17));

        surNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        secondNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        countryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        regionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
        streetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        houseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        housingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        apartmentLabel.setHorizontalAlignment(SwingConstants.CENTER);


    }

    public void initAddStudentDialog() {
        addStudentButton.addActionListener(new AddStudentButtonActionListener(controller));
        addStudentDialog.add(surNameLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(firstNameLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(secondNameLabel, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(countryLabel, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(regionLabel, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(cityLabel, new GridBagConstraints(0, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(streetLabel, new GridBagConstraints(0, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(houseLabel, new GridBagConstraints(0, 7, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(housingLabel, new GridBagConstraints(0, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(apartmentLabel, new GridBagConstraints(0, 9, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        addStudentDialog.add(surNameTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(firstNameTextField, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(secondNameTextField, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(countryTextField, new GridBagConstraints(1, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(regionTextField, new GridBagConstraints(1, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(cityTextField, new GridBagConstraints(1, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(streetTextField, new GridBagConstraints(1, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(houseTextField, new GridBagConstraints(1, 7, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(housingTextField, new GridBagConstraints(1, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(apartmentTextField, new GridBagConstraints(1, 9, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        addStudentDialog.add(addStudentButton, new GridBagConstraints(0, 10, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));


        addStudentDialog.pack();
        addStudentDialog.setVisible(true);

    }

    private class AddStudentButtonActionListener implements ActionListener {

        private final StudentController controller;

        private AddStudentButtonActionListener(StudentController controller) {
            this.controller = controller;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (surNameTextField.getText().isEmpty() || firstNameTextField.getText().isEmpty() ||
                    secondNameTextField.getText().isEmpty() || countryTextField.getText().isEmpty() || regionTextField.getText().isEmpty() ||
                    cityTextField.getText().isEmpty() || streetTextField.getText().isEmpty() || houseTextField.getText().isEmpty() ||
                    housingTextField.getText().isEmpty() || apartmentTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(addStudentDialog, "Некоторые поля пустые",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    controller.addStudent(new Student(surNameTextField.getText(), firstNameTextField.getText(),
                            secondNameTextField.getText(), countryTextField.getText(), regionTextField.getText(),
                            cityTextField.getText(), streetTextField.getText(), Integer.parseInt(houseTextField.getText()),
                            Integer.parseInt(housingTextField.getText()), Integer.parseInt(apartmentTextField.getText())));

                    mainFrame.updateMainFrame();

                    JOptionPane.showMessageDialog(addStudentDialog, "Запись успешно добавлена",
                            "Добавлено", JOptionPane.INFORMATION_MESSAGE);

                    addStudentDialog.dispose();
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(addStudentDialog, "Несоответствие данных",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        }

    }
}
