package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "etiqueta", schema = "taskmanager", catalog = "taskmanager_tyxa")
public class EtiquetaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idetiqueta")
    private long idetiqueta;

    public long getIdetiqueta() {
        return idetiqueta;
    }

    public void setIdetiqueta(long idetiqueta) {
        this.idetiqueta = idetiqueta;
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
    @Column(name = "etiqueta")
    private String etiqueta;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtiquetaEntity that = (EtiquetaEntity) o;
        return idetiqueta == that.idetiqueta && Objects.equals(titulo, that.titulo) && Objects.equals(etiqueta, that.etiqueta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idetiqueta, titulo, etiqueta);
    }
}
