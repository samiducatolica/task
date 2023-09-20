package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "estado", schema = "taskmanager", catalog = "taskmanager_tyxa")
public class EstadoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idestado")
    private long idestado;

    public long getIdestado() {
        return idestado;
    }

    public void setIdestado(long idestado) {
        this.idestado = idestado;
    }

    @Basic
    @Column(name = "nombreestado")
    private String nombreestado;

    public String getNombreestado() {
        return nombreestado;
    }

    public void setNombreestado(String nombreestado) {
        this.nombreestado = nombreestado;
    }

    @Basic
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoEntity that = (EstadoEntity) o;
        return idestado == that.idestado && Objects.equals(nombreestado, that.nombreestado) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaModificacion, that.fechaModificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idestado, nombreestado, fechaCreacion, fechaModificacion);
    }
}
