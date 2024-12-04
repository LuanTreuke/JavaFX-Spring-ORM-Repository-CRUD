package com.example.demo.controllers;

import com.example.demo.entities.Aluno;
import com.example.demo.entities.Professor;
import com.example.demo.repositories.AlunoRepository;
import com.example.demo.repositories.ProfessorRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

@Controller
public class TelaNovoProfessorController {

    @FXML
    private TextField nomeProfessorTextField;

    @FXML
    private TextField emailProfessorTextField;

    @FXML
    private Label mensagemProfessorLabel;

    private ProfessorRepository professorRepository;

    public TelaNovoProfessorController(ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }

    @FXML
    protected void onSalvarProfessorButtonClick() {
        Professor professor = new Professor();
        professor.setNome(nomeProfessorTextField.getText());
        professor.setEmail(emailProfessorTextField.getText());
        professorRepository.save(professor);

        nomeProfessorTextField.clear();
        emailProfessorTextField.clear();
        mensagemProfessorLabel.setText("Professor salvo com sucesso!");
    }

}
