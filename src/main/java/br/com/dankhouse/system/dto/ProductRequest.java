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
public class ProductRequest {

    @JsonProperty("codigoProduto")
    private String productCode;

    @JsonProperty("categoria")
    private String category;

    @JsonProperty("marca")
    private String brand;

    @JsonProperty("nome")
    private String name;

    @JsonProperty("quantidade")
    private int quantity;

    @JsonProperty("preco de custo por un")
    private double unitPurchasePrice;

    @JsonProperty("preco de venda por un")
    private double unitSalesPrice;

    @JsonProperty("markup")
    private double markup;
}
