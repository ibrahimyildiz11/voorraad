package be.vdab.voorraad.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artikels")
public class Artikel {
    @Id
    private long id;
    private int voorraad;

    protected Artikel() {}

    public Artikel(long id) {
        this.id = id;
    }
}
