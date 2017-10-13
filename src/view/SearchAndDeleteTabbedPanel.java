package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anonymous on 11.04.2017.
 */
public class SearchAndDeleteTabbedPanel {

    static final int PANEL_ONE = 0;
    static final int PANEL_TWO = 1;
    static final int PANEL_THREE = 2;

    private JTabbedPane searchAndDeleteTabbedPanel = new JTabbedPane();

    private JPanel byHouseNumberAndLastNamePanel = new JPanel();
    private JPanel byStreetAndApartmentPanel = new JPanel();
    private JPanel byNameAndNumbersFoundInTheRoomNumberPanel = new JPanel();

    private JLabel surname1Label = new JLabel("Фамилия");
    private JLabel surname2Label = new JLabel("Фамилия");
    private JLabel streetLabel = new JLabel("Улица");
    private JLabel numbersInHouseLabel = new JLabel("Цифры в номере дома");
    private JLabel houseLabel = new JLabel("Дом");
    private JLabel apartmentLabel = new JLabel("Квартира");

    private JTextField surname1TextField = new JTextField(20);
    private JTextField surname2TextField = new JTextField(20);
    private JTextField streetTextField = new JTextField(20);
    private JTextField numbersInHouseTextField = new JTextField(20);
    private JTextField houseTextField = new JTextField(20);
    private JTextField apartmentTextField = new JTextField(20);


    int getSelectedIndex() {
        return searchAndDeleteTabbedPanel.getSelectedIndex();
    }

    String getSurname1() {
        return surname1TextField.getText();
    }

    String getSurname2() {
        return surname2TextField.getText();
    }

    public String getStreet() {
        return streetTextField.getText();
    }

    String getNumbersInHouse() {
        return numbersInHouseTextField.getText();
    }

    public String getHouse() {
        return houseTextField.getText();
    }

    public String getApartment() {
        return apartmentTextField.getText();
    }

    SearchAndDeleteTabbedPanel() {

        byHouseNumberAndLastNamePanel.setLayout(new GridBagLayout());
        byStreetAndApartmentPanel.setLayout(new GridBagLayout());
        byNameAndNumbersFoundInTheRoomNumberPanel.setLayout(new GridBagLayout());
        searchAndDeleteTabbedPanel.setFont(new Font("", Font.ITALIC, 17));

        surname1TextField.setFont(new Font("", Font.ITALIC, 17));
        surname2TextField.setFont(new Font("", Font.ITALIC, 17));
        streetTextField.setFont(new Font("", Font.ITALIC, 17));
        numbersInHouseTextField.setFont(new Font("", Font.ITALIC, 17));
        houseTextField.setFont(new Font("", Font.ITALIC, 17));
        apartmentTextField.setFont(new Font("", Font.ITALIC, 17));

        surname1Label.setFont(new Font("", Font.ITALIC, 17));
        surname2Label.setFont(new Font("", Font.ITALIC, 17));
        streetLabel.setFont(new Font("", Font.ITALIC, 17));
        numbersInHouseLabel.setFont(new Font("", Font.ITALIC, 17));
        houseLabel.setFont(new Font("", Font.ITALIC, 17));
        apartmentLabel.setFont(new Font("", Font.ITALIC, 17));


        surname1Label.setHorizontalAlignment(SwingConstants.CENTER);
        surname2Label.setHorizontalAlignment(SwingConstants.CENTER);
        streetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numbersInHouseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        houseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        apartmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }

    JTabbedPane initSearchAndDeletePanel() {

        byHouseNumberAndLastNamePanel.add(surname1Label, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byHouseNumberAndLastNamePanel.add(surname1TextField, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byHouseNumberAndLastNamePanel.add(houseLabel, new GridBagConstraints(2, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byHouseNumberAndLastNamePanel.add(houseTextField, new GridBagConstraints(3, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));


        byStreetAndApartmentPanel.add(streetLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byStreetAndApartmentPanel.add(streetTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byStreetAndApartmentPanel.add(apartmentLabel, new GridBagConstraints(2, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byStreetAndApartmentPanel.add(apartmentTextField, new GridBagConstraints(3, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));


        byNameAndNumbersFoundInTheRoomNumberPanel.add(surname2Label, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byNameAndNumbersFoundInTheRoomNumberPanel.add(surname2TextField, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byNameAndNumbersFoundInTheRoomNumberPanel.add(numbersInHouseLabel, new GridBagConstraints(2, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        byNameAndNumbersFoundInTheRoomNumberPanel.add(numbersInHouseTextField, new GridBagConstraints(3, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));


        searchAndDeleteTabbedPanel.add("По номеру дома и фамилии", byHouseNumberAndLastNamePanel);
        searchAndDeleteTabbedPanel.add("По улице и квартире", byStreetAndApartmentPanel);
        searchAndDeleteTabbedPanel.add("По фамилии и цифрам встречающемся в номере дома", byNameAndNumbersFoundInTheRoomNumberPanel);

        return searchAndDeleteTabbedPanel;
    }
}
