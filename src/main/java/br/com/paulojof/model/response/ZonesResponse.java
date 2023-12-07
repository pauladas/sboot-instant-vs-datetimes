package br.com.paulojof.model.response;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import br.com.paulojof.model.domain.PocZonesDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZonesResponse {

    private String id;

    private LocalDate date;

    private LocalTime time;

    private LocalDateTime datetime;

    private Instant instant;

    public static ZonesResponse valueOf(PocZonesDomain pocZonesDomain) {
        return ZonesResponse.builder()
                .id(pocZonesDomain.getId())
                .date(pocZonesDomain.getDate())
                .time(pocZonesDomain.getTime())
                .datetime(pocZonesDomain.getDatetime())
                .instant(pocZonesDomain.getTimestamp())
                .build();
    }

}
