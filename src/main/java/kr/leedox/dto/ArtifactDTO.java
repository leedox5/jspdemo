package kr.leedox.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtifactDTO {
    String artifactId;
    String name;
    Double price;
    String rarity;
}
