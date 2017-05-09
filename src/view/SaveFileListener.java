package view;

import controller.StudentController;
import controller.XMLFile;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by anonymous on 25.04.2017.
 */
public class SaveFileListener implements ActionListener {
    private JFileChooser fileChooser;
    private StudentController studentController;
    private MainFrame mainFrame;

    public SaveFileListener(StudentController studentController, MainFrame mainFrame) {
        fileChooser = new JFileChooser("D:\\work\\java\\PPvIS_sem2\\PPvIS_lab2_TableEditor\\file");
        this.mainFrame = mainFrame;
        this.studentController = studentController;
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "XML Формат", "xml");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Сохранить файл");
    }

    public void actionPerformed(ActionEvent e) {
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                new XMLFile(fileChooser.getSelectedFile().getPath(), studentController).writeFile();
            } catch (IOException exception) {
                exception.printStackTrace();
            } catch (TransformerException exception) {
                exception.printStackTrace();
            } catch (ParserConfigurationException exception) {
                exception.printStackTrace();
            }
            mainFrame.updateMainFrame();
        }
    }
}
