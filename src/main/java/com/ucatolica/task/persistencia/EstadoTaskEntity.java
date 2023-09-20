package com.ucatolica.task.persistencia;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

import java.sql.Date;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "estado_task", schema = "taskmanager", catalog = "taskmanager_tyxa")
public class EstadoTaskEntity {
    @Basic
    @jakarta.persistence.Column(name = "idtask")
    private Long idtask;

    public Long getIdtask() {
        return idtask;
    }

    public void setIdtask(Long idtask) {
        this.idtask = idtask;
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
    @jakarta.persistence.Column(name = "fecha_asignacion")
    private Date fechaAsignacion;

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoTaskEntity that = (EstadoTaskEntity) o;
        return Objects.equals(idtask, that.idtask) && Objects.equals(idestado, that.idestado) && Objects.equals(fechaAsignacion, that.fechaAsignacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtask, idestado, fechaAsignacion);
    }
}
