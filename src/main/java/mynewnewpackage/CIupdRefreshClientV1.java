
package mynewnewpackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nbsapdpi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="channel">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="application">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="trace">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nbsmsgi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="msgLanguage">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="msgTarget">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="finalMsgId" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="finalMsgClass" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="finalMsgCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cip042i">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tellerEmpolyee">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="clientCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                   &lt;element name="idNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="13"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="confirmId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="confirmAddress">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addrLine1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addrLine2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addrSuburb">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addrTown">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addrPostalCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="addrCountry">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nbsapdpi",
    "nbsmsgi",
    "cip042I"
})
@XmlRootElement(name = "CIupdRefreshClientV1", namespace = "http://CI.absa.co.za/CIupdRefreshClientV1/schema")
public class CIupdRefreshClientV1 {

    @XmlElement(required = true)
    protected CIupdRefreshClientV1 .Nbsapdpi nbsapdpi;
    @XmlElement(required = true)
    protected CIupdRefreshClientV1 .Nbsmsgi nbsmsgi;
    @XmlElement(name = "cip042i", required = true)
    protected CIupdRefreshClientV1 .Cip042I cip042I;

    /**
     * Gets the value of the nbsapdpi property.
     * 
     * @return
     *     possible object is
     *     {@link CIupdRefreshClientV1 .Nbsapdpi }
     *     
     */
    public CIupdRefreshClientV1 .Nbsapdpi getNbsapdpi() {
        return nbsapdpi;
    }

    /**
     * Sets the value of the nbsapdpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIupdRefreshClientV1 .Nbsapdpi }
     *     
     */
    public void setNbsapdpi(CIupdRefreshClientV1 .Nbsapdpi value) {
        this.nbsapdpi = value;
    }

    /**
     * Gets the value of the nbsmsgi property.
     * 
     * @return
     *     possible object is
     *     {@link CIupdRefreshClientV1 .Nbsmsgi }
     *     
     */
    public CIupdRefreshClientV1 .Nbsmsgi getNbsmsgi() {
        return nbsmsgi;
    }

    /**
     * Sets the value of the nbsmsgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIupdRefreshClientV1 .Nbsmsgi }
     *     
     */
    public void setNbsmsgi(CIupdRefreshClientV1 .Nbsmsgi value) {
        this.nbsmsgi = value;
    }

    /**
     * Gets the value of the cip042I property.
     * 
     * @return
     *     possible object is
     *     {@link CIupdRefreshClientV1 .Cip042I }
     *     
     */
    public CIupdRefreshClientV1 .Cip042I getCip042I() {
        return cip042I;
    }

