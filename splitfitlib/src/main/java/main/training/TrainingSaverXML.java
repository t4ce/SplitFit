package main.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Created by jonas on 20/05/2015.
 */
public class TrainingSaverXML implements ITrainingSaver {

    private void saveTrainingToXML(ITraining training) {
        try {
            writeUsingDOM(training);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String writeUsingDOM(ITraining training) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        // create root: <record>
        Element root = doc.createElement("RootElement");
        doc.appendChild(root);

        /*
        // create: <study>
        Element tagStudy = doc.createElement(Study.STUDY);
        root.appendChild(tagStudy);
        // add attr: id =
        tagStudy.setAttribute(Study.ID, String.valueOf(study.mId));
        */

        // create: <topic>
        Element tagTopic = doc.createElement("TopicElement");
        root.appendChild(tagTopic);
        tagTopic.setTextContent("TopicContent");

        // create Transformer object
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(new DOMSource(doc), result);

        // return XML string
        return writer.toString();
    }


    @Override
    public void save(ITraining training) {
        saveTrainingToXML(training);
    }
}
