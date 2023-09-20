package com.ucatolica.task.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "task_etiqueta", schema = "taskmanager", catalog = "taskmanager_tyxa")
@jakarta.persistence.IdClass(com.ucatolica.task.persistencia.TaskEtiquetaEntityPK.class)
public class TaskEtiquetaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "taskid")
    private long taskid;

    public long getTaskid() {
        return taskid;
    }

    public void setTaskid(long taskid) {
        this.taskid = taskid;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskEtiquetaEntity that = (TaskEtiquetaEntity) o;
        return taskid == that.taskid && idetiqueta == that.idetiqueta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskid, idetiqueta);
    }
}
