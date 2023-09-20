package com.ucatolica.task.persistencia;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "usuarios_roles", schema = "acceso", catalog = "taskmanager_tyxa")
public class UsuariosRolesEntity {
    @Basic
    @jakarta.persistence.Column(name = "idusuario")
    private long idusuario;

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    @Basic
    @jakarta.persistence.Column(name = "idrol")
    private Long idrol;

    public Long getIdrol() {
        return idrol;
    }

    public void setIdrol(Long idrol) {
        this.idrol = idrol;
    }

    @Basic
    @jakarta.persistence.Column(name = "fecha_creacion")
    private Timestamp fechaCreacion;

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @jakarta.persistence.Column(name = "fecha_actualizacion")
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
        UsuariosRolesEntity that = (UsuariosRolesEntity) o;
        return idusuario == that.idusuario && Objects.equals(idrol, that.idrol) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaActualizacion, that.fechaActualizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusuario, idrol, fechaCreacion, fechaActualizacion);
    }
}
