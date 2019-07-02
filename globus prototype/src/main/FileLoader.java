package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.RegistrovaniKupac;
import model.Uloga;

public class FileLoader {
	public static String sp = System.getProperty("file.separator");
	
	public void loadRegUsers(ArrayList<RegistrovaniKupac> users) throws IOException {
		//TODO: Load all registered users in list users.
		users.clear();
		BufferedReader output = new BufferedReader(new FileReader("." + sp + "registeredUsers.txt"));
		String currentLine;
		while ((currentLine = output.readLine()) != null) {
			try {
				String[] el = currentLine.split("\\|");
				Date dateOfBirth = new SimpleDateFormat("dd.MM.yyyy.").parse(el[2]);
				Date dateOfReg = new SimpleDateFormat("dd.MM.yyyy.").parse(el[3]);
				RegistrovaniKupac rk = new RegistrovaniKupac(el[0], el[1], dateOfBirth, dateOfReg, Uloga.valueOf(el[4]),
						el[5], el[6], el[7]);
				users.add(rk);
			} catch (Exception e) {
				System.out.println("Error while reading from file 'registeredUsers.txt'");
			}
		}
		output.close();
	}
	
	public void loadUsername(ArrayList<RegistrovaniKupac> users, ArrayList<String> usernames) {
		//TODO: WE maybe don't need this method because we can read from 'users'.
		//		This way is maybe faster.
	}
	
	public void writeUser(RegistrovaniKupac rk) {
		//TODO: Write just one user in txt file, if possible.
		
	}
	
	public void writeUsers(ArrayList<RegistrovaniKupac> users) throws IOException {
		//TODO: Write all user in file.
		PrintWriter input = new PrintWriter(new FileWriter("." + sp + "registeredUsers.txt"));
		for (RegistrovaniKupac regk : users) {
			String dateOfBirth = new SimpleDateFormat("dd.MM.yyyy.").format(regk.getDatumRodjenja());
			String dateOdReg = new SimpleDateFormat("dd.MM.yyyy.").format(regk.getDatumRegistrovanja());
			String a = regk.getIme()+"|"+regk.getPrezime()+"|"+dateOfBirth+"|"+dateOdReg+"|"+regk.getUloga().name()+"|"+
			regk.getKorisnickoIme()+"|"+regk.getLozinka()+"|"+regk.getMejl();
			input.println(a);
		}
		input.close();
	}

}