package view;

import controller.ExitActionListener;

import javax.swing.*;

/**
 * Created by anonymous on 10.04.2017.
 */
public class MenuBar {
    private JMenu searchMenu = new JMenu("Найти");
    private JMenuItem searchByHouseNumberAndLastName = new JMenuItem("По номеру дома и фамилии");
    private JMenuItem searchByStreetAndApartment = new JMenuItem("По улице и квартире");
    private JMenuItem searchByNameAndNumbersFoundInTheRoomNumber = new JMenuItem("По фамилии и цифрам встречающемся в номере дома");
    private JMenu deleteMenu = new JMenu("Удалить");
    private JMenuItem deleteByHouseNumberAndLastName = new JMenuItem("По номеру дома и фамилии");
    private JMenuItem deleteByStreetAndApartment = new JMenuItem("По улице и квартире");
    private JMenuItem deleteByNameAndNumbersFoundInTheRoomNumber = new JMenuItem("По фамилии и цифрам встречающемся в номере дома");
    private JMenu exitMenu = new JMenu("Выход");
    private JMenuItem exitMenuItem = new JMenuItem("Выход");
    private JMenu fileMenu = new JMenu("Файл");
    private JMenuItem openMenuItem = new JMenuItem("Открыть");
    private JMenuItem addStudentMenuItem = new JMenuItem("Добавить");
    private JMenuItem saveMenuItem = new JMenuItem("Сохранить");
    private JMenuBar headMenuBar=new JMenuBar();

    public JMenuBar initMenuBar()
    {
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(addStudentMenuItem);

        searchMenu.add(searchByHouseNumberAndLastName);
        searchMenu.add(searchByStreetAndApartment);
        searchMenu.add(searchByNameAndNumbersFoundInTheRoomNumber);

        deleteMenu.add(deleteByHouseNumberAndLastName);
        deleteMenu.add(deleteByStreetAndApartment);
        deleteMenu.add(deleteByNameAndNumbersFoundInTheRoomNumber);

        exitMenuItem.addActionListener(new ExitActionListener());
        exitMenu.add(exitMenuItem);

        headMenuBar.add(fileMenu);
        headMenuBar.add(searchMenu);
        headMenuBar.add(deleteMenu);
        headMenuBar.add(exitMenu);

        return headMenuBar;
    }


}
