package dev.controller.nature;

import java.math.BigDecimal;
import java.time.LocalDate;




public class NatureResponseDto {
	
	
	private String nom;

	private boolean missionFacturee;

	private boolean versementPrime;
	
	private BigDecimal tjm;
	
	private BigDecimal pourcentagePrime;

	private BigDecimal plafond;

	private LocalDate debutValidite;

	public NatureResponseDto(String nom, boolean missionFacturee, boolean versementPrime, BigDecimal tjm,
			BigDecimal pourcentagePrime, BigDecimal plafond, LocalDate debutValidite) {
		super();
		this.nom = nom;
		this.missionFacturee = missionFacturee;
		this.versementPrime = versementPrime;
		this.tjm = tjm;
		this.pourcentagePrime = pourcentagePrime;
		this.plafond = plafond;
		this.debutValidite = debutValidite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isMissionFacturee() {
		return missionFacturee;
	}

	public void setMissionFacturee(boolean missionFacturee) {
		this.missionFacturee = missionFacturee;
	}

	public boolean isVersementPrime() {
		return versementPrime;
	}

	public void setVersementPrime(boolean versementPrime) {
		this.versementPrime = versementPrime;
	}

	public BigDecimal getTjm() {
		return tjm;
	}

	public void setTjm(BigDecimal tjm) {
		this.tjm = tjm;
	}

	public BigDecimal getPourcentagePrime() {
		return pourcentagePrime;
	}

	public void setPourcentagePrime(BigDecimal pourcentagePrime) {
		this.pourcentagePrime = pourcentagePrime;
	}

	public BigDecimal getPlafond() {
		return plafond;
	}

	public void setPlafond(BigDecimal plafond) {
		this.plafond = plafond;
	}

	public LocalDate getDebutValidite() {
		return debutValidite;
	}

	public void setDebutValidite(LocalDate debutValidite) {
		this.debutValidite = debutValidite;
	}






}
