package api;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class UserTimeResponse extends UserTime {
    private String updatedAt;
}
