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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ealonso
 */
@Entity
@Table(name = "boleteria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleteria.findAll", query = "SELECT b FROM Boleteria b")
    , @NamedQuery(name = "Boleteria.findByIdBoleteria", query = "SELECT b FROM Boleteria b WHERE b.idBoleteria = :idBoleteria")
    , @NamedQuery(name = "Boleteria.findByPrecio", query = "SELECT b FROM Boleteria b WHERE b.precio = :precio")
    , @NamedQuery(name = "Boleteria.findByCantidad", query = "SELECT b FROM Boleteria b WHERE b.cantidad = :cantidad")})
public class Boleteria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBoleteria")
    private Integer idBoleteria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Precio")
    private int precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cantidad")
    private int cantidad;
    @JoinColumn(name = "idUsuarios", referencedColumnName = "idUsuarios")
    @ManyToOne(optional = false)
    private Usuarios idUsuarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBoleteria")
    private Collection<Rifa> rifaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBoleteria")
    private Collection<Apuesta> apuestaCollection;

    public Boleteria() {
    }

    public Boleteria(Integer idBoleteria) {
        this.idBoleteria = idBoleteria;
    }

    public Boleteria(Integer idBoleteria, int precio, int cantidad) {
        this.idBoleteria = idBoleteria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Integer getIdBoleteria() {
        return idBoleteria;
    }

    public void setIdBoleteria(Integer idBoleteria) {
        this.idBoleteria = idBoleteria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Usuarios getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Usuarios idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    @XmlTransient
    public Collection<Rifa> getRifaCollection() {
        return rifaCollection;
    }

    public void setRifaCollection(Collection<Rifa> rifaCollection) {
        this.rifaCollection = rifaCollection;
    }

    @XmlTransient
    public Collection<Apuesta> getApuestaCollection() {
        return apuestaCollection;
    }

    public void setApuestaCollection(Collection<Apuesta> apuestaCollection) {
        this.apuestaCollection = apuestaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBoleteria != null ? idBoleteria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleteria)) {
            return false;
        }
        Boleteria other = (Boleteria) object;
        if ((this.idBoleteria == null && other.idBoleteria != null) || (this.idBoleteria != null && !this.idBoleteria.equals(other.idBoleteria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Boleteria[ idBoleteria=" + idBoleteria + " ]";
    }
    
}
