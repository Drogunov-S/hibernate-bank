package ru.drogunov.hibernatebank.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.drogunov.hibernatebank.common.BaseEntity;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "bank_card")
public class BankCard extends BaseEntity {
    private String number;
    @Column(name = "valid_to")
    private LocalDate validTo;
    private String ccv;
}
