
package com.luxoft.exam.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
    "amountInMicros",
    "currencyCode"
})
public class ListPrice__1 implements Serializable
{

    @JsonProperty("amountInMicros")
    private BigDecimal amountInMicros;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5227147275580886982L;

    @JsonProperty("amountInMicros")
    public BigDecimal getAmountInMicros() {
        return amountInMicros;
    }

    @JsonProperty("amountInMicros")
    public void setAmountInMicros(BigDecimal amountInMicros) {
        this.amountInMicros = amountInMicros;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
        sb.append(ListPrice__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amountInMicros");
        sb.append('=');
        sb.append(((this.amountInMicros == null)?"<null>":this.amountInMicros));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
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
        result = ((result* 31)+((this.amountInMicros == null)? 0 :this.amountInMicros.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListPrice__1) == false) {
            return false;
        }
        ListPrice__1 rhs = ((ListPrice__1) other);
        return ((((this.amountInMicros == rhs.amountInMicros)||((this.amountInMicros!= null)&&this.amountInMicros.equals(rhs.amountInMicros)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode))));
    }

}
