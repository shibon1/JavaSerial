
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shiboni
 */
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idcurso;
    private String nomecurso;
    private int horascurso;

    public Curso(int idcurso, String nomecurso, int horas) {
        this.idcurso = idcurso;
        this.nomecurso = nomecurso;
        this.horascurso = horas;
    }

    Curso() {

    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public int getHoras() {
        return horascurso;
    }

    public void setHoras(int horas) {
        this.horascurso = horas;
    }

    @Override
    public String toString() {

        return "================================= \n ID do Curso=" + idcurso + " || Curso=" + nomecurso + " || Horas=" + horascurso + "\n";
    }

}
