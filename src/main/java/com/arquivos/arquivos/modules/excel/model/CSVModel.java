package com.arquivos.arquivos.modules.excel.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CSVModel {
    private String nome;
    private Integer idade;
    private String cidade;
    private String rua;
}
