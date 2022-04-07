package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.NONE)
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	@XmlAttribute
	private String guid;
	@XmlElement
	private String title;
	@XmlElement
	private String published;


	public Item(String guid, String title, String published) {
	super();
	this.guid = guid;
	this.title = title;
	this.published = published;
	}
    public Item() {}
      
	@Override
	public String toString() {
	  return ("Article : " + title + "\n(" + guid + ") Le = " + published );
	}
}