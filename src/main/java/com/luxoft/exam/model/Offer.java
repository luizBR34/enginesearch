
package com.luxoft.exam.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "finskyOfferType",
    "listPrice",
    "retailPrice",
    "giftable"
})
public class Offer implements Serializable
{

    @JsonProperty("finskyOfferType")
    private Integer finskyOfferType;
    @JsonProperty("listPrice")
    private ListPrice__1 listPrice;
    @JsonProperty("retailPrice")
    private RetailPrice__1 retailPrice;
    @JsonProperty("giftable")
    private Boolean giftable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1812631700101146887L;

    @JsonProperty("finskyOfferType")
    public Integer getFinskyOfferType() {
        return finskyOfferType;
    }

    @JsonProperty("finskyOfferType")
    public void setFinskyOfferType(Integer finskyOfferType) {
        this.finskyOfferType = finskyOfferType;
    }

    @JsonProperty("listPrice")
    public ListPrice__1 getListPrice() {
        return listPrice;
    }

    @JsonProperty("listPrice")
    public void setListPrice(ListPrice__1 listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("retailPrice")
    public RetailPrice__1 getRetailPrice() {
        return retailPrice;
    }

    @JsonProperty("retailPrice")
    public void setRetailPrice(RetailPrice__1 retailPrice) {
        this.retailPrice = retailPrice;
    }

    @JsonProperty("giftable")
    public Boolean getGiftable() {
        return giftable;
    }

    @JsonProperty("giftable")
    public void setGiftable(Boolean giftable) {
        this.giftable = giftable;
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
        sb.append(Offer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finskyOfferType");
        sb.append('=');
        sb.append(((this.finskyOfferType == null)?"<null>":this.finskyOfferType));
        sb.append(',');
        sb.append("listPrice");
        sb.append('=');
        sb.append(((this.listPrice == null)?"<null>":this.listPrice));
        sb.append(',');
        sb.append("retailPrice");
        sb.append('=');
        sb.append(((this.retailPrice == null)?"<null>":this.retailPrice));
        sb.append(',');
        sb.append("giftable");
        sb.append('=');
        sb.append(((this.giftable == null)?"<null>":this.giftable));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.finskyOfferType == null)? 0 :this.finskyOfferType.hashCode()));
        result = ((result* 31)+((this.retailPrice == null)? 0 :this.retailPrice.hashCode()));
        result = ((result* 31)+((this.listPrice == null)? 0 :this.listPrice.hashCode()));
        result = ((result* 31)+((this.giftable == null)? 0 :this.giftable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Offer) == false) {
            return false;
        }
        Offer rhs = ((Offer) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.finskyOfferType == rhs.finskyOfferType)||((this.finskyOfferType!= null)&&this.finskyOfferType.equals(rhs.finskyOfferType))))&&((this.retailPrice == rhs.retailPrice)||((this.retailPrice!= null)&&this.retailPrice.equals(rhs.retailPrice))))&&((this.listPrice == rhs.listPrice)||((this.listPrice!= null)&&this.listPrice.equals(rhs.listPrice))))&&((this.giftable == rhs.giftable)||((this.giftable!= null)&&this.giftable.equals(rhs.giftable))));
    }

}
