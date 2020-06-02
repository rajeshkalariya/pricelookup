package com.modeln.gp.pricelookup.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchQuery {
	private String product;
	private Date asOfDate;
	private Date effectiveStartDate;
	private Date effectiveEndDate;
}
