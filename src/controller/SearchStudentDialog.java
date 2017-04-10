package controller;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anonymous on 29.03.2017.
 */
public class SearchStudentDialog {
    private JDialog searchStudentDialog = new JDialog();
    private JTabbedPane searchTabbedPane = new JTabbedPane();

    private JPanel searchByHouseNumberAndLastNamePanel = new JPanel();
    private JPanel searchByStreetAndApartmentPanel = new JPanel();
    private JPanel searchByNameAndNumbersFoundInTheRoomNumberPanel = new JPanel();

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

    private JButton searchStudent1Button = new JButton("Найти");
    private JButton searchStudent2Button = new JButton("Найти");
    private JButton searchStudent3Button = new JButton("Найти");

    public SearchStudentDialog()
    {

        searchStudentDialog.setTitle("Найти");
        searchStudentDialog.setSize(700,600);
        searchStudentDialog.setLocationRelativeTo(null);
        searchStudentDialog.setLayout(new GridBagLayout());
        searchStudentDialog.setResizable(false);
        searchByHouseNumberAndLastNamePanel.setLayout(new GridBagLayout());
        searchByStreetAndApartmentPanel.setLayout(new GridBagLayout());
        searchByNameAndNumbersFoundInTheRoomNumberPanel.setLayout(new GridBagLayout());
        searchTabbedPane.setFont(new Font("", Font.ITALIC,17));

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

        searchStudent1Button.setFont(new Font("", Font.ITALIC,17));
        searchStudent2Button.setFont(new Font("", Font.ITALIC,17));
        searchStudent3Button.setFont(new Font("", Font.ITALIC,17));

        surnameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        surname2Label.setHorizontalAlignment(SwingConstants.CENTER);
        streetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numbersInHouseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        houseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        apartmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
    public void initSearchStudentDialog()
    {
        searchStudentDialog.getContentPane().add(searchTabbedPane);

        searchByHouseNumberAndLastNamePanel.add(surnameLabel, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByHouseNumberAndLastNamePanel.add(surnameTextField, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByHouseNumberAndLastNamePanel.add(houseLabel, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByHouseNumberAndLastNamePanel.add(houseTextField, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByHouseNumberAndLastNamePanel.add(searchStudent1Button, new GridBagConstraints(0, 2, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        searchByStreetAndApartmentPanel.add(streetLabel, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByStreetAndApartmentPanel.add(streetTextField, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByStreetAndApartmentPanel.add(apartmentLabel, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByStreetAndApartmentPanel.add(apartmentTextField, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByStreetAndApartmentPanel.add(searchStudent2Button, new GridBagConstraints(0, 2, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        searchByNameAndNumbersFoundInTheRoomNumberPanel.add(surname2Label, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByNameAndNumbersFoundInTheRoomNumberPanel.add(surname2TextField, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByNameAndNumbersFoundInTheRoomNumberPanel.add(numbersInHouseLabel, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByNameAndNumbersFoundInTheRoomNumberPanel.add(numbersInHouseTextField, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        searchByNameAndNumbersFoundInTheRoomNumberPanel.add(searchStudent3Button, new GridBagConstraints(0, 2, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        searchTabbedPane.add("По номеру дома и фамилии", searchByHouseNumberAndLastNamePanel);
        searchTabbedPane.add("По улице и квартире", searchByStreetAndApartmentPanel);
        searchTabbedPane.add("По фамилии и цифрам встречающемся в номере дома", searchByNameAndNumbersFoundInTheRoomNumberPanel);

        searchStudentDialog.setVisible(true);
        searchStudentDialog.pack();
    }

}
