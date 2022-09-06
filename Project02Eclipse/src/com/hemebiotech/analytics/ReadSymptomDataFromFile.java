package com.hemebiotech.analytics;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Simple brute force implementation
 * ISymptomReader interface implementation 
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
		/* 
		 * Get an access to the data file "Symptom.txt" and return result in a list of symptom
		 * @throws IOException if the file is not created correctly
		 */
	
		public List<String> getSymptoms(String filename) throws IOException {
			
			System.out.println("Lecture du fichier : " + filename);
			
			BufferedReader symptom = new BufferedReader (new FileReader(filename));
			
		
			List<String> symptoms = new ArrayList<String>();
			
			// MODIFICATION DEMANDE PROF EXAMEN
			try {
			
			String line = symptom.readLine();
			
			while (line !=null) {
				
				symptoms.add(line);
				
				line = symptom.readLine();
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			
				
		} finally {
			
			if (symptom !=null) {
				try {
					symptom.close();
				} catch (IOException e) {
					e.printStackTrace();		
						}
					}
				
				}
			return symptoms;
				
			}
		}
				
			
			
	
		
		

