package com.example.demo.telas;

import com.example.demo.utils.AbridorJanela;
import org.springframework.stereotype.Component;

@Component
public class  TelaProf {

    AbridorJanela abridorJanela;

    public TelaProf(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/tela-professores-view.fxml", "Professores", 700, 500);
    }

}
