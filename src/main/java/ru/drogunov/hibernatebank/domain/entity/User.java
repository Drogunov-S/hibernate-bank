package ru.drogunov.hibernatebank.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.FetchProfile;
import ru.drogunov.hibernatebank.common.BaseEntity;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
@FetchProfile(name = "cards", fetchOverrides = {
        @FetchProfile.FetchOverride(
                entity = User.class,
                association = "bankCard",
                mode = FetchMode.JOIN
        )
})
public class User extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<BankCard> bankCard;

}

