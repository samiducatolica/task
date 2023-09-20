package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "rol", schema = "acceso", catalog = "taskmanager_tyxa")
public class RolEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idrol")
    private long idrol;

    public long getIdrol() {
        return idrol;
    }

    public void setIdrol(long idrol) {
        this.idrol = idrol;
    }

    @Basic
    @Column(name = "titulo")
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Basic
    @Column(name = "decripcion")
    private String decripcion;

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    @Basic
    @Column(name = "activo")
    private Boolean activo;

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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

    @Basic
    @Column(name = "detalled_rol")
    private String detalledRol;

    public String getDetalledRol() {
        return detalledRol;
    }

    public void setDetalledRol(String detalledRol) {
        this.detalledRol = detalledRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolEntity rolEntity = (RolEntity) o;
        return idrol == rolEntity.idrol && Objects.equals(titulo, rolEntity.titulo) && Objects.equals(decripcion, rolEntity.decripcion) && Objects.equals(activo, rolEntity.activo) && Objects.equals(fechaCreacion, rolEntity.fechaCreacion) && Objects.equals(fechaActualizacion, rolEntity.fechaActualizacion) && Objects.equals(detalledRol, rolEntity.detalledRol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idrol, titulo, decripcion, activo, fechaCreacion, fechaActualizacion, detalledRol);
    }
}
