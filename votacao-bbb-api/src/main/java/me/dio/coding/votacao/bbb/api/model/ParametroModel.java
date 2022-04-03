package me.dio.coding.votacao.bbb.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Parametros")
public class ParametroModel {

    @Id
    // private String id;
    private String chave;
    private String valor;

}
