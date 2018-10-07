package com.piggymetrics.statistics.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/*
import org.springframework.data.mongodb.core.mapping.Document;
*/

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/*@Document(collection = "accounts")*/
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Account {

	@Id
	public String Id;

	@Valid
	@NotNull
	@OneToMany
	private List<Item> incomes;

	@Valid
	@NotNull
	@OneToMany
	private List<Item> expenses;

	@Valid
	@NotNull
	@Embedded
	private Saving saving;

	@OneToMany
	public List<Item> getIncomes() {
		return incomes;
	}

	public void setIncomes(List<Item> incomes) {
		this.incomes = incomes;
	}

	@OneToMany
	public List<Item> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Item> expenses) {
		this.expenses = expenses;
	}

	public Saving getSaving() {
		return saving;
	}

	public void setSaving(Saving saving) {
		this.saving = saving;
	}
}
