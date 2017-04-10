package controller;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anonymous on 30.03.2017.
 */
public class DeleteStudentDialog {
    private JDialog deleteStudentDialog = new JDialog();
    private JTabbedPane deleteTabbedPane = new JTabbedPane();

    private JPanel deleteByHouseNumberAndLastNamePanel = new JPanel();
    private JPanel deleteByStreetAndApartmentPanel = new JPanel();
    private JPanel deleteByNameAndNumbersFoundInTheRoomNumberPanel = new JPanel();

    private JLabel surnameLabel = new JLabel("Фамилия");
    private JLabel surname2Label = new JLabel("Фамилия");
    private JLabel streetLabel = new JLabel("Улица");
    private JLabel numbersInHouseLabel = new JLabel("Цифры в номере дома");
    private JLabel houseLabel = new JLabel("Дом");
    private JLabel apartmentLabel = new JLabel("Квартира");

    private JTextField surnameTextField = new JTextField(20);
    private JTextField surname2TextField = new JTextField(20);
    private JTextField streetTextField = new JTextField(20);
    private JTextField numbersInHouseTextField = new JTextField(20);
    private JTextField houseTextField = new JTextField(20);
    private JTextField apartmentTextField = new JTextField(20);

    private JButton deleteStudent1Button = new JButton("Удалить");
    private JButton deleteStudent2Button = new JButton("Удалить");
    private JButton deleteStudent3Button = new JButton("Удалить");

    public DeleteStudentDialog()
    {

        deleteStudentDialog.setTitle("Удалить");
        deleteStudentDialog.setSize(700,600);
        deleteStudentDialog.setLocationRelativeTo(null);
        deleteStudentDialog.setLayout(new GridBagLayout());
        deleteStudentDialog.setResizable(false);
        deleteByHouseNumberAndLastNamePanel.setLayout(new GridBagLayout());
        deleteByStreetAndApartmentPanel.setLayout(new GridBagLayout());
        deleteByNameAndNumbersFoundInTheRoomNumberPanel.setLayout(new GridBagLayout());
        deleteTabbedPane.setFont(new Font("", Font.ITALIC,17));

        surnameTextField.setFont(new Font("", Font.ITALIC,17));
        surname2TextField.setFont(new Font("", Font.ITALIC,17));
        streetTextField.setFont(new Font("", Font.ITALIC,17));
        numbersInHouseTextField.setFont(new Font("", Font.ITALIC,17));
        houseTextField.setFont(new Font("", Font.ITALIC,17));
        apartmentTextField.setFont(new Font("", Font.ITALIC,17));

        surnameLabel.setFont(new Font("", Font.ITALIC,17));
        surname2Label.setFont(new Font("", Font.ITALIC,17));
        streetLabel.setFont(new Font("", Font.ITALIC,17));
        numbersInHouseLabel.setFont(new Font("", Font.ITALIC,17));
        houseLabel.setFont(new Font("", Font.ITALIC,17));
        apartmentLabel.setFont(new Font("", Font.ITALIC,17));

        deleteStudent1Button.setFont(new Font("", Font.ITALIC,17));
        deleteStudent2Button.setFont(new Font("", Font.ITALIC,17));
        deleteStudent3Button.setFont(new Font("", Font.ITALIC,17));

        surnameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        surname2Label.setHorizontalAlignment(SwingConstants.CENTER);
        streetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numbersInHouseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        houseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        apartmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
    public void initDeleteStudentDialog()
    {
        deleteStudentDialog.getContentPane().add(deleteTabbedPane);

        deleteByHouseNumberAndLastNamePanel.add(surnameLabel, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByHouseNumberAndLastNamePanel.add(surnameTextField, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByHouseNumberAndLastNamePanel.add(houseLabel, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByHouseNumberAndLastNamePanel.add(houseTextField, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByHouseNumberAndLastNamePanel.add(deleteStudent1Button, new GridBagConstraints(0, 2, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        deleteByStreetAndApartmentPanel.add(streetLabel, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByStreetAndApartmentPanel.add(streetTextField, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByStreetAndApartmentPanel.add(apartmentLabel, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByStreetAndApartmentPanel.add(apartmentTextField, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByStreetAndApartmentPanel.add(deleteStudent2Button, new GridBagConstraints(0, 2, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        deleteByNameAndNumbersFoundInTheRoomNumberPanel.add(surname2Label, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByNameAndNumbersFoundInTheRoomNumberPanel.add(surname2TextField, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByNameAndNumbersFoundInTheRoomNumberPanel.add(numbersInHouseLabel, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByNameAndNumbersFoundInTheRoomNumberPanel.add(numbersInHouseTextField, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        deleteByNameAndNumbersFoundInTheRoomNumberPanel.add(deleteStudent3Button, new GridBagConstraints(0, 2, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        deleteTabbedPane.add("По номеру дома и фамилии", deleteByHouseNumberAndLastNamePanel);
        deleteTabbedPane.add("По улице и квартире", deleteByStreetAndApartmentPanel);
        deleteTabbedPane.add("По фамилии и цифрам встречающемся в номере дома", deleteByNameAndNumbersFoundInTheRoomNumberPanel);

        deleteStudentDialog.setVisible(true);
        deleteStudentDialog.pack();
    }
}
