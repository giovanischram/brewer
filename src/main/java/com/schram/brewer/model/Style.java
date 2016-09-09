package com.schram.brewer.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "style")
public class Style extends DefaultModel {

	private static final long serialVersionUID = -6361424993310872726L;
	
	private String name;
	
	@OneToMany(mappedBy = "style")
	private Collection<Beer> beers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Beer> getBeers() {
		return beers;
	}

	public void setBeers(Collection<Beer> beers) {
		this.beers = beers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((beers == null) ? 0 : beers.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Style other = (Style) obj;
		if (beers == null) {
			if (other.beers != null)
				return false;
		} else if (!beers.equals(other.beers))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}