
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
    "wrapperType",
    "collectionType",
    "artistId",
    "collectionId",
    "amgArtistId",
    "artistName",
    "collectionName",
    "collectionCensoredName",
    "artistViewUrl",
    "collectionViewUrl",
    "artworkUrl60",
    "artworkUrl100",
    "collectionPrice",
    "collectionExplicitness",
    "trackCount",
    "copyright",
    "country",
    "currency",
    "releaseDate",
    "primaryGenreName",
    "contentAdvisoryRating"
})
public class Result implements Serializable
{

    @JsonProperty("wrapperType")
    private String wrapperType;
    @JsonProperty("collectionType")
    private String collectionType;
    @JsonProperty("artistId")
    private Integer artistId;
    @JsonProperty("collectionId")
    private Integer collectionId;
    @JsonProperty("amgArtistId")
    private Integer amgArtistId;
    @JsonProperty("artistName")
    private String artistName;
    @JsonProperty("collectionName")
    private String collectionName;
    @JsonProperty("collectionCensoredName")
    private String collectionCensoredName;
    @JsonProperty("artistViewUrl")
    private String artistViewUrl;
    @JsonProperty("collectionViewUrl")
    private String collectionViewUrl;
    @JsonProperty("artworkUrl60")
    private String artworkUrl60;
    @JsonProperty("artworkUrl100")
    private String artworkUrl100;
    @JsonProperty("collectionPrice")
    private BigDecimal collectionPrice;
    @JsonProperty("collectionExplicitness")
    private String collectionExplicitness;
    @JsonProperty("trackCount")
    private Integer trackCount;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("country")
    private String country;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("releaseDate")
    private String releaseDate;
    @JsonProperty("primaryGenreName")
    private String primaryGenreName;
    @JsonProperty("contentAdvisoryRating")
    private String contentAdvisoryRating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 979506102000615497L;

    @JsonProperty("wrapperType")
    public String getWrapperType() {
        return wrapperType;
    }

    @JsonProperty("wrapperType")
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    @JsonProperty("collectionType")
    public String getCollectionType() {
        return collectionType;
    }

    @JsonProperty("collectionType")
    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    @JsonProperty("artistId")
    public Integer getArtistId() {
        return artistId;
    }

    @JsonProperty("artistId")
    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @JsonProperty("collectionId")
    public Integer getCollectionId() {
        return collectionId;
    }

    @JsonProperty("collectionId")
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    @JsonProperty("amgArtistId")
    public Integer getAmgArtistId() {
        return amgArtistId;
    }

