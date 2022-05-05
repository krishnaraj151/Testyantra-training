package com.testyantra.Wss_testyantra;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employeeinfo {
@Id
	private int Employee_ID;
	@Column(length = 50)
	private String Employee_Name;
	private String Employee_Type;
	@Column(length = 100)
	private String Email;
	@Column(length = 50)
	private String Password;


}
