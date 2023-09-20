package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "permiso", schema = "acceso", catalog = "taskmanager_tyxa")
public class PermisoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idpermiso")
    private long idpermiso;

    public long getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(long idpermiso) {
        this.idpermiso = idpermiso;
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
    @Column(name = "descripcion")
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    @Column(name = "fecha_edicion")
    private Timestamp fechaEdicion;

    public Timestamp getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Timestamp fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Basic
    @Column(name = "detalle_permiso")
    private String detallePermiso;

    public String getDetallePermiso() {
        return detallePermiso;
    }

    public void setDetallePermiso(String detallePermiso) {
        this.detallePermiso = detallePermiso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermisoEntity that = (PermisoEntity) o;
        return idpermiso == that.idpermiso && Objects.equals(titulo, that.titulo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(activo, that.activo) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaEdicion, that.fechaEdicion) && Objects.equals(detallePermiso, that.detallePermiso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpermiso, titulo, descripcion, activo, fechaCreacion, fechaEdicion, detallePermiso);
    }
}
