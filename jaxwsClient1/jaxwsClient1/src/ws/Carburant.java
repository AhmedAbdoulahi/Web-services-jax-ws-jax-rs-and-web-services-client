/**
 * Carburant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Carburant  implements java.io.Serializable {
    private java.lang.String description;

    private ws.HistoCarb[] histo;

    private java.lang.Long id_carburant;

    private java.lang.String nom;

    public Carburant() {
    }

    public Carburant(
           java.lang.String description,
           ws.HistoCarb[] histo,
           java.lang.Long id_carburant,
           java.lang.String nom) {
           this.description = description;
           this.histo = histo;
           this.id_carburant = id_carburant;
           this.nom = nom;
    }


    /**
     * Gets the description value for this Carburant.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Carburant.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the histo value for this Carburant.
     * 
     * @return histo
     */
    public ws.HistoCarb[] getHisto() {
        return histo;
    }


    /**
     * Sets the histo value for this Carburant.
     * 
     * @param histo
     */
    public void setHisto(ws.HistoCarb[] histo) {
        this.histo = histo;
    }

    public ws.HistoCarb getHisto(int i) {
        return this.histo[i];
    }

    public void setHisto(int i, ws.HistoCarb _value) {
        this.histo[i] = _value;
    }


    /**
     * Gets the id_carburant value for this Carburant.
     * 
     * @return id_carburant
     */
    public java.lang.Long getId_carburant() {
        return id_carburant;
    }


    /**
     * Sets the id_carburant value for this Carburant.
     * 
     * @param id_carburant
     */
    public void setId_carburant(java.lang.Long id_carburant) {
        this.id_carburant = id_carburant;
    }


    /**
     * Gets the nom value for this Carburant.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Carburant.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Carburant)) return false;
        Carburant other = (Carburant) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.histo==null && other.getHisto()==null) || 
             (this.histo!=null &&
              java.util.Arrays.equals(this.histo, other.getHisto()))) &&
            ((this.id_carburant==null && other.getId_carburant()==null) || 
             (this.id_carburant!=null &&
              this.id_carburant.equals(other.getId_carburant()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHisto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHisto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHisto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId_carburant() != null) {
            _hashCode += getId_carburant().hashCode();
        }
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Carburant.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws/", "carburant"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "histo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws/", "histoCarb"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_carburant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_carburant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
