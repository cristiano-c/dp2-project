package it.polito.escape.verify.model;

import javax.xml.bind.annotation.XmlTransient;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Neighbour")
public class Neighbour {

	@ApiModelProperty(required = false, hidden = true)
	@XmlTransient
	private long	id;

	@ApiModelProperty(	required = true,
						example = "nat",
						value = "The neighbour name must refer to an existing node of the same graph")
	private String	name;

	public Neighbour() {

	}

	public Neighbour(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else
			return false;
	}

}
