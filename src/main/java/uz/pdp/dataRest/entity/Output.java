package uz.pdp.dataRest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp date;

    private String factureNumber;

    @Column(nullable = false,unique = true)
    private String code;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Currency currency;

    @ManyToOne
    private Client client;
}
