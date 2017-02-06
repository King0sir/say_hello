package com.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by kinakihiro on 2017/2/6.
 */
@XmlRootElement
public class State {

    private String Name;

    private String Code;

    private List<City> City;

    @XmlElement
    public List<com.xml.City> getCity() {
        return City;
    }

    public void setCity(List<com.xml.City> city) {
        City = city;
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
}
