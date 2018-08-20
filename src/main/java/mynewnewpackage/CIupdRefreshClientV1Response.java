
package mynewnewpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="nbsapdpo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="version" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="serviceVersion" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="echoKey" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nbsmsgo3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="version" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sysErrTxt" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="700"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nbrUserMsgs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="nbrUserErrs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="msgEntry" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="msgClass" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="msgCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="msgErrInd" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="msgTxt" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="300"/>
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
 *         &lt;element name="cip042o" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rcode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="clientCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="message" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
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
    "nbsapdpo",
    "nbsmsgo3",
    "cip042O"
})
@XmlRootElement(name = "CIupdRefreshClientV1Response", namespace = "http://CI.absa.co.za/CIupdRefreshClientV1/schema")
public class CIupdRefreshClientV1Response {

    protected CIupdRefreshClientV1Response.Nbsapdpo nbsapdpo;
    protected CIupdRefreshClientV1Response.Nbsmsgo3 nbsmsgo3;
    @XmlElement(name = "cip042o")
    protected CIupdRefreshClientV1Response.Cip042O cip042O;

    /**
     * Gets the value of the nbsapdpo property.
     * 
     * @return
     *     possible object is
     *     {@link CIupdRefreshClientV1Response.Nbsapdpo }
     *     
     */
    public CIupdRefreshClientV1Response.Nbsapdpo getNbsapdpo() {
        return nbsapdpo;
    }

    /**
     * Sets the value of the nbsapdpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIupdRefreshClientV1Response.Nbsapdpo }
     *     
     */
    public void setNbsapdpo(CIupdRefreshClientV1Response.Nbsapdpo value) {
        this.nbsapdpo = value;
    }

    /**
     * Gets the value of the nbsmsgo3 property.
     * 
     * @return
     *     possible object is
     *     {@link CIupdRefreshClientV1Response.Nbsmsgo3 }
     *     
     */
    public CIupdRefreshClientV1Response.Nbsmsgo3 getNbsmsgo3() {
        return nbsmsgo3;
    }

    /**
     * Sets the value of the nbsmsgo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIupdRefreshClientV1Response.Nbsmsgo3 }
     *     
     */
    public void setNbsmsgo3(CIupdRefreshClientV1Response.Nbsmsgo3 value) {
        this.nbsmsgo3 = value;
    }

    /**
     * Gets the value of the cip042O property.
     * 
     * @return
     *     possible object is
     *     {@link CIupdRefreshClientV1Response.Cip042O }
     *     
     */
    public CIupdRefreshClientV1Response.Cip042O getCip042O() {
        return cip042O;
    }

    /**
     * Sets the value of the cip042O property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIupdRefreshClientV1Response.Cip042O }
     *     
     */
    public void setCip042O(CIupdRefreshClientV1Response.Cip042O value) {
        this.cip042O = value;
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
     *         &lt;element name="rcode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="clientCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="message" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
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
        "rcode",
        "clientCode",
        "message"
    })
    public static class Cip042O {

        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger rcode;
        protected String clientCode;
        protected String message;

        /**
         * Gets the value of the rcode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRcode() {
            return rcode;
        }

        /**
         * Sets the value of the rcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRcode(BigInteger value) {
            this.rcode = value;
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
         * Gets the value of the message property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Sets the value of the message property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
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
     *         &lt;element name="version" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="7"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="serviceVersion" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="7"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="echoKey" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
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
        "version",
        "returnCode",
        "reasonCode",
        "serviceVersion",
        "echoKey"
    })
    public static class Nbsapdpo {

        protected String version;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger returnCode;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger reasonCode;
        protected String serviceVersion;
        protected String echoKey;

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the returnCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReturnCode() {
            return returnCode;
        }

        /**
         * Sets the value of the returnCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReturnCode(BigInteger value) {
            this.returnCode = value;
        }

        /**
         * Gets the value of the reasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReasonCode() {
            return reasonCode;
        }

        /**
         * Sets the value of the reasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReasonCode(BigInteger value) {
            this.reasonCode = value;
        }

        /**
         * Gets the value of the serviceVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceVersion() {
            return serviceVersion;
        }

        /**
         * Sets the value of the serviceVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceVersion(String value) {
            this.serviceVersion = value;
        }

        /**
         * Gets the value of the echoKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEchoKey() {
            return echoKey;
        }

        /**
         * Sets the value of the echoKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEchoKey(String value) {
            this.echoKey = value;
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
     *         &lt;element name="version" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="7"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sysErrTxt" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="700"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nbrUserMsgs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="nbrUserErrs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="msgEntry" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="msgClass" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="msgCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="msgErrInd" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="msgTxt" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="300"/>
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
        "version",
        "sysErrTxt",
        "nbrUserMsgs",
        "nbrUserErrs",
        "msgEntry"
    })
    public static class Nbsmsgo3 {

        protected String version;
        protected String sysErrTxt;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nbrUserMsgs;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nbrUserErrs;
        protected List<CIupdRefreshClientV1Response.Nbsmsgo3 .MsgEntry> msgEntry;

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the sysErrTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSysErrTxt() {
            return sysErrTxt;
        }

        /**
         * Sets the value of the sysErrTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSysErrTxt(String value) {
            this.sysErrTxt = value;
        }

        /**
         * Gets the value of the nbrUserMsgs property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNbrUserMsgs() {
            return nbrUserMsgs;
        }

        /**
         * Sets the value of the nbrUserMsgs property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNbrUserMsgs(BigInteger value) {
            this.nbrUserMsgs = value;
        }

        /**
         * Gets the value of the nbrUserErrs property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNbrUserErrs() {
            return nbrUserErrs;
        }

        /**
         * Sets the value of the nbrUserErrs property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNbrUserErrs(BigInteger value) {
            this.nbrUserErrs = value;
        }

        /**
         * Gets the value of the msgEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the msgEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMsgEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CIupdRefreshClientV1Response.Nbsmsgo3 .MsgEntry }
         * 
         * 
         */
        public List<CIupdRefreshClientV1Response.Nbsmsgo3 .MsgEntry> getMsgEntry() {
            if (msgEntry == null) {
                msgEntry = new ArrayList<CIupdRefreshClientV1Response.Nbsmsgo3 .MsgEntry>();
            }
            return this.msgEntry;
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
         *         &lt;element name="msgClass" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="msgCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="msgErrInd" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="msgTxt" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="300"/>
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
            "msgClass",
            "msgCode",
            "msgErrInd",
            "msgTxt"
        })
        public static class MsgEntry {

            protected String msgClass;
            protected String msgCode;
            protected String msgErrInd;
            protected String msgTxt;

            /**
             * Gets the value of the msgClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsgClass() {
                return msgClass;
            }

            /**
             * Sets the value of the msgClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsgClass(String value) {
                this.msgClass = value;
            }

            /**
             * Gets the value of the msgCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsgCode() {
                return msgCode;
            }

            /**
             * Sets the value of the msgCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsgCode(String value) {
                this.msgCode = value;
            }

            /**
             * Gets the value of the msgErrInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsgErrInd() {
                return msgErrInd;
            }

            /**
             * Sets the value of the msgErrInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsgErrInd(String value) {
                this.msgErrInd = value;
            }

            /**
             * Gets the value of the msgTxt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsgTxt() {
                return msgTxt;
            }

            /**
             * Sets the value of the msgTxt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsgTxt(String value) {
                this.msgTxt = value;
            }

        }

    }

}
