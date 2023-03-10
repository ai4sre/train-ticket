package fdse.microservice.entity;

import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="station")
public class Station {
    @Valid
    @NotNull
    @Id
    private String id;

    @Valid
    @NotNull
    @Indexed
    private String name;

    private int stayTime;

    public Station(){
        //Default Constructor
        this.id = UUID.randomUUID().toString();
        this.name = "";
    }

    public Station(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public Station(String id, String name, int stayTime) {
        this.id = id;
        this.name = name;
        this.stayTime = stayTime;
    }

}
