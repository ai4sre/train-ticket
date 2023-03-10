package inside_payment.entity;

import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author fdse
 */
@Data
@Document(collection="addMoney")
public class Money {

    @Valid
    @NotNull
    @Id
    private String id;

    @Valid
    @NotNull
    @Indexed
    private String userId;

    @Valid
    @NotNull
    private String money; //NOSONAR

    @Valid
    @NotNull
    private MoneyType type;

    public Money(){
        this.id = UUID.randomUUID().toString();
        this.userId = "";
        this.money = "";

    }

}
