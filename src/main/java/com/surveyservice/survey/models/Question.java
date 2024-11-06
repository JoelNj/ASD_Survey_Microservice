package com.surveyservice.survey.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id ;

    private String label ;

    private Boolean is_active;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @JoinColumn(name="category_id")
    private Category category ;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "question")
    private List<Response> response  = new ArrayList<>();

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", is_active=" + is_active +
                ", category=" + category +
                '}';
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public Category getCategory() {
        return category;
    }
}
