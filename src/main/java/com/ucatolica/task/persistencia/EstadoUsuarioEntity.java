package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "estado_usuario", schema = "acceso", catalog = "taskmanager_tyxa")
public class EstadoUsuarioEntity {
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
    @Column(name = "descripcion_estado")
    private String descripcionEstado;

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    @Basic
    @Column(name = "fecha_creacion")
    private Timestamp fechaCreacion;

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "fecha_actualizacion")
    private Timestamp fechaActualizacion;

    public Timestamp getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Timestamp fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoUsuarioEntity that = (EstadoUsuarioEntity) o;
        return idestado == that.idestado && Objects.equals(descripcionEstado, that.descripcionEstado) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaActualizacion, that.fechaActualizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idestado, descripcionEstado, fechaCreacion, fechaActualizacion);
    }
}
