package ua.kiev.podolsky.DataGenerator.Randomizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RandomName {
	private static final String MALE_NAMES_STR = "Alfred Alonzo Arden Bobbie Brendon Brock Bud Byron Calvin Christoper Colin Corey Damon Denny Derrick Devin Dewitt Donnie Douglas Dudley Dwain Earle Earle Edison Elvis Emanuel Emmanuel Emory Ernest Ezekiel Ferdinand Fermin Florencio Florentino Gabriel Geoffrey Gerard German Harvey Hayden Hipolito Hugh Jamel Jamel Jamie Jayson Jed Jeremy Jerrold Jesus Jewell John Johnathon Johnie Justin Kirk Kraig Lauren Lawerence Linwood Manual Manuel Marco Maria Matt Merle Michale Millard Milo Moises Myles Ned Nicholas Nigel Orlando Oscar Osvaldo Paul Phillip Preston Raphael Reed Rich Rigoberto Rudolf Russell Salvador Scot Scottie Sean Seymour Simon Tanner Theo Tommie Tyree Vernon Warner Wilford Zackary";
	private static final String FEMALE_NAMES_STR = "Alida Alline Alona Alycia Annika Annmarie Antonietta Apryl Ardis Aretha Arnita Beckie Bella Blossom Buena Cammie Carisa Carlita Cassie Celia Christy Clare Cora Dagmar Denita Diedra Donnetta Earlean Eleonore Ellan Emeline Emiko Evia Felice Felicidad Gabriela Halina Hui Hulda Hwa Ileen Jaimie Janeen Jeannine Jenniffer Justine Kanisha Kari Karissa Karyl Kasha Keva Kina Kirstie Kyla Larraine Latrice Laure Leah Lelah Ling Linnie Lita Lois Lucienne Luna Lyda Magda Maile Maren Marge Melania Melia Meri Mollie Mora Nell Nida Pauline Reatha Roni Rose Savannah Senaida Shani Shantay Sharee Shea Shu Tasha Temple Teodora Tiffanie Timika Tonette Trudie Twana Valentina Vergie Vernell";
	private static final String SURNAMES_STR = "Abbott Acosta Adams Adkins Aguilar Alexander Ali Allen Andersen Anthony Archer Atkins Atkinson Avery Ayala Ayers Bailey Baker Baldwin Ball Banks Barber Barnes Barnett Barrera Barrett Barton Bass Bates Bauer Beasley Beck Becker Benjamin Bennett Benson Bentley Benton Berger Bernard Berry Bishop Black Blake Blanchard Blankenship Blevins Bond Bonilla Boone Bowen Bowman Bradford Brady Brandt Braun Bray Brewer Bridges Bright Brock Brooks Browning Bryan Buchanan Buck Buckley Bullock Burgess Burke Cain Calderon Caldwell Callahan Camacho Cameron Campos Cannon Cantu Cardenas Carlson Carney Carpenter Carr Carson Carter Castaneda Cervantes Chambers Chandler Chang Charles Chase Chavez Chen Choi Christian Clarke Clay Clements Cline Coffey Cohen Cole Collier Collins Colon Compton Conley Conner Conway Cook Cooke Cooley Cooper Cordova Cortez Cowan Crawford Cross Curry Dalton Daniel Daugherty Davenport David Davidson Davies Day Delacruz Deleon Dennis Dickerson Dillon Donovan Dougherty Doyle Duke Dunlap Duran Durham Dyer Eaton Edwards Ellison Erickson Escobar Estes Evans Everett Farley Faulkner Fields Finley Fisher Flores Flynn Fowler Franco Frank Frazier Frederick Freeman French Fritz Frost Frye Fuentes Galloway Gamble Garcia Gardner Garner Garrett Garrison Gentry George Gibbs Giles Gilmore Glenn Golden Gomez Gonzales Good Goodwin Gordon Gould Graham Grant Graves Gray Green Greene Griffin Grimes Gross Guerrero Hahn Hall Hammond Hanna Hansen Hardin Hardy Harmon Harper Harrington Harrison Hart Hartman Hatfield Hawkins Hayden Haynes Hebert Henderson Hendricks Hensley Herrera Hess Hester Hicks Higgins Ho Hogan Holder Holland Holloway Holmes Hooper House Howard Howell Huber Huerta Huff Hughes Humphrey Hunt Hunter Hurley Hutchinson Ibarra Irwin Jackson James Jefferson Jenkins Jones Joseph Juarez Kelly Kemp Kerr Khan Kidd Kirk Klein Knight Koch Lam Landry Lang Larsen Le Leach Lee Leonard Levine Lewis Lloyd Logan Lopez Lowe Lowery Lozano Luna Lutz Lynch Macdonald Madden Maddox Mahoney Maldonado Martinez Mason Massey Matthews May Maynard Mayo Mays Mcbride Mccarthy Mcclain Mcclure Mcconnell Mcdaniel Mcdonald Mcdowell Mcgee Mcgrath Mcguire Mcintosh Mcintyre Mckay Mckee Mcknight Mclaughlin Mcmahon Mcpherson Mejia Melendez Mendez Merritt Meyer Meyers Meza Michael Middleton Miles Miller Molina Montgomery Moody Moon Mora Moreno Morgan Morris Morrison Morse Moses Moss Moyer Mullen Nash Navarro Neal Nelson Newton Nixon Noble Norman Norris Norton Olson Oneal Orr Ortega Osborn Osborne Padilla Page Parrish Patel Patterson Paul Payne Peck Perez Perkins Peterson Petty Pham Phillips Pittman Poole Pope Potts Powers Preston Price Proctor Pruitt Quinn Ramirez Ramos Ramsey Randall Rasmussen Ray Reid Rice Richard Richardson Richmond Riddle Ritter Rivera Rivers Robbins Roberson Robles Rojas Rollins Rosario Rose Ross Roth Rowe Rowland Rubio Russell Salas Salazar Salinas Sampson Sanchez Santana Sawyer Schaefer Schmidt Schmitt Schroeder Schultz Serrano Sexton Shea Shelton Shepherd Sheppard Shields Short Silva Simmons Simon Singh Singleton Snyder Solis Solomon Sosa Soto Spence Stephens Stevens Stevenson Stokes Stone Stout Stuart Suarez Sullivan Tapia Tate Thomas Thompson Todd Torres Tran Trujillo Tucker Turner Tyler Underwood Vance Vargas Vaughan Velasquez Velazquez Villarreal Villegas Wade Walker Wall Waller Walls Walter Walton Ward Ware Warren Watts Weaver Webster Weiss Welch Werner West Wheeler Whitney Wiggins Wiley Wilkerson Winters Wise Wolf Wolfe Woodard Woods Woodward Wu Wyatt Yates Yoder Young Yu Zimmerman";
	private static final List<String> MALE_NAMES = Arrays.asList(MALE_NAMES_STR.split(" "));
	private static final List<String> FEMALE_NAMES = Arrays.asList(FEMALE_NAMES_STR.split(" "));
	private static final List<String> NAMES;
	static {
		NAMES = (new ArrayList<>(MALE_NAMES));
		NAMES.addAll(FEMALE_NAMES);
	}
	public static final List<String> SURNAMES = Arrays.asList(SURNAMES_STR.split(" "));
	
	public static <T> T getRandomValue(List<T> coll) {
		return coll.get(DataRandomizer.RAND.nextInt(coll.size()));
		
	}
	
	public static class Name implements DataRandomizer<String> {

		@Override
		public String getNext() {
			return getRandomValue(NAMES);
		}
		
	}
	
	public static class MaleName implements DataRandomizer<String> {

		@Override
		public String getNext() {
			return getRandomValue(MALE_NAMES);
		}
		
	}

	public static class FemaleName implements DataRandomizer<String> {

		@Override
		public String getNext() {
			return getRandomValue(FEMALE_NAMES);
		}
		
	}	
	
	public static class Surname implements DataRandomizer<String> {

		@Override
		public String getNext() {
			return getRandomValue(SURNAMES);
		}
		
	}
	
	public static class FullName implements DataRandomizer<String> {

		@Override
		public String getNext() {
			return getRandomValue(NAMES) + " " + getRandomValue(SURNAMES);
		}
		
	}
	
	public static class FullMaleName implements DataRandomizer<String> {

		@Override
		public String getNext() {
			return getRandomValue(MALE_NAMES) + " " + getRandomValue(SURNAMES);
		}
		
	}

	public static class FullFemaleName implements DataRandomizer<String> {

		@Override
		public String getNext() {
			return getRandomValue(FEMALE_NAMES) + " " + getRandomValue(SURNAMES);
		}
		
	}
	
	public static void main(String[] args) {
		DataRandomizer<String> rand = new FullName();
		for(int i=0; i<50; i++)
			System.out.println(rand.getNext());
	}
	
	public static List<String> maleNames() {
		return Collections.unmodifiableList(MALE_NAMES);
	}
	
	public static List<String> femaleNames() {
		return Collections.unmodifiableList(FEMALE_NAMES);
	}
	
	public static List<String> surnames() {
		return Collections.unmodifiableList(SURNAMES);
	}
	
	public static List<String> names() {
		return Collections.unmodifiableList(NAMES);
	}
	
	private static FemaleName femaleName = null;
	public static FemaleName femaleName() {
		if(femaleName == null) femaleName = new FemaleName();
		return femaleName;
	}

	private static MaleName maleName = null;
	public static MaleName maleName() {
		if(maleName == null) maleName = new MaleName();
		return maleName;
	}
	
	private static Surname surname = null;
	public static Surname surname() {
		if(surname == null) surname = new Surname();
		return surname;
	}
	
	}

