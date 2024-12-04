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
public class TelaExcluirProfessorController {

    @FXML
    private TextField idProfessorTextField;

    @FXML
    private Label nomeProfessorLabel;

    @FXML
    private Label mensagemProfessorLabel;

    private ProfessorRepository professorRepository;

    public TelaExcluirProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    private Professor professorSelecionadoParaExclusao;

    @FXML
    protected void onBuscarProfessorButtonClick() {
        professorRepository.findById(Integer.parseInt(idProfessorTextField.getText())).ifPresentOrElse(
                professor -> {
                    nomeProfessorLabel.setText(professor.getNome());
                    mensagemProfessorLabel.setText("");
                    professorSelecionadoParaExclusao = professor;
                },
                () -> {
                    nomeProfessorLabel.setText("");
                    mensagemProfessorLabel.setText("Aluno não encontrado");
                    professorSelecionadoParaExclusao = null;
                }
        );
    }

    @FXML
    protected void onExcluirProfessorButtonClick(){
        if(professorSelecionadoParaExclusao != null){
            professorRepository.delete(professorSelecionadoParaExclusao);
            mensagemProfessorLabel.setText("Professor excluído com sucesso");
            nomeProfessorLabel.setText("");
            idProfessorTextField.setText("");
        } else {
            mensagemProfessorLabel.setText("Nenhum professor selecionado para exclusão");
        }
    }

}
