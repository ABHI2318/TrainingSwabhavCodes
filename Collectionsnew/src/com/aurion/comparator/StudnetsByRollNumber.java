package com.aurion.comparator;
import java.util.Comparator;

import com.aurion.model.StudentsLinkedlistModel;


public class StudnetsByRollNumber implements Comparator<StudentsLinkedlistModel> {

	@Override
	public int compare(StudentsLinkedlistModel student1, StudentsLinkedlistModel student2) {
		return student1.getRollnumber()-student2.getRollnumber()	;
		}

	

}
