package kr.rootuser.simplespringgradle.serivces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.rootuser.simplespringgradle.logics.Documents;

@RestController
public class TempService {
	
	private Documents documents;
	
	@Autowired
	public void setDocuments(Documents documents) {
		this.documents = documents;
	}

	@GetMapping("/api/v1")
	public ResponseEntity<?> home() {
		return new ResponseEntity<>("Simple Spring Gradle 0.1", HttpStatus.OK);
	}
	
	@GetMapping("/api/v1/documents")
	public ResponseEntity<?> listDocuments() {
		return new ResponseEntity<>(documents.list(), HttpStatus.OK);
	}
}
