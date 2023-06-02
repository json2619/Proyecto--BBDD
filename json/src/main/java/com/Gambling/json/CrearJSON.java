package com.Gambling.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import sorteo.Sorteo;

public class CrearJSON {

	public void creaJson(Sorteo sorteo) {

		File f = new File("gambling.json");
		try {
			// creación del flujo de salida
			PrintWriter printWriter = new PrintWriter(new FileWriter(f));
			String json2write = new ObjectMapper().writeValueAsString(sorteo);
			printWriter.print(json2write);
			printWriter.flush();
			printWriter.close();
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getLocalizedMessage());
		}
	}
	
}
