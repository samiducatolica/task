package com.ucatolica.task.persistencia;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "roles_permisos", schema = "acceso", catalog = "taskmanager_tyxa")
public class RolesPermisosEntity {
    @Basic
    @jakarta.persistence.Column(name = "idrol")
    private long idrol;

    public long getIdrol() {
        return idrol;
    }

    public void setIdrol(long idrol) {
        this.idrol = idrol;
    }

    @Basic
    @jakarta.persistence.Column(name = "idpermiso")
    private Long idpermiso;

    public Long getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(Long idpermiso) {
        this.idpermiso = idpermiso;
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
        RolesPermisosEntity that = (RolesPermisosEntity) o;
        return idrol == that.idrol && Objects.equals(idpermiso, that.idpermiso) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaActualizacion, that.fechaActualizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idrol, idpermiso, fechaCreacion, fechaActualizacion);
    }
}
