package sk_microservices.FlightService.forms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddAirplaneForm {

    private Long id;
    private String naziv;
    private int kapacitetPutnika;

}
