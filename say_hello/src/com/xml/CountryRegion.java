package com.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by kinakihiro on 2017/2/6.
 */
@XmlRootElement
public class CountryRegion {

    private String Name;

    private String Code;

    private List<State> State;

    @XmlElement
    public List<com.xml.State> getState() {
        return State;
    }

    public void setState(List<com.xml.State> state) {
        State = state;
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
