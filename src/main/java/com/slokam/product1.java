package com.slokam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Entity
@Data
@Slf4j
public class product1 {
	@Id
	@GeneratedValue
private int pid;
private String pname;
private double pprice;
private String pcolour;

}
