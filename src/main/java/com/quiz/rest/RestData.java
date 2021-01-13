package com.quiz.rest;

import java.time.LocalTime;
import java.util.Arrays;

import org.apache.tomcat.jni.Time;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.ModelDate;

@RestController
@RequestMapping(path = "/rest/data")
public class RestData {
	
	@GetMapping(path = "/convertDate", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelDate getConvert(@RequestParam(name = "hour") String datetime, @RequestParam(name = "timezone") int timezone) {
		ModelDate response = new ModelDate();
		
		String[] timeTmp = datetime.split(":");
		
		datetime = (Integer.valueOf(timeTmp[0]) + timezone)+":"+timeTmp[1]+":"+timeTmp[2];
		
		response.setTime(datetime);
		response.setTimezone("UTC");
		
		return response;
	}

}
