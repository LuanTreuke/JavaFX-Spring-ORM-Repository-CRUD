package com.example.demo.controllers;

import com.example.demo.telas.*;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class TelaInicialController {

    private TelaAlunos telaAlunos;
    private TelaNovoAluno telaNovoAluno;
    private TelaExcluirAluno telaExcluirAluno;
    private TelaEditarAluno telaEditarAluno;

    private TelaProf telaProf;
    private TelaNovoProf telaNovoProf;
    private TelaExcluirProf telaExcluirProf;
    private TelaEditarProf telaEditarProf;

    public TelaInicialController(TelaAlunos telaAlunos,
                                 TelaNovoAluno telaNovoAluno,
                                 TelaExcluirAluno telaExcluirAluno,
                                 TelaEditarAluno telaEditarAluno,
                                 TelaProf telaProf,
                                 TelaNovoProf telaNovoProf,
                                 TelaExcluirProf telaExcluirProf,
                                 TelaEditarProf telaEditarProf) {
        this.telaAlunos = telaAlunos;
        this.telaNovoAluno = telaNovoAluno;
        this.telaExcluirAluno = telaExcluirAluno;
        this.telaEditarAluno = telaEditarAluno;

        this.telaProf = telaProf;
        this.telaNovoProf = telaNovoProf;
        this.telaExcluirProf = telaExcluirProf;
        this.telaEditarProf = telaEditarProf;
    }

    @FXML
    protected void onAbrirAlunosButtonClick() {
        telaAlunos.abrir();
    }

    @FXML
    protected void onNovoAlunoButtonClick(){
        telaNovoAluno.abrir();
    }

    @FXML
    protected void onExcluirAlunoButtonClick(){
        telaExcluirAluno.abrir();
    }

    @FXML
    protected void onEditarAlunoButtonClick(){
        telaEditarAluno.abrir();
    }

    @FXML
    protected void onAbrirProfessoresButtonClick() {
        telaProf.abrir();
    }

    @FXML
    protected void onNovoProfessorButtonClick(){
        telaNovoProf.abrir();
    }

    @FXML
    protected void onExcluirProfessorButtonClick(){
        telaExcluirProf.abrir();
    }

    @FXML
    protected void onEditarProfessorButtonClick(){
        telaEditarProf.abrir();
    }

}
