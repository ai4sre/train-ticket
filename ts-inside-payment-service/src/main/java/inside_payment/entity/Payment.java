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
@Document(collection="payment")
public class Payment {
    @Id
    @NotNull
    @Valid
    private String id;

    @NotNull
    @Valid
    @Indexed
    private String orderId;

    @NotNull
    @Valid
    @Indexed
    private String userId;

    @NotNull
    @Valid
    private String price;

    @NotNull
    @Valid
    private PaymentType type;

    public Payment(){
        this.id = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        this.orderId = "";
        this.userId = "";
        this.price = "";
    }

}
