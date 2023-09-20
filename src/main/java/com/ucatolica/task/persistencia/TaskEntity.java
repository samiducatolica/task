package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "task", schema = "taskmanager", catalog = "taskmanager_tyxa")
public class TaskEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idtask")
    private long idtask;

    public long getIdtask() {
        return idtask;
    }

    public void setIdtask(long idtask) {
        this.idtask = idtask;
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
    @Column(name = "idusuariocreador")
    private int idusuariocreador;

    public int getIdusuariocreador() {
        return idusuariocreador;
    }

    public void setIdusuariocreador(int idusuariocreador) {
        this.idusuariocreador = idusuariocreador;
    }

    @Basic
    @Column(name = "idusuarioactualiza")
    private int idusuarioactualiza;

    public int getIdusuarioactualiza() {
        return idusuarioactualiza;
    }

    public void setIdusuarioactualiza(int idusuarioactualiza) {
        this.idusuarioactualiza = idusuarioactualiza;
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
    @Column(name = "idestado")
    private boolean idestado;

    public boolean isIdestado() {
        return idestado;
    }

    public void setIdestado(boolean idestado) {
        this.idestado = idestado;
    }

    @Basic
    @Column(name = "horas")
    private Double horas;

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
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
    @Column(name = "fecha_inicio_planificada")
    private Date fechaInicioPlanificada;

    public Date getFechaInicioPlanificada() {
        return fechaInicioPlanificada;
    }

    public void setFechaInicioPlanificada(Date fechaInicioPlanificada) {
        this.fechaInicioPlanificada = fechaInicioPlanificada;
    }

    @Basic
    @Column(name = "fecha_fin_planificada")
    private Date fechaFinPlanificada;

    public Date getFechaFinPlanificada() {
        return fechaFinPlanificada;
    }

    public void setFechaFinPlanificada(Date fechaFinPlanificada) {
        this.fechaFinPlanificada = fechaFinPlanificada;
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
        TaskEntity that = (TaskEntity) o;
        return idtask == that.idtask && idusuario == that.idusuario && idusuariocreador == that.idusuariocreador && idusuarioactualiza == that.idusuarioactualiza && idestado == that.idestado && Objects.equals(titulo, that.titulo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(horas, that.horas) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaActualizacion, that.fechaActualizacion) && Objects.equals(fechaInicioPlanificada, that.fechaInicioPlanificada) && Objects.equals(fechaFinPlanificada, that.fechaFinPlanificada) && Objects.equals(fechaInicioReal, that.fechaInicioReal) && Objects.equals(fechaFinReal, that.fechaFinReal) && Objects.equals(contenido, that.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtask, idusuario, idusuariocreador, idusuarioactualiza, titulo, descripcion, idestado, horas, fechaCreacion, fechaActualizacion, fechaInicioPlanificada, fechaFinPlanificada, fechaInicioReal, fechaFinReal, contenido);
    }
}
