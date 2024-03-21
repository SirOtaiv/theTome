package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class LivroDigital extends Livro{
    
    private String tipoExtensao;

    public String getTipoExtensao() {
        return tipoExtensao;
    }

    public void setTipoExtensao(String tipoExtensao) {
        this.tipoExtensao = tipoExtensao;
    }
    
}
