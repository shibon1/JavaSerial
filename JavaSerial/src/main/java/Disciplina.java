
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
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    private int iddisciplina;
    private String nomedisciplina;
    private int horasdisciplina;

    public Disciplina(int iddisciplina, String nomedisciplina, int horasdisciplina) {
        this.iddisciplina = iddisciplina;
        this.nomedisciplina = nomedisciplina;
        this.horasdisciplina = horasdisciplina;
    }
    
    Disciplina(){
        
    }

    public int getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(int iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    public String getNomedisciplina() {
        return nomedisciplina;
    }

    public void setNomedisciplina(String nomedisciplina) {
        this.nomedisciplina = nomedisciplina;
    }

    public int getHorasdisciplina() {
        return horasdisciplina;
    }

    public void setHorasdisciplina(int horasdisciplina) {
        this.horasdisciplina = horasdisciplina;
    }

    @Override
    public String toString() {
     
  return "================================= \n ID da Disciplina=" + iddisciplina + " || Disciplina=" + nomedisciplina + " || Horas= " + horasdisciplina+ "\n";
    }
   
}
