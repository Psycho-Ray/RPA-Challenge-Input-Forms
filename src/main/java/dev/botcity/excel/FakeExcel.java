package dev.botcity.excel;

import java.util.ArrayList;
import java.util.List;

public class FakeExcel extends BaseExcel {
	private static final String[][] sheet = {
			{"John", "Smith", "IT Solutions", "Analyst", "98 North Road", "jsmith@itsolutions.co.uk", "40716543298"},
			{"Jane", "Dorsey", "MediCare", "Medical Engineer", "11 Crown Street", "jdorsey@mc.com", "40791345621"},
			{"Albert", "Kipling", "Waterfront", "Accountant", "22 Guild Street", "kipling@waterfront.com", "40735416854"},
			{"Michael", "Robertson", "MediCare", "IT Specialist", "17 Farburn Terrace", "mrobertson@mc.com", "40733652145"},
			{"Doug", "Derrick", "Timepath Inc.", "Analyst", "99 Shire Oak Road", "dderrick@timepath.co.uk", "40799885412"},
			{"Jessie", "Marlowe", "Aperture Inc.", "Scientist", "27 Cheshire Street", "jmarlowe@aperture.us", "40733154268"},
			{"Stan", "Hamm", "Sugarwell", "Advisor", "10 Dam Road", "shamm@sugarwell.org", "40712462257"},
			{"Michelle", "Norton", "Aperture Inc.", "Scientist", "13 White Rabbit Street", "mnorton@aperture.us", "40731254562"},
			{"Stacy", "Shelby", "TechDev", "HR Manager", "19 Pineapple Boulevard", "sshelby@techdev.com", "40741785214"},
			{"Lara", "Palmer", "Timepath Inc.", "Programmer", "87 Orange Street", "lpalmer@timepath.co.uk", "40731653845"}
		};
	
	public static Form getForm(int id) {
		return new Form(sheet[id]);
	}
	
	public static List<Form> getForms() {
		//Init
		List<Form> forms = new ArrayList<>(sheet.length);

		//Generates a form from each line of the Sheet
		for (int i=0; i<sheet.length; i++) forms.add(getForm(i));

		return forms;
	}
}