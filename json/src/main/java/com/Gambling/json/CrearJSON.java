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

import result.Resultado;
import result.ResultadoElGordo;
import result.ResultadoEuromillones;
import result.ResultadoLotNac;
import result.ResultadoPrimitiva;
import sorteo.Sorteo;


public class CrearJSON {

	public String creaJson(ResultadoElGordo resultado) {

		String concat = "";
		String fichero = "";
		File f = new File("elGordo.json");
		try {

			PrintWriter printWriter = new PrintWriter(new FileWriter(f));
			String json2write = new ObjectMapper().writeValueAsString(resultado);
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
	
	public String creaJson(ResultadoPrimitiva resultado) {

		String concat = "";
		String fichero = "";
		File f = new File("primitiva.json");
		try {

			PrintWriter printWriter = new PrintWriter(new FileWriter(f));
			String json2write = new ObjectMapper().writeValueAsString(resultado);
			printWriter.print(json2write);
			printWriter.flush();
			printWriter.close();
			 
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			    String linea;
			    while ((linea = br.readLine()) != null) {
			        fichero += linea;
			    }
			    
			    
			    JSONObject objectJson = new JSONObject(fichero);
			    concat = objectJson.getJSONArray("combinacionGanadora") + "  " + objectJson.getInt("complememtario") + "  " + objectJson.getInt("reintegro");
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
	
	public String creaJson(ResultadoEuromillones resultado) {

		String concat = "";
		String fichero = "";
		File f = new File("euromillones.json");
		try {

			PrintWriter printWriter = new PrintWriter(new FileWriter(f));
			String json2write = new ObjectMapper().writeValueAsString(resultado);
			printWriter.print(json2write);
			printWriter.flush();
			printWriter.close();
			 
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			    String linea;
			    while ((linea = br.readLine()) != null) {
			        fichero += linea;
			    }
			    
			    
			    JSONObject objectJson = new JSONObject(fichero);
			    concat = objectJson.getJSONArray("combinacionGanadora") + "  " + objectJson.getJSONArray("estrellas");
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
	
	public String creaJson(ResultadoLotNac resultado) {

		String concat = "";
		String fichero = "";
		File f = new File("lotNacional.json");
		try {

			PrintWriter printWriter = new PrintWriter(new FileWriter(f));
			String json2write = new ObjectMapper().writeValueAsString(resultado);
			printWriter.print(json2write);
			printWriter.flush();
			printWriter.close();
			 
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			    String linea;
			    while ((linea = br.readLine()) != null) {
			        fichero += linea;
			    }
			    
			    
			    JSONObject objectJson = new JSONObject(fichero);
			    concat = objectJson.getInt("numPremiado") + "  " + objectJson.getInt("reintegro");
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
