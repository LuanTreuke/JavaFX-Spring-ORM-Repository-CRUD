package com.example.demo.controllers;

import com.example.demo.repositories.AlunoRepository;
import com.example.demo.repositories.ProfessorRepository;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import org.springframework.stereotype.Controller;

@Controller
public class TelaProfessoresController {

    private ProfessorRepository professorRepository;

    @FXML
    private ListView<String> listaProfessores;

    public TelaProfessoresController(ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }

    @FXML
    protected void onCarregarProfessoresButtonClick(){
        professorRepository.findAll().forEach(professor -> {
            listaProfessores.getItems().add(professor.getNome());
        });
    }

}
