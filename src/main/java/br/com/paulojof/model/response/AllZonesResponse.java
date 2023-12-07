package br.com.paulojof.model.response;

import java.lang.reflect.Field;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllZonesResponse {

    private String string;

    private Instant instant;

    private OffsetDateTime offsetDateTime;

    private ZonedDateTime zonedDateTime;

    private LocalDateTime localDateTime;

    private LocalDate localDate;

    private LocalTime localTime;

    private OffsetTime offsetTime;

    public String toString() {
        List<Field> fieldList = Arrays.asList(this.getClass().getDeclaredFields());

        return fieldList.stream()
                .map(field -> {
                    try {
                        return (String) field.get(this);
                    } catch (Exception e) {
                        return "";
                    }
                })
                .collect(Collectors.joining());
    }
}
