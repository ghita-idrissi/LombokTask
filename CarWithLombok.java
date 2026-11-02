
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class CarWithLombok {

    private String model;
    @EqualsAndHashCode.Include
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

}

