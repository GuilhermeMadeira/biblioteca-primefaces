/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author guima
 */
@Entity
@Table(name = "EDITORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Editora.findAll", query = "SELECT e FROM Editora e")
    , @NamedQuery(name = "Editora.findById", query = "SELECT e FROM Editora e WHERE e.id = :id")
    , @NamedQuery(name = "Editora.findByNome", query = "SELECT e FROM Editora e WHERE e.nome = :nome")
    , @NamedQuery(name = "Editora.findBySede", query = "SELECT e FROM Editora e WHERE e.sede = :sede")
    , @NamedQuery(name = "Editora.findBySite", query = "SELECT e FROM Editora e WHERE e.site = :site")})
public class Editora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "NOME", nullable = false, length = 300)
    private String nome;
    @Size(max = 200)
    @Column(name = "SEDE", length = 200)
    private String sede;
    @Size(max = 200)
    @Column(name = "SITE", length = 200)
    private String site;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEditora")
    private Collection<Livro> livroCollection;

    public Editora() {
    }

    public Editora(Integer id) {
        this.id = id;
    }

    public Editora(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @XmlTransient
    public Collection<Livro> getLivroCollection() {
        return livroCollection;
    }

    public void setLivroCollection(Collection<Livro> livroCollection) {
        this.livroCollection = livroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editora)) {
            return false;
        }
        Editora other = (Editora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Editora[ id=" + id + " ]";
    }
    
}