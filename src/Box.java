import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Box<T, I extends Number> {

    private T boxName;
    private I dynamometer;

}