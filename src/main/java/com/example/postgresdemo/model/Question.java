package com.example.postgresdemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "questions")
public class Question extends AuditModel {
    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    @Column(columnDefinition = "text")
    private String mescouillesaski;

    @Column(columnDefinition = "text")
    private String mescouillesaskii;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMescouillesaski() {
        return mescouillesaski;
    }

    public void setMescouillesaski(String mescouillesaski) {
        this.mescouillesaski = mescouillesaski;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMescouillesaskii() {
        return mescouillesaskii;
    }

    public void setMescouillesaskii(String mescouillesaskii) {
        this.mescouillesaskii = mescouillesaskii;
    }
}
