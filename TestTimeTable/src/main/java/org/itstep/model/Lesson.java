package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Lesson {

	@JsonProperty
	private Integer id;
	
	@JsonProperty
	private Subject subject;
	
	@JsonProperty
	private User teacher;
	
	@JsonProperty
	private Group group;
	
	@JsonProperty
	private String cabinet;
	
	@JsonProperty
	private Long startTime;
	
	@JsonProperty
	private static final Long DURATION = 1000*60*90L;
}
