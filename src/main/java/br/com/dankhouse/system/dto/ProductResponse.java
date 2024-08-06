package br.com.dankhouse.system.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    @JsonProperty("id")
    private long id;

    @JsonProperty("nome")
    private String Name;

    @JsonProperty("quantidade")
    private String quantity;
}
