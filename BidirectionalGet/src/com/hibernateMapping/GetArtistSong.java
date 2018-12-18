package com.hibernateMapping;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetArtistSong {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession(); // create session
		// One to many

		/*
		 * Object o = session.get(Artist.class, new Integer(1)); Artist a =
		 * (Artist) o; System.out.println(a.getArtistId() + "\t" +
		 * a.getArtistName());
		 * 
		 * Set set = a.getChildren(); Iterator it = set.iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * Object o1 = (Object)it.next(); Song s = (Song) o1;
		 * System.out.println("---------------------------");
		 * System.out.println("Customer objects...");
		 * System.out.println("---------------------------");
		 * System.out.println(s.getSongId() + "\t" + s.getSongName() + "\t" +
		 * s.getForevenId()); System.out.println("---------------------------");
		 * }
		 */

		// many to one

		Object o = session.get(Song.class, new Integer(103));
		Song s = (Song) o;
		System.out.println(s.getSongId() + "\t" + s.getSongName() + "\t" + s.getForevenId());
		Artist a = s.getParentObjects();
		System.out.println(a.getArtistId() + "\t" + a.getArtistName());

		session.close();
		f.close();
	}

}
