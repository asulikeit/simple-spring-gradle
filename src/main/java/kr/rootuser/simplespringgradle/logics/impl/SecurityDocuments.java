package kr.rootuser.simplespringgradle.logics.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import kr.rootuser.simplespringgradle.logics.Documents;

@Component
public class SecurityDocuments implements Documents {

	@Override
	public List<?> list() {
		List<String> strList = new ArrayList<>();
		strList.add("temp");
		return strList;
	}

}
