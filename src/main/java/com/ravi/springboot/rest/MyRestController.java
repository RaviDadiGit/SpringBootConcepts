package com.ravi.springboot.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@Value("${spring.application.name}")
	private String appName;

	@RequestMapping(value = "myService", method = RequestMethod.GET)
	public String get() {
		return "Success";
	}

	@RequestMapping(value = "appName", method = RequestMethod.GET)
	public String getAppName() {
		return appName;
	}

	@RequestMapping(value = "getJsonBody", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public JsonBean readJsonBody(@RequestBody JsonBean jsonBean) throws IOException {
		InputStream inputStream = new FileInputStream(
				"src/main/resources/sample_inputs/API-M1_Output.json");
		String customFeatures = IOUtils.toString(inputStream);
		System.out.println(jsonBean.getName());
		System.out.println(jsonBean.getOptional());
		System.out.println(jsonBean.getSubBean().get(0).getId());
		System.out.println(jsonBean.getJsonList());
		return jsonBean;
	}
}
