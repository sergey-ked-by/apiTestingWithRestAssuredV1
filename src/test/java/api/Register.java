package api;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class Register {
    private String email;
    private String password;
}