package com.viswa.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Oppo {
	
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void getPhone()
	{
		System.out.println("OPPO, 8GB RAM, 48MP Camera");
		cpu.processor();
	}
}
