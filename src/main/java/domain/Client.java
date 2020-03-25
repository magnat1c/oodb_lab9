package domain;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client extends Person {

    @Id
    private Long id;

    @Column
    @OneToMany
    private List<Order> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Order> getBankAccounts() {
        return orders;
    }

    public void setBankAccounts(List<Order> orders) {
        this.orders = orders;
    }
}