package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "comentarios", schema = "taskmanager", catalog = "taskmanager_tyxa")
public class ComentariosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idcomentario")
    private long idcomentario;

    public long getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(long idcomentario) {
        this.idcomentario = idcomentario;
    }

    @Basic
    @Column(name = "idtask")
    private long idtask;

    public long getIdtask() {
        return idtask;
    }

    public void setIdtask(long idtask) {
        this.idtask = idtask;
    }

    @Basic
    @Column(name = "idactividad")
    private long idactividad;

    public long getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(long idactividad) {
        this.idactividad = idactividad;
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
    @Column(name = "contenido")
    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComentariosEntity that = (ComentariosEntity) o;
        return idcomentario == that.idcomentario && idtask == that.idtask && idactividad == that.idactividad && Objects.equals(titulo, that.titulo) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaActualizacion, that.fechaActualizacion) && Objects.equals(contenido, that.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcomentario, idtask, idactividad, titulo, fechaCreacion, fechaActualizacion, contenido);
    }
}
