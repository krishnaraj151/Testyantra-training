package com.testyantra.Wss_testyantra;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Leaveinfo {
	@Id
	private int Employee_ID;
@Column(length = 50)
	private String Leave_Date;
@Column(length = 50)
	private String Leave_Status;


}
