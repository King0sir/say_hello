package com.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by kinakihiro on 2017/2/6.
 */
@XmlRootElement
public class City {

    private String Name;

    private String Code;

    private List<Region> Region;

    @XmlElement
    public List<com.xml.Region> getRegion() {
        return Region;
    }

    public void setRegion(List<com.xml.Region> region) {
        Region = region;
    }

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
