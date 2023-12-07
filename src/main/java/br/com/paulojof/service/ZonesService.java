package br.com.paulojof.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import br.com.paulojof.model.response.AllZonesResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ZonesService {

    public AllZonesResponse getAllZones() {
        String allZonesResponseString = StringUtils.join(
                Instant.now().toString(), " | ",
                OffsetDateTime.now(), " | ",
                ZonedDateTime.now(), " | ",
                LocalDateTime.now(), " | ",
                LocalDate.now(), " | ",
                LocalTime.now(), " | ",
                OffsetTime.now());

        AllZonesResponse response = AllZonesResponse.builder()
                .string(allZonesResponseString)
                .instant(Instant.now())
                .offsetDateTime(OffsetDateTime.now())
                .zonedDateTime(ZonedDateTime.now())
                .localDateTime(LocalDateTime.now())
                .localDate(LocalDate.now())
                .localTime(LocalTime.now())
                .offsetTime(OffsetTime.now())
                .build();
        log.info("Return response: {}", response);
        return response;
    }

}
