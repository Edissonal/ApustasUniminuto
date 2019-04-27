/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ealonso
 */
@Entity
@Table(name = "apuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apuesta.findAll", query = "SELECT a FROM Apuesta a")
    , @NamedQuery(name = "Apuesta.findByIdApuesta", query = "SELECT a FROM Apuesta a WHERE a.idApuesta = :idApuesta")})
public class Apuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idApuesta")
    private Integer idApuesta;
    @JoinColumn(name = "idPartido", referencedColumnName = "idPartido")
    @ManyToOne(optional = false)
    private Partido idPartido;
    @JoinColumn(name = "idUsuarios", referencedColumnName = "idUsuarios")
    @ManyToOne(optional = false)
    private Usuarios idUsuarios;
    @JoinColumn(name = "idResultado", referencedColumnName = "idResultado")
    @ManyToOne(optional = false)
    private Resultado idResultado;
    @JoinColumn(name = "idBoleteria", referencedColumnName = "idBoleteria")
    @ManyToOne(optional = false)
    private Boleteria idBoleteria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idApuesta")
    private Collection<Ganadores> ganadoresCollection;

    public Apuesta() {
    }

    public Apuesta(Integer idApuesta) {
        this.idApuesta = idApuesta;
    }

    public Integer getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(Integer idApuesta) {
        this.idApuesta = idApuesta;
    }

    public Partido getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Partido idPartido) {
        this.idPartido = idPartido;
    }

    public Usuarios getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Usuarios idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public Resultado getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Resultado idResultado) {
        this.idResultado = idResultado;
    }

    public Boleteria getIdBoleteria() {
        return idBoleteria;
    }

    public void setIdBoleteria(Boleteria idBoleteria) {
        this.idBoleteria = idBoleteria;
    }

    @XmlTransient
    public Collection<Ganadores> getGanadoresCollection() {
        return ganadoresCollection;
    }

    public void setGanadoresCollection(Collection<Ganadores> ganadoresCollection) {
        this.ganadoresCollection = ganadoresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApuesta != null ? idApuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apuesta)) {
            return false;
        }
        Apuesta other = (Apuesta) object;
        if ((this.idApuesta == null && other.idApuesta != null) || (this.idApuesta != null && !this.idApuesta.equals(other.idApuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Apuesta[ idApuesta=" + idApuesta + " ]";
    }
    
}
