package com.viswa.Spring;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void processor() {
		System.out.println("Snapdragon Processor");
		
	}

}
