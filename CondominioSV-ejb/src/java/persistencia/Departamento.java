/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hamzo
 */
@Entity
@Table(name = "DEPARTAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d")
    , @NamedQuery(name = "Departamento.findByIdDepto", query = "SELECT d FROM Departamento d WHERE d.idDepto = :idDepto")
    , @NamedQuery(name = "Departamento.findByNroDepto", query = "SELECT d FROM Departamento d WHERE d.nroDepto = :nroDepto")
    , @NamedQuery(name = "Departamento.findByEdificio", query = "SELECT d FROM Departamento d WHERE d.edificio = :edificio")
    , @NamedQuery(name = "Departamento.findByTipoDepto", query = "SELECT d FROM Departamento d WHERE d.tipoDepto = :tipoDepto")})
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DEPTO")
    private Integer idDepto;
    @Column(name = "NRO_DEPTO")
    private Integer nroDepto;
    @Size(max = 1)
    @Column(name = "EDIFICIO")
    private String edificio;
    @Size(max = 1)
    @Column(name = "TIPO_DEPTO")
    private String tipoDepto;

    public Departamento() {
    }

    public Departamento(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public Integer getNroDepto() {
        return nroDepto;
    }

    public void setNroDepto(Integer nroDepto) {
        this.nroDepto = nroDepto;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getTipoDepto() {
        return tipoDepto;
    }

    public void setTipoDepto(String tipoDepto) {
        this.tipoDepto = tipoDepto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepto != null ? idDepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.idDepto == null && other.idDepto != null) || (this.idDepto != null && !this.idDepto.equals(other.idDepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Departamento[ idDepto=" + idDepto + " ]";
    }
    
}
