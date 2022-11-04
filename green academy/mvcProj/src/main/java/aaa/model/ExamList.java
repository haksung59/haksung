package aaa.model;

import java.util.ArrayList;
import java.util.Collections;

import lombok.Data;

@Data
public class ExamList {

	ArrayList<Exam> arr;
	
	public void calc() {
		for (Exam exam : arr) {
			exam.calc();
		}
		
		Collections.sort(arr);
	}
}
