package br.com.paulojof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulojof.model.domain.PocZonesDomain;

public interface PocZonesRepository extends JpaRepository<PocZonesDomain, String> {
}
