package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "actividad", schema = "taskmanager", catalog = "taskmanager_tyxa")
public class ActividadEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idactivad")
    private long idactivad;

    public long getIdactivad() {
        return idactivad;
    }

    public void setIdactivad(long idactivad) {
        this.idactivad = idactivad;
    }

    @Basic
    @Column(name = "idusuario")
    private long idusuario;

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
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
    @Column(name = "creadopor")
    private long creadopor;

    public long getCreadopor() {
        return creadopor;
    }

    public void setCreadopor(long creadopor) {
        this.creadopor = creadopor;
    }

    @Basic
    @Column(name = "actualizadopor")
    private long actualizadopor;

    public long getActualizadopor() {
        return actualizadopor;
    }

    public void setActualizadopor(long actualizadopor) {
        this.actualizadopor = actualizadopor;
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
    @Column(name = "status")
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "horas")
    private double horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
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
    private Date fechaActualizacion;

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Basic
    @Column(name = "fecha_planeada_inicio")
    private Date fechaPlaneadaInicio;

    public Date getFechaPlaneadaInicio() {
        return fechaPlaneadaInicio;
    }

    public void setFechaPlaneadaInicio(Date fechaPlaneadaInicio) {
        this.fechaPlaneadaInicio = fechaPlaneadaInicio;
    }

    @Basic
    @Column(name = "fecha_planeada_fin")
    private Date fechaPlaneadaFin;

    public Date getFechaPlaneadaFin() {
        return fechaPlaneadaFin;
    }

    public void setFechaPlaneadaFin(Date fechaPlaneadaFin) {
        this.fechaPlaneadaFin = fechaPlaneadaFin;
    }

    @Basic
    @Column(name = "fecha_inicio_real")
    private Date fechaInicioReal;

    public Date getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(Date fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    @Basic
    @Column(name = "fecha_fin_real")
    private Date fechaFinReal;

    public Date getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(Date fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
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
        ActividadEntity that = (ActividadEntity) o;
        return idactivad == that.idactivad && idusuario == that.idusuario && idtask == that.idtask && creadopor == that.creadopor && actualizadopor == that.actualizadopor && Double.compare(horas, that.horas) == 0 && Objects.equals(titulo, that.titulo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(status, that.status) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaActualizacion, that.fechaActualizacion) && Objects.equals(fechaPlaneadaInicio, that.fechaPlaneadaInicio) && Objects.equals(fechaPlaneadaFin, that.fechaPlaneadaFin) && Objects.equals(fechaInicioReal, that.fechaInicioReal) && Objects.equals(fechaFinReal, that.fechaFinReal) && Objects.equals(contenido, that.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idactivad, idusuario, idtask, creadopor, actualizadopor, titulo, descripcion, status, horas, fechaCreacion, fechaActualizacion, fechaPlaneadaInicio, fechaPlaneadaFin, fechaInicioReal, fechaFinReal, contenido);
    }
}
