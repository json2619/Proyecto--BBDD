package com.Gambling.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import result.ResultadoElGordo;
import sorteo.Sorteo;


public class CrearJSON {

	public String creaJson(Sorteo sorteo) {

		ResultadoElGordo resultadoEG = new ResultadoElGordo();
		String concat = "";
		String fichero = "";
		File f = new File("gambling.json");
		try {

			PrintWriter printWriter = new PrintWriter(new FileWriter(f));
			String json2write = new ObjectMapper().writeValueAsString(resultadoEG);
			printWriter.print(json2write);
			printWriter.flush();
			printWriter.close();
			 
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			    String linea;
			    while ((linea = br.readLine()) != null) {
			        fichero += linea;
			    }
			    
			    
			    JSONObject objectJson = new JSONObject(fichero);
			    concat = objectJson.getJSONArray("combinacionGanadora") + "  " + objectJson.getInt("numClave");
			    System.out.println(concat);
			} catch (FileNotFoundException ex) {
			    System.out.println(ex.getMessage());
			} catch (IOException ex) {
			    System.out.println(ex.getMessage());
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getLocalizedMessage());
		}
		return concat;
	}
	
}
