package api;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class SuccessReg {
    private Integer id;
    private String token;
}