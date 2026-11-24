package org.backend.loppu.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "anturi")
public class Anturi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean status;
    private String name;
    private String block;

//    Getters and setters
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = "anturi";
    }
    public String getName() {
        String s = name + "_" + id;
        return s;
    }

    public void setBlock(String block) {
        this.block = block;
    }
    public String getBlock() {
        return block;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
}
