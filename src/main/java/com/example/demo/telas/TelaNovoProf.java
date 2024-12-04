package com.example.demo.telas;

import com.example.demo.utils.AbridorJanela;
import org.springframework.stereotype.Component;

@Component
public class TelaNovoProf {

    AbridorJanela abridorJanela;

    public TelaNovoProf(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/tela-novo-professor-view.fxml", "Novo Professor", 500, 400);
    }

}
