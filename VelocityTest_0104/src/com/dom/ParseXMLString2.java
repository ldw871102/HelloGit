package com.dom;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
  
public class ParseXMLString2 {
	public static void main(String arg[]) {  
    String xmlRecords =  
    	"<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
	    +"	<orderQuery>"
	    +"		<status>SUCCESS</status>"
	    +"		<charset>UTF-8</charset>"
	    +"		<result>"
	    +"		    <outTradeNo>20150626145645100044</outTradeNo>"
	    +"		    <subject>20150626145645100044</subject>"
	    +"		    <tradeNo>201506261457089108</tradeNo>"
	    +"		    <tradeStatus>TRADE_FINISHED</tradeStatus>"
	    +"		    <totalFee>0.1</totalFee>"
	    +"	    </result>"
	    +"	    <sign>18bd352253414fbdfdfa67e852b28420</sign>"
	    +"	</orderQuery>";

      try {  
          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
          DocumentBuilder db = dbf.newDocumentBuilder();  
          InputSource is = new InputSource();  
          is.setCharacterStream(new StringReader(xmlRecords));  
  
          Document doc = db.parse(is);  
          NodeList nodes = doc.getElementsByTagName("result");  
  
          // iterate the employees  
          for (int i = 0; i < nodes.getLength(); i++) {  
             Element element = (Element) nodes.item(i);  
  
             NodeList name = element.getElementsByTagName("outTradeNo");  
             Element line = (Element) name.item(0);  
             System.out.println("outTradeNo: " + getCharacterDataFromElement(line));  
  
             NodeList title = element.getElementsByTagName("totalFee");  
             line = (Element) title.item(0);  
             System.out.println("totalFee: " + getCharacterDataFromElement(line));  
          }  
      } catch (Exception e) {  
          e.printStackTrace();  
      }  
      /* 
      output : 
          Name: John 
          Title: Manager 
          Name: Sara 
          Title: Clerk 
      */      
    }  
  
    public static String getCharacterDataFromElement(Element e) {  
      Node child = e.getFirstChild();  
      if (child instanceof CharacterData) {  
         CharacterData cd = (CharacterData) child;  
         return cd.getData();  
      }  
      return "?";  
    }  
}  