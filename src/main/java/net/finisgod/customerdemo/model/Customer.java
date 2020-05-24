package net.finisgod.customerdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity {

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;

    @Column(name = "address")
    public String address;

    @Column(name = "budget")
    public BigDecimal budget;
}
