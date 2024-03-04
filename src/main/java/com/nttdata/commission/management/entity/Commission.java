package com.nttdata.commission.management.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document("commissions")
public class Commission {

  private String id;
  private String transactionType; // (depósito, retiro, transferencia, pago)
  private String productAccountId; // ID de la cuenta bancaria o del producto de crédito asociado
  private BigDecimal amount;
  private LocalDateTime date;

}
