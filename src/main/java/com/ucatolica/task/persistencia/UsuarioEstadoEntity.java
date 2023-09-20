package com.ucatolica.task.persistencia;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "usuario_estado", schema = "acceso", catalog = "taskmanager_tyxa")
public class UsuarioEstadoEntity {
    @Basic
    @jakarta.persistence.Column(name = "idusuario")
    private Long idusuario;

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    @Basic
    @jakarta.persistence.Column(name = "idestado")
    private Long idestado;

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEstadoEntity that = (UsuarioEstadoEntity) o;
        return Objects.equals(idusuario, that.idusuario) && Objects.equals(idestado, that.idestado) && Objects.equals(fechaCreacion, that.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusuario, idestado, fechaCreacion);
    }
}
