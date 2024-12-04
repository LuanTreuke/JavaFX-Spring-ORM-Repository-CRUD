package com.example.demo.telas;

import com.example.demo.utils.AbridorJanela;
import org.springframework.stereotype.Component;

@Component
public class TelaEditarProf {

    AbridorJanela abridorJanela;

    public TelaEditarProf(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/tela-editar-professor-view.fxml", "Alterar Professor", 300, 500);
    }

}
