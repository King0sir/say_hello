package com.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kinakihiro on 2017/2/6.
 */
@XmlRootElement
public class Region {

    private String Name;

    private String Code;

    @XmlAttribute
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @XmlAttribute
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    @Override
    public String toString() {
        return "Region{" +
                "Name='" + Name + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
