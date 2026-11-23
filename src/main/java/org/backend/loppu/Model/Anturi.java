package org.backend.loppu.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "anturi")
public class Anturi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
