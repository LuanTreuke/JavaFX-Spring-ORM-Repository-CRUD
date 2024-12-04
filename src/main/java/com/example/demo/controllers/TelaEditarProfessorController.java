package com.example.demo.controllers;

import com.example.demo.entities.Aluno;
import com.example.demo.entities.Professor;
import com.example.demo.repositories.AlunoRepository;
import com.example.demo.repositories.ProfessorRepository;
import com.example.demo.telas.TelaEditarProf;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

@Controller
public class TelaEditarProfessorController {

    @FXML
    private TextField idProfessorTextField;

    @FXML
    private TextField nomeProfessorTextField;

    @FXML
    private TextField emailProfessorTextField;

    @FXML
    private Label mensagemProfessorLabel;

    private ProfessorRepository professorRepository;

    private Professor professorEditando;

    public TelaEditarProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @FXML
    protected void onBuscarProfessorButtonClick() {
        professorRepository.findById(Integer.parseInt(idProfessorTextField.getText())).ifPresentOrElse(
                professor -> {
                    nomeProfessorTextField.setText(professor.getNome());
                    emailProfessorTextField.setText(professor.getEmail());
                    mensagemProfessorLabel.setText("");
                    professorEditando = professor;
                },
                () -> {
                    mensagemProfessorLabel.setText("Professor não encontrado");
                    professorEditando = null;
                }
        );
    }

    @FXML
    protected void onSalvarProfessorButtonClick() {
        if (professorEditando != null) {
            professorEditando.setNome(nomeProfessorTextField.getText());
            professorEditando.setEmail(emailProfessorTextField.getText());
            professorRepository.save(professorEditando);
            mensagemProfessorLabel.setText("Professor salvo com sucesso");
        } else {
            mensagemProfessorLabel.setText("Professor não encontrado");
        }
    }

}
