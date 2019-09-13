
package com.luxoft.exam.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country",
    "saleability",
    "isEbook",
    "listPrice",
    "retailPrice",
    "buyLink",
    "offers"
})
public class SaleInfo implements Serializable
{

    @JsonProperty("country")
    private String country;
    @JsonProperty("saleability")
    private String saleability;
    @JsonProperty("isEbook")
    private Boolean isEbook;
    @JsonProperty("listPrice")
    private ListPrice listPrice;
    @JsonProperty("retailPrice")
    private RetailPrice retailPrice;
    @JsonProperty("buyLink")
    private String buyLink;
    @JsonProperty("offers")
    private List<Offer> offers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6014664755520635294L;

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("saleability")
    public String getSaleability() {
        return saleability;
    }

    @JsonProperty("saleability")
    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    @JsonProperty("isEbook")
    public Boolean getIsEbook() {
        return isEbook;
    }

    @JsonProperty("isEbook")
    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    @JsonProperty("listPrice")
    public ListPrice getListPrice() {
        return listPrice;
    }

    @JsonProperty("listPrice")
    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("retailPrice")
    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    @JsonProperty("retailPrice")
    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    @JsonProperty("buyLink")
    public String getBuyLink() {
        return buyLink;
    }

    @JsonProperty("buyLink")
    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    @JsonProperty("offers")
    public List<Offer> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SaleInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("saleability");
        sb.append('=');
        sb.append(((this.saleability == null)?"<null>":this.saleability));
        sb.append(',');
        sb.append("isEbook");
        sb.append('=');
        sb.append(((this.isEbook == null)?"<null>":this.isEbook));
        sb.append(',');
        sb.append("listPrice");
        sb.append('=');
        sb.append(((this.listPrice == null)?"<null>":this.listPrice));
        sb.append(',');
        sb.append("retailPrice");
        sb.append('=');
        sb.append(((this.retailPrice == null)?"<null>":this.retailPrice));
        sb.append(',');
        sb.append("buyLink");
        sb.append('=');
        sb.append(((this.buyLink == null)?"<null>":this.buyLink));
        sb.append(',');
        sb.append("offers");
        sb.append('=');
        sb.append(((this.offers == null)?"<null>":this.offers));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.offers == null)? 0 :this.offers.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.isEbook == null)? 0 :this.isEbook.hashCode()));
        result = ((result* 31)+((this.saleability == null)? 0 :this.saleability.hashCode()));
        result = ((result* 31)+((this.buyLink == null)? 0 :this.buyLink.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.retailPrice == null)? 0 :this.retailPrice.hashCode()));
        result = ((result* 31)+((this.listPrice == null)? 0 :this.listPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SaleInfo) == false) {
            return false;
        }
        SaleInfo rhs = ((SaleInfo) other);
        return (((((((((this.offers == rhs.offers)||((this.offers!= null)&&this.offers.equals(rhs.offers)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.isEbook == rhs.isEbook)||((this.isEbook!= null)&&this.isEbook.equals(rhs.isEbook))))&&((this.saleability == rhs.saleability)||((this.saleability!= null)&&this.saleability.equals(rhs.saleability))))&&((this.buyLink == rhs.buyLink)||((this.buyLink!= null)&&this.buyLink.equals(rhs.buyLink))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.retailPrice == rhs.retailPrice)||((this.retailPrice!= null)&&this.retailPrice.equals(rhs.retailPrice))))&&((this.listPrice == rhs.listPrice)||((this.listPrice!= null)&&this.listPrice.equals(rhs.listPrice))));
    }

}
