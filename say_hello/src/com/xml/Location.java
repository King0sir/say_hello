package com.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by kinakihiro on 2017/2/6.
 */
@XmlRootElement
public class Location {

    private List<CountryRegion> CountryRegion;

    @XmlElement
    public List<com.xml.CountryRegion> getCountryRegion() {
        return CountryRegion;
    }

    public void setCountryRegion(List<com.xml.CountryRegion> countryRegion) {
        CountryRegion = countryRegion;
    }
}