    /**
     * Sets the value of the cip042I property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIupdRefreshClientV1 .Cip042I }
     *     
     */
    public void setCip042I(CIupdRefreshClientV1 .Cip042I value) {
        this.cip042I = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tellerEmpolyee">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="7"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="clientCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *         &lt;element name="idNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="13"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="confirmId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="confirmAddress">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="addrLine1">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="addrLine2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="addrSuburb">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="addrTown">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="addrPostalCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="addrCountry">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tellerEmpolyee",
        "branch",
        "clientCode",
        "idType",
        "idNumber",
        "confirmId",
        "confirmAddress",
        "addrLine1",
        "addrLine2",
        "addrSuburb",
        "addrTown",
        "addrPostalCode",
        "addrCountry"
    })
    public static class Cip042I {

        @XmlElement(required = true)
        protected String tellerEmpolyee;
        @XmlElement(required = true)
        protected BigInteger branch;
        @XmlElement(required = true)
        protected String clientCode;
        @XmlElement(required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger idType;
        @XmlElement(required = true)
        protected String idNumber;
        @XmlElement(required = true)
        protected String confirmId;
        @XmlElement(required = true)
        protected String confirmAddress;
        @XmlElement(required = true)
        protected String addrLine1;
        protected String addrLine2;
        @XmlElement(required = true)
        protected String addrSuburb;
        @XmlElement(required = true)
        protected String addrTown;
        @XmlElement(required = true)
        protected BigInteger addrPostalCode;
        @XmlElement(required = true)
        protected String addrCountry;

        /**
         * Gets the value of the tellerEmpolyee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTellerEmpolyee() {
            return tellerEmpolyee;
        }

        /**
         * Sets the value of the tellerEmpolyee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTellerEmpolyee(String value) {
            this.tellerEmpolyee = value;
        }

        /**
         * Gets the value of the branch property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBranch() {
            return branch;
        }

        /**
         * Sets the value of the branch property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBranch(BigInteger value) {
            this.branch = value;
        }

        /**
         * Gets the value of the clientCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientCode() {
            return clientCode;
        }

        /**
         * Sets the value of the clientCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientCode(String value) {
            this.clientCode = value;
        }

        /**
         * Gets the value of the idType property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIdType() {
            return idType;
        }

        /**
         * Sets the value of the idType property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdType(BigInteger value) {
            this.idType = value;
        }

        /**
         * Gets the value of the idNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdNumber() {
            return idNumber;
        }

        /**
         * Sets the value of the idNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdNumber(String value) {
            this.idNumber = value;
        }

        /**
         * Gets the value of the confirmId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfirmId() {
            return confirmId;
        }

        /**
         * Sets the value of the confirmId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfirmId(String value) {
            this.confirmId = value;
        }

        /**
         * Gets the value of the confirmAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfirmAddress() {
            return confirmAddress;
        }

        /**
         * Sets the value of the confirmAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfirmAddress(String value) {
            this.confirmAddress = value;
        }

        /**
         * Gets the value of the addrLine1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddrLine1() {
            return addrLine1;
        }

        /**
         * Sets the value of the addrLine1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddrLine1(String value) {
            this.addrLine1 = value;
        }

        /**
         * Gets the value of the addrLine2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddrLine2() {
            return addrLine2;
        }

        /**
         * Sets the value of the addrLine2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddrLine2(String value) {
            this.addrLine2 = value;
        }

        /**
         * Gets the value of the addrSuburb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddrSuburb() {
            return addrSuburb;
        }

        /**
         * Sets the value of the addrSuburb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddrSuburb(String value) {
            this.addrSuburb = value;
        }

        /**
         * Gets the value of the addrTown property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddrTown() {
            return addrTown;
        }

        /**
         * Sets the value of the addrTown property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddrTown(String value) {
            this.addrTown = value;
        }

        /**
         * Gets the value of the addrPostalCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAddrPostalCode() {
            return addrPostalCode;
        }

        /**
         * Sets the value of the addrPostalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAddrPostalCode(BigInteger value) {
            this.addrPostalCode = value;
        }

        /**
         * Gets the value of the addrCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddrCountry() {
            return addrCountry;
        }

        /**
         * Sets the value of the addrCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddrCountry(String value) {
            this.addrCountry = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="channel">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="application">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="trace">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "channel",
        "application",
        "trace"
    })
    public static class Nbsapdpi {

        @XmlElement(required = true)
        protected String channel;
        @XmlElement(required = true)
        protected String application;
        @XmlElement(required = true)
        protected String trace;

        /**
         * Gets the value of the channel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannel(String value) {
            this.channel = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }

        /**
         * Gets the value of the trace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrace() {
            return trace;
        }

        /**
         * Sets the value of the trace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrace(String value) {
            this.trace = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="msgLanguage">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="msgTarget">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="finalMsgId" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="finalMsgClass" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="finalMsgCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "msgLanguage",
        "msgTarget",
        "finalMsgId"
    })
    public static class Nbsmsgi {

        @XmlElement(required = true)
        protected String msgLanguage;
        @XmlElement(required = true)
        protected String msgTarget;
        protected CIupdRefreshClientV1 .Nbsmsgi.FinalMsgId finalMsgId;

        /**
         * Gets the value of the msgLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgLanguage() {
            return msgLanguage;
        }

        /**
         * Sets the value of the msgLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgLanguage(String value) {
            this.msgLanguage = value;
        }

        /**
         * Gets the value of the msgTarget property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgTarget() {
            return msgTarget;
        }

        /**
         * Sets the value of the msgTarget property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgTarget(String value) {
            this.msgTarget = value;
        }

        /**
         * Gets the value of the finalMsgId property.
         * 
         * @return
         *     possible object is
         *     {@link CIupdRefreshClientV1 .Nbsmsgi.FinalMsgId }
         *     
         */
        public CIupdRefreshClientV1 .Nbsmsgi.FinalMsgId getFinalMsgId() {
            return finalMsgId;
        }

        /**
         * Sets the value of the finalMsgId property.
         * 
         * @param value
         *     allowed object is
         *     {@link CIupdRefreshClientV1 .Nbsmsgi.FinalMsgId }
         *     
         */
        public void setFinalMsgId(CIupdRefreshClientV1 .Nbsmsgi.FinalMsgId value) {
            this.finalMsgId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="finalMsgClass" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="finalMsgCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "finalMsgClass",
            "finalMsgCode"
        })
        public static class FinalMsgId {

            protected String finalMsgClass;
            protected String finalMsgCode;

            /**
             * Gets the value of the finalMsgClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinalMsgClass() {
                return finalMsgClass;
            }

            /**
             * Sets the value of the finalMsgClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinalMsgClass(String value) {
                this.finalMsgClass = value;
            }

            /**
             * Gets the value of the finalMsgCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinalMsgCode() {
                return finalMsgCode;
            }

            /**
             * Sets the value of the finalMsgCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinalMsgCode(String value) {
                this.finalMsgCode = value;
            }

        }

    }

}
