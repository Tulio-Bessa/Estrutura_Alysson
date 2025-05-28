package Hash;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private String email;

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }


    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " Matricula: " + matricula + "\nNome: " + nome + "\nCurso: " + curso + "\nEmail: " + email;
    }

    
}
