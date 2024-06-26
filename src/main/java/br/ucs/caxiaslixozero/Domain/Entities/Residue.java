package br.ucs.caxiaslixozero.Domain.Entities;

import br.ucs.caxiaslixozero.Domain.Enums.ResidueType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Residue {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private ResidueType residueType;
    private String name;
    private String description;
    private String disposeText;
    private byte[] image;
    @ManyToMany(mappedBy = "residues")
    private List<Ecopoint> ecopoints;
}
