import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import org.immutables.value.Value.Immutable;

@JsonSerialize
@Immutable
@JsonDeserialize(as = ImmutableCar.class)
public abstract class AbstractCar implements Car {

  @Override
  @JsonDeserialize(as = ImmutableTire.class)
  public abstract List<Tire> getTires();
}
