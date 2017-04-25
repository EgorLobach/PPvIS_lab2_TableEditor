package view;

import controller.StudentController;
import controller.XMLFile;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 25.04.2017.
 */
public class OpenFileListener implements ActionListener {
    private StudentController studentController;
    private JFileChooser fileChooser;
    private MainFrame mainFrame;

    public OpenFileListener(StudentController studentController, MainFrame mainFrame) {
        this.studentController=studentController;
        this.mainFrame=mainFrame;
        fileChooser = new JFileChooser("D:\\work\\java\\PPvIS_sem2\\PPvIS_lab2_TableEditor\\file");
        fileChooser.setMultiSelectionEnabled(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "XML Формат", "xml");
        fileChooser.setFileFilter(filter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Загрузить файл");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            new XMLFile(fileChooser.getSelectedFile().getPath(), studentController).readFile();
            mainFrame.updateMainFrame();
        }

    }
}
