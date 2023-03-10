package user.entity;

import java.util.UUID;

import org.springframework.data.mongodb.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fdse
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Indexed(unique = true)
    private UUID userId;
    private String userName;
    private String password;

    private int gender;

    private int documentType;

    private String documentNum;

    private String email;

}
