package com.example.demo.telas;

import com.example.demo.utils.AbridorJanela;
import org.springframework.stereotype.Component;

@Component
public class TelaExcluirProf {

    AbridorJanela abridorJanela;

    public TelaExcluirProf(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/tela-excluir-professor-view.fxml", "Novo Professor", 300, 400);
    }

}
