package com.surveyservice.survey.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id ;

    public Category(String label, Integer numberOfQuestionsToConsider) {
        this.label = label;
        this.numberOfQuestionsToConsider = numberOfQuestionsToConsider;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", numberOfQuestionsToConsider=" + numberOfQuestionsToConsider +
                ", questions=" + questions +
                '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getNumberOfQuestionsToConsider() {
        return numberOfQuestionsToConsider;
    }

    public void setNumberOfQuestionsToConsider(Integer numberOfQuestionsToConsider) {
        this.numberOfQuestionsToConsider = numberOfQuestionsToConsider;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    private String label ;
    private Integer numberOfQuestionsToConsider;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "category")
    private List<Question> questions = new ArrayList<>();

}
