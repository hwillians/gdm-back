package dev.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import dev.domain.Mission;
import dev.domain.Nature;

public interface MissionRepository extends JpaRepository<Mission, Integer> {

	@Query("select m from Mission m join fetch m.collegue c where c.id = ?1")
	List<Mission> findAllByIdCollegue(Long idCollegue);

	@Modifying
	@Query("update Mission m set m.dateDebut =?2, m.dateFin=?3, m.villeDepart=?4, m.villeArrivee=?5, m.transport=?6, m.nature=?7 where m.id=?1")
	void update(Integer id, LocalDate dateDebut, LocalDate dateFin, String villeDepart, String villeArrivee,
			String transport, Nature nature);

}