    @JsonProperty("amgArtistId")
    public void setAmgArtistId(Integer amgArtistId) {
        this.amgArtistId = amgArtistId;
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty("artistName")
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @JsonProperty("collectionName")
    public String getCollectionName() {
        return collectionName;
    }

    @JsonProperty("collectionName")
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    @JsonProperty("collectionCensoredName")
    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    @JsonProperty("collectionCensoredName")
    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    @JsonProperty("artistViewUrl")
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    @JsonProperty("artistViewUrl")
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    @JsonProperty("collectionViewUrl")
    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    @JsonProperty("collectionViewUrl")
    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    @JsonProperty("artworkUrl60")
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    @JsonProperty("artworkUrl60")
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    @JsonProperty("artworkUrl100")
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    @JsonProperty("artworkUrl100")
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    @JsonProperty("collectionPrice")
    public BigDecimal getCollectionPrice() {
        return collectionPrice;
    }

    @JsonProperty("collectionPrice")
    public void setCollectionPrice(BigDecimal collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    @JsonProperty("collectionExplicitness")
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    @JsonProperty("collectionExplicitness")
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    @JsonProperty("trackCount")
    public Integer getTrackCount() {
        return trackCount;
    }

    @JsonProperty("trackCount")
    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("primaryGenreName")
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    @JsonProperty("primaryGenreName")
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    @JsonProperty("contentAdvisoryRating")
    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    @JsonProperty("contentAdvisoryRating")
    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
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
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wrapperType");
        sb.append('=');
        sb.append(((this.wrapperType == null)?"<null>":this.wrapperType));
        sb.append(',');
        sb.append("collectionType");
        sb.append('=');
        sb.append(((this.collectionType == null)?"<null>":this.collectionType));
        sb.append(',');
        sb.append("artistId");
        sb.append('=');
        sb.append(((this.artistId == null)?"<null>":this.artistId));
        sb.append(',');
        sb.append("collectionId");
        sb.append('=');
        sb.append(((this.collectionId == null)?"<null>":this.collectionId));
        sb.append(',');
        sb.append("amgArtistId");
        sb.append('=');
        sb.append(((this.amgArtistId == null)?"<null>":this.amgArtistId));
        sb.append(',');
        sb.append("artistName");
        sb.append('=');
        sb.append(((this.artistName == null)?"<null>":this.artistName));
        sb.append(',');
        sb.append("collectionName");
        sb.append('=');
        sb.append(((this.collectionName == null)?"<null>":this.collectionName));
        sb.append(',');
        sb.append("collectionCensoredName");
        sb.append('=');
        sb.append(((this.collectionCensoredName == null)?"<null>":this.collectionCensoredName));
        sb.append(',');
        sb.append("artistViewUrl");
        sb.append('=');
        sb.append(((this.artistViewUrl == null)?"<null>":this.artistViewUrl));
        sb.append(',');
        sb.append("collectionViewUrl");
        sb.append('=');
        sb.append(((this.collectionViewUrl == null)?"<null>":this.collectionViewUrl));
        sb.append(',');
        sb.append("artworkUrl60");
        sb.append('=');
        sb.append(((this.artworkUrl60 == null)?"<null>":this.artworkUrl60));
        sb.append(',');
        sb.append("artworkUrl100");
        sb.append('=');
        sb.append(((this.artworkUrl100 == null)?"<null>":this.artworkUrl100));
        sb.append(',');
        sb.append("collectionPrice");
        sb.append('=');
        sb.append(((this.collectionPrice == null)?"<null>":this.collectionPrice));
        sb.append(',');
        sb.append("collectionExplicitness");
        sb.append('=');
        sb.append(((this.collectionExplicitness == null)?"<null>":this.collectionExplicitness));
        sb.append(',');
        sb.append("trackCount");
        sb.append('=');
        sb.append(((this.trackCount == null)?"<null>":this.trackCount));
        sb.append(',');
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null)?"<null>":this.copyright));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("primaryGenreName");
        sb.append('=');
        sb.append(((this.primaryGenreName == null)?"<null>":this.primaryGenreName));
        sb.append(',');
        sb.append("contentAdvisoryRating");
        sb.append('=');
        sb.append(((this.contentAdvisoryRating == null)?"<null>":this.contentAdvisoryRating));
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
        result = ((result* 31)+((this.artworkUrl100 == null)? 0 :this.artworkUrl100 .hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.copyright == null)? 0 :this.copyright.hashCode()));
        result = ((result* 31)+((this.collectionViewUrl == null)? 0 :this.collectionViewUrl.hashCode()));
        result = ((result* 31)+((this.contentAdvisoryRating == null)? 0 :this.contentAdvisoryRating.hashCode()));
        result = ((result* 31)+((this.amgArtistId == null)? 0 :this.amgArtistId.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.artistId == null)? 0 :this.artistId.hashCode()));
        result = ((result* 31)+((this.collectionPrice == null)? 0 :this.collectionPrice.hashCode()));
        result = ((result* 31)+((this.primaryGenreName == null)? 0 :this.primaryGenreName.hashCode()));
        result = ((result* 31)+((this.collectionName == null)? 0 :this.collectionName.hashCode()));
        result = ((result* 31)+((this.artistViewUrl == null)? 0 :this.artistViewUrl.hashCode()));
        result = ((result* 31)+((this.collectionType == null)? 0 :this.collectionType.hashCode()));
        result = ((result* 31)+((this.collectionExplicitness == null)? 0 :this.collectionExplicitness.hashCode()));
        result = ((result* 31)+((this.trackCount == null)? 0 :this.trackCount.hashCode()));
        result = ((result* 31)+((this.artworkUrl60 == null)? 0 :this.artworkUrl60 .hashCode()));
        result = ((result* 31)+((this.wrapperType == null)? 0 :this.wrapperType.hashCode()));
        result = ((result* 31)+((this.artistName == null)? 0 :this.artistName.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collectionId == null)? 0 :this.collectionId.hashCode()));
        result = ((result* 31)+((this.collectionCensoredName == null)? 0 :this.collectionCensoredName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return (((((((((((((((((((((((this.artworkUrl100 == rhs.artworkUrl100)||((this.artworkUrl100 != null)&&this.artworkUrl100 .equals(rhs.artworkUrl100)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this.collectionViewUrl == rhs.collectionViewUrl)||((this.collectionViewUrl!= null)&&this.collectionViewUrl.equals(rhs.collectionViewUrl))))&&((this.contentAdvisoryRating == rhs.contentAdvisoryRating)||((this.contentAdvisoryRating!= null)&&this.contentAdvisoryRating.equals(rhs.contentAdvisoryRating))))&&((this.amgArtistId == rhs.amgArtistId)||((this.amgArtistId!= null)&&this.amgArtistId.equals(rhs.amgArtistId))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.artistId == rhs.artistId)||((this.artistId!= null)&&this.artistId.equals(rhs.artistId))))&&((this.collectionPrice == rhs.collectionPrice)||((this.collectionPrice!= null)&&this.collectionPrice.equals(rhs.collectionPrice))))&&((this.primaryGenreName == rhs.primaryGenreName)||((this.primaryGenreName!= null)&&this.primaryGenreName.equals(rhs.primaryGenreName))))&&((this.collectionName == rhs.collectionName)||((this.collectionName!= null)&&this.collectionName.equals(rhs.collectionName))))&&((this.artistViewUrl == rhs.artistViewUrl)||((this.artistViewUrl!= null)&&this.artistViewUrl.equals(rhs.artistViewUrl))))&&((this.collectionType == rhs.collectionType)||((this.collectionType!= null)&&this.collectionType.equals(rhs.collectionType))))&&((this.collectionExplicitness == rhs.collectionExplicitness)||((this.collectionExplicitness!= null)&&this.collectionExplicitness.equals(rhs.collectionExplicitness))))&&((this.trackCount == rhs.trackCount)||((this.trackCount!= null)&&this.trackCount.equals(rhs.trackCount))))&&((this.artworkUrl60 == rhs.artworkUrl60)||((this.artworkUrl60 != null)&&this.artworkUrl60 .equals(rhs.artworkUrl60))))&&((this.wrapperType == rhs.wrapperType)||((this.wrapperType!= null)&&this.wrapperType.equals(rhs.wrapperType))))&&((this.artistName == rhs.artistName)||((this.artistName!= null)&&this.artistName.equals(rhs.artistName))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collectionId == rhs.collectionId)||((this.collectionId!= null)&&this.collectionId.equals(rhs.collectionId))))&&((this.collectionCensoredName == rhs.collectionCensoredName)||((this.collectionCensoredName!= null)&&this.collectionCensoredName.equals(rhs.collectionCensoredName))));
    }

}
