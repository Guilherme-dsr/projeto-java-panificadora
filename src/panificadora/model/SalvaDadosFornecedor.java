package panificadora.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalvaDadosFornecedor {
    String NomeUsuario;
    String email;
    String reEmail;
    String senha;
    String reSenha;
    String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeUsuario() {
        return NomeUsuario;
    }

    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReEmail() {
        return reEmail;
    }

    public void setReEmail(String reEmail) {
        this.reEmail = reEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getReSenha() {
        return reSenha;
    }

    public void setReSenha(String reSenha) {
        this.reSenha = reSenha;
    }
    
    public String salvaDados(){
        try{
        
        FileWriter fw = new FileWriter("../Panificadora/Fornecedor/Fornecedor"+this.codigo+"/Fornecedor"+this.codigo+".txt");
        PrintWriter pw = new PrintWriter(fw);
        
        
        pw.println(this.NomeUsuario);
        pw.println(this.senha);
        pw.println(this.reSenha);
        pw.println(this.email);
        pw.println(this.reEmail);
        pw.println(this.codigo);
        
        pw.flush();
        pw.close();
        
        }catch(IOException e){
            Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, e);
        }
        return "Cadastrado com Sucesso!";
    }
    
    public String Excluir(String codigo){
        
        File fi = new File("../Panificadora/Fornecedor/Fornecedor"+codigo+"/Fornecedor"+codigo+".txt");
        fi.delete();
        
        return "Conta Deletada com sucesso";
    }
    public String Atualizar(){
        
         try{
        
        FileWriter fw = new FileWriter("../Panificadora/Fornecedor/Fornecedor"+this.codigo+"/Fornecedor"+this.codigo+".txt",false);
        PrintWriter pw = new PrintWriter(fw);
        
        
        pw.println(this.NomeUsuario);
        pw.println(this.senha);
        pw.println(this.reSenha);
        pw.println(this.email);
        pw.println(this.reEmail);
        pw.println(this.codigo);
        
        pw.flush();
        pw.close();
        
        }catch(IOException e){
            Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, e);
        }
        return "Cadastro Atulaizado";
    }
    public void Criarpastas(){
            File f = new File("../Panificadora/Fornecedor/Fornecedor"+this.codigo);
            f.mkdirs();
        }
        
        
}

