package consign.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "consign_record")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsignRecord {

    @Id
    private UUID id;
    @Indexed
    private UUID orderId;
    private UUID accountId;
    private String handleDate;
    private String targetDate;
    private String from;
    private String to;
    private String consignee;
    private String phone;
    private double weight;
    private double price;

}
