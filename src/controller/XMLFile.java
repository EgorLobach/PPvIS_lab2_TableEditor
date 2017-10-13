package controller;

import model.Student;
import model.StudentDataBase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * Created by anonymous on 25.04.2017.
 */
public class XMLFile {
    private String fileName;
    private StudentController studentController;
    private StudentDataBase studentDataBase;

    public XMLFile(String fileName, StudentController studentController) {
        this.fileName = fileName;
        this.studentController = studentController;
        studentDataBase = studentController.getStudentDataBase();
    }

    public void writeFile() throws IOException, TransformerException, ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element rootElement = document.createElement(XMLConst.STUDENTS);
        document.appendChild(rootElement);


        for (int index = 0; index < studentDataBase.size(); index++) {
            Student student = studentDataBase.get(index);
            Element studentElement = document.createElement(XMLConst.STUDENT);
            rootElement.appendChild(studentElement);


            String element = studentDataBase.get(index).getSurName();
            studentElement.setAttribute(XMLConst.SURNAME, element);
            element = student.getFirstName();
            studentElement.setAttribute(XMLConst.FIRSTNAME, element);
            element = student.getSecondName();
            studentElement.setAttribute(XMLConst.SECONDNAME, element);
            element = student.getAddress().getCountry();
            studentElement.setAttribute(XMLConst.COUNTRY, element);
            element = student.getAddress().getRegion();
            studentElement.setAttribute(XMLConst.REGION, element);
            element = student.getAddress().getCity();
            studentElement.setAttribute(XMLConst.CITY, element);
            element = student.getAddress().getStreet();
            studentElement.setAttribute(XMLConst.STREET, element);
            element = String.valueOf(student.getAddress().getHouse());
            studentElement.setAttribute(XMLConst.HOUSE, element);
            element = String.valueOf(student.getAddress().getHousing());
            studentElement.setAttribute(XMLConst.HOUSING, element);
            element = String.valueOf(student.getAddress().getApartment());
            studentElement.setAttribute(XMLConst.APARTMENT, element);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            Properties outFormat = new Properties();
            outFormat.setProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperties(outFormat);
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
        }
    }

    public void readFile() {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            StudentFromFileHandler studentFromFileHandler = new StudentFromFileHandler(studentController);
            saxParser.parse(new File(fileName), studentFromFileHandler);


            StudentDataBase studentDataBase = studentFromFileHandler.getStudentDataBase();
            studentController.changeData(studentDataBase);
        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }
}
