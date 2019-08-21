package neu.edu.info6205;

import java.util.Scanner;

public class LinearProbing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Table:");
		int sz = sc.nextInt();
		HashTable table = new HashTable(sz);
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0;
		System.out.println("\nActual Table Size:" + table.arraySize);
		System.out.println("\nTable Size before insertion of element:" + table.size);
		String A[] = { "apple", "announce", "RAj" };
		String B[] = { "Ojas", "Varun", "Yash", "Kinnar", "Archana" };
		// { "Nebraska,", "Nevada,", "New Hampshire,", "New Jersey,", "New Mexico,", "GA
		// - Georgia",
		// "GU - Guam", "HI - Hawaii", "IA - Iowa", "ID - Idaho", };

//				//"AS - American Samoa", "AZ - Arizona", "CA - California", "CO - Colorado", "CT - Connecticut",
//				"DC - District of Columbia", "DE - Delaware", "FL - Florida", "GA - Georgia", "GU - Guam",
//				"HI - Hawaii", "IA - Iowa", "ID - Idaho", "IL - Illinois", "IN - Indiana", "KS - Kansas",
//				"KY - Kentucky", "LA - Louisiana", "MA - Massachusetts", "MD - Maryland", "ME - Maine", "MI - Michigan",
//				"MN - Minnesota", "MO - Missouri", "MS - Mississippi", "MT - Montana", "NC - North Carolina",
//				"ND - North Dakota", "NE - Nebraska", "NH - New Hampshire", "NJ - New Jersey", "NM - New Mexico",
//				"NV - Nevada", "NY - New York", "OH - Ohio", "OK - Oklahoma", "OR - Oregon", "PA - Pennsylvania",
//				"PR - Puerto Rico", "RI - Rhode Island", "SC - South Carolina", "SD - South Dakota", "TN - Tennessee",
//				"TX - Texas", "UT - Utah", "VA - Virginia", "VI - Virgin Islands", "VT - Vermont", "WA - Washington",
//				"WI - Wisconsin", "WV - West Virginia", "WY - Wyoming", "Afghanistan", "Albania", "Algeria", "Andorra",
		// "Angola", "Anguilla", "aduhaufhuadfh"
		String C[] = { "vidya", "three", "four", "five", "six", "seven", "eight", "nine", "singh", "ten", "eleven",
				"tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen" };
		String D[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R" };
//			{ "Ashmore and Cartier Island", "Australia", "Austria", "Azerbaijan", "AL - Alabama",
//				"AR - Arkansas", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcaim Islands", "Poland",
//				"Portugal", "FL - Florida", "GA - Georgia", "GU - Guam", "HI - Hawaii", "PSA", "Datanetworks", "Java",
//				"DOn" };
//				"Snehal", "Bhimaji", "Prashant", "yash", "mad", "upad", "test", "ededed", "wewewe", "apple",
//				"announce", "five", "t20", "hi", "sdsd", "xvcv", "Aditya", "Suruchi", "wqw", "2", "Snehal", "Bhimaji",
//				"Prashant", "yash", "mad", "upad", "test", "ededed", "wewewe", "sahib", "urvi", "nikhil", "rohan",
//				"akhil", "prithvi", "taher", "qasim", "Afghanistan", "Albania", "Algeria", "American Samoa", "Angola",
//				"Anguilla", "Antartica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba",
//				"Ashmore and Cartier Island", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
//				"Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
//				"Bosnia and Herzegovina", "Botswana", "Brazil", "British Virgin Islands", "Brunei", "Bulgaria",
//				"Burkina Faso", "Burma", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands",
//				"Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Clipperton Island",
//				"Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo, Democratic Republic",
//				"Congo, Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus",
//				"Czeck Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt",
//				"El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Europa Island",
//				"Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia",
//				"Antarctic Lands", "Gabon", "Gambia, The", "Gaza Strip", "Georgia", "Germany", "Ghana", "Gibraltar",
//				"Glorioso Islands", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey",
//				"Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island", "Holy See (Vatican City)", "Honduras",
//				"Hong Kong", "Howland Island", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland",
//				"Ireland, Northern", "Israel", "Italy", "Jamaica", "Jan Mayen", "Japan", "Jarvis Island", "Jersey",
//				"Johnston Atoll", "Jordan", "Juan de Nova Island", "Kazakhstan", "Kenya", "Kiribati", "Korea, North",
//				"Korea" };
		String E[] = { "United Arab Emirates", "United Kingdom", "Uruguay", "USA", "Uzbekistan", "Vanuatu", "Venezuela",
				"Vietnam", "Virgin Islands", "Wales", "Wallis and Futuna", "West Bank", "Western Sahara", "Yemen",
				"Yugoslavia", "Zambia", "Zimbabwe", "OR - Oregon", "PA - Pennsylvania", "PR - Puerto Rico",
				"RI - Rhode Island", "SC - South Carolina", "SD - South Dakota", "TN - Tennessee", "TX - Texas",
				"UT - Utah", "VA - Virginia", "VI - Virgin Islands", "VT - Vermont", "WA - Washington",
				"WI - Wisconsin", "WV - West Virginia", "WY - Wyoming", "Afghanistan", "Albania", "Algeria", "Andorra",
				"Angola", "Anguilla", "kalra", "patil", "jpshi", "dsd", "err", "Snehal", "Bhimaji", "Prashant", "yash",
				"mad", "upad", "test", "ededed", "wewewe", "nikhil", "rohan", "akhil", "prithvi", "taher", "qasim",
				"Burkina Faso", "Burma", "Burundi", "Cambodia", "Cameroon", "Canada", "Nebraska,", "Nevada,",
				"New Hampshire,", "New Jersey,", "New Mexico,", "Ashmore and Cartier Island", "Australia", "Austria",
				"Azerbaijan", "AL - Alabama", "AZ - Arizona",

				"WI - Wisconsin", "WV - West Virginia", "Andheri", "Malad" };
		String F[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34",
				"35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51",
				"52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68",
				"69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85",
				"86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" };
		String G[] = { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114",
				"115", "116", "117", "118", "119", "200", "221", "222", "223", "224", "225", "226", "227", "228", "229",
				"230", "331", "332", "333", "334", "335", "336", "337", "338", "339", "400", "441", "442", "443", "444",
				"445", "446", "447", "448", "449", "500", "551", "552", "553", "554", "555", "556", "557", "558", "559",
				"660", "661", "662", "663", "664", "665", "666", "667", "668", "669", "700", "771", "772", "773", "774",
				"775", "776", "777", "778", "779", "800", "881", "882", "883", "884", "885", "886", "887", "888", "889",
				"900", "991", "992", "993", "994", "995", "996", "997", "998", "999", "1001", "1002", "1003", "1004",
				"1005", "1006", "1007", "1008", "1009", "1010", "1011", "1012", "1013", "1014", "1015", "1016", "1017",
				"1018", "1019", "1020", "1021", "1022", "1023", "1024", "1025", "1026", "1027", "1028", "1029", "1030",
				"1031", "1032", "1033", "1034", "1035", "1036", "1037", "1038", "1039", "1040", "1041", "1042", "1043",
				"1044", "1045", "1046", "1047", "1048", "1049", "1050", "1051", "1052", "1053", "1054", "1055", "1056",
				"1057", "1058", "1059", "1060", "1061", "1062", "1063", "1064", "1065", "1066", "1067", "1068", "1069",
				"1070", "1071", "1072", "1073", "1074", "1075", "1076", "1077", "1078", "1079", "1080", "1081", "1082",
				"1083", "1084", "1085", "1086", "1087", "1088", "1089", "1090", "1091", "1092", "1093", "1094", "1095",
				"1096", "1097", "1098", "1099", "1100", "1101", "1102", "1103", "1104", "1105", "1106", "1107", "1108",
				"1109", "1110", "1111", "1112", "1113", "1114", "1115", "1116", "1117", "1118", "1119", "1120", "1121",
				"1122", "1123", "1124", "1125", "1126", "1127", "1128", "1129", "1130", "1131", "1132", "1133", "1134",
				"1135", "1136", "1137", "1138", "1139", "1140", "1141", "1142" };
		String H[] = { "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000",
				"2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001",
				"20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002",
				"2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004",
				"2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008",
				"2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
				"2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001",
				"2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "3000", "3001", "3002", "3003",
				"3004", "3005", "3006", "3007", "3008", "3009", "3010", "4000", "4001", "4002", "4003", "4004", "4005",
				"4006", "4007", "4008", "4009", "4010", "5000", "5001", "5002", "5003", "5004", "5005", "5006", "5007",
				"5008", "5009", "5010", "6000", "6001", "6002", "6003", "6004", "6005", "6006", "6007", "6008", "6009",
				"6010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000",
				"2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001",
				"20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002",
				"2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004",
				"2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008",
				"2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
				"2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001",
				"2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "3000", "3001", "3002", "3003",
				"3004", "3005", "3006", "3007", "3008", "3009", "3010", "4000", "4001", "4002", "4003", "4004", "4005",
				"4006", "4007", "4008", "4009", "4010", "5000", "5001", "5002", "5003", "5004", "5005", "5006", "5007",
				"5008", "5009", "5010", "6000", "6001", "6002", "6003", "6004", "6005", "6006", "6007", "6008", "6009",
				"6010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000",
				"2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001",
				"20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002",
				"2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004",
				"2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008",
				"2009", "2010", "2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
				"2000", "2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2000", "2001",
				"2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "3000", "3001", "3002", "3003",
				"3004", "3005", "3006", "3007", "3008", "3009", "3010", "4000", "4001", "4002", "4003", "4004", "4005",
				"4006", "4007", "4008", "4009", "4010", "5000", "5001", "5002", "5003", "5004", "5005", "5006", "5007",
				"5008", "5009", "5010", "6000", "6001", "6002", "6003", "6004", "6005", "6006", "6007", "6008", "6009",
				"6010", "4006", "4007", "4008", "4009", "4010", "5000", "5001", "5002", "5003", "5004", "5005", "5006",
				"5007", "5008", "5009", "5010", "6000", "6001", "6002", "6003", "6004", "6005", "6006", "6007", "6008",
				"6009", "6010", "4006", "4007", "4008", "4009", "4010", "5000", "5001", "5002", "5003", "5004", "5005",
				"5006", "5007", "5008", "6009", "6010", "4006", "6009", "6010", "4006", "6009", "6010", "4006", "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
				"37", "38", "39", "40", "41", "42" };
		System.out.println(A.length);
		System.out.println(B.length);
		System.out.println(C.length);
		System.out.println(D.length);
		System.out.println(E.length);
		System.out.println(F.length);
		System.out.println(H.length);
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 1 Linear Probe");

		c1 = A.length;
		double x = (double) c1 / table.arraySize;
		if (x >= 0.1) {
			table.Resize();
		}
		long t1 = System.nanoTime();
		for (int i = 0; i < A.length; i++) {

			table.insert1(A[i]);
			c1++;

		}
		long t2 = System.nanoTime();
		long u1 = System.nanoTime();
		table.find("announce");
		long u2 = System.nanoTime();
		long U1 = u2 - u1;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 1 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U1);
		System.out.println("\n Given Array:" + A);
		System.out.println(HashTable.total);

		long T1 = t2 - t1;

		System.out.println("\nTotal Time for insertion:" + T1);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);
		System.out.println(c1);
		System.out.println("Updated Array Size:" + table.arraySize);
		table.displayTable();

		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 2 Linear Probe");
		c1 = B.length;
		double x1 = (double) c1 / table.arraySize;
		if (x1 >= 0.2) {
			table.Resize();
		}
		long t3 = System.nanoTime();
		for (int i = 0; i < B.length; i++) {
			table.insert1(B[i]);
			c1++;

		}
		long t4 = System.nanoTime();
		long u3 = System.nanoTime();
		table.find("varun");
		long u4 = System.nanoTime();
		long U2 = u4 - u3;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 2 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U2);

		long T2 = t4 - t3;

		System.out.println("\nTotal Time for insertion:" + T2);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);
		System.out.println("Updated Array Size:" + table.arraySize);

		System.out.println(c1);
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 3 Linear Probe");
		c1 = C.length;
		double x2 = (double) c1 / table.arraySize;
		if (x2 >= 0.3) {
			table.Resize();
		}
		long t5 = System.nanoTime();
		for (int i = 0; i < C.length; i++) {
			table.insert1(C[i]);
			c1++;

		}
		long t6 = System.nanoTime();
		long u5 = System.nanoTime();
		table.find("fourteen");
		long u6 = System.nanoTime();
		long U3 = u6 - u5;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 3 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U3);

		long T3 = t6 - t5;

		System.out.println("\nTotal Time for insertion:" + T3);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);

		System.out.println(c1);
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 4 Linear Probe");
		c1 = D.length;
		double x3 = (double) c1 / table.arraySize;
		if (x3 >= 0.4) {
			table.Resize();
		}
		long t7 = System.nanoTime();
		for (int i = 0; i < D.length; i++) {
			table.insert1(D[i]);
			c1++;

		}
		long t8 = System.nanoTime();
		long u7 = System.nanoTime();
		table.find("D");
		long u8 = System.nanoTime();
		long U4 = u8 - u7;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 4 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U4);

		long T4 = t8 - t7;

		System.out.println("\nTotal Time for insertion:" + T4);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);
		System.out.println("Updated Array Size:" + table.arraySize);

		System.out.println(c1);
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 5 Linear Probe");
		c1 = E.length;
		double x4 = (double) c1 / table.arraySize;
		if (x4 >= 0.5) {
			table.Resize();
		}
		long t9 = System.nanoTime();
		for (int i = 0; i < E.length; i++) {
			table.insert1(E[i]);
			c1++;

		}
		long t10 = System.nanoTime();
		long u9 = System.nanoTime();
		table.find("WV - West Virginia");
		long u10 = System.nanoTime();
		long U5 = u10 - u9;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 5 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U5);

		long T5 = t10 - t9;

		System.out.println("\nTotal Time for insertion:" + T5);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);
		System.out.println("Updated Array Size:" + table.arraySize);
		System.out.println(c1);

		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 6 Linear Probe");
		c1 = F.length;
		double x5 = (double) c1 / table.arraySize;
		if (x5 >= 0.6) {
			table.Resize();
		}
		System.out.println(x5);
		long t11 = System.nanoTime();
		for (int i = 0; i < F.length; i++) {
			table.insert1(F[i]);
			c1++;

		}
		long t12 = System.nanoTime();
		long u11 = System.nanoTime();
		table.find("44");
		long u12 = System.nanoTime();
		long U6 = u12 - u11;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 6 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U6);

		long T6 = t12 - t11;

		System.out.println("\nTotal Time for insertion:" + T6);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);
		System.out.println("Updated Array Size:" + table.arraySize);
		System.out.println(c1);
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 7 Linear Probe");
		System.out.println(G.length);
		c1 = G.length;
		double x6 = (double) c1 / table.arraySize;
		if (x6 >= 0.75) {
			table.Resize();
		}
		long t13 = System.nanoTime();
		for (int i = 0; i < G.length; i++) {
			table.insert1(G[i]);
			c1++;

		}
		long t14 = System.nanoTime();
		long u13 = System.nanoTime();
		table.find("1077");
		long u14 = System.nanoTime();
		long U7 = u14 - u13;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 7 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U7);

		long T7 = t14 - t13;

		System.out.println("\nTotal Time for insertion:" + T7);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);
		System.out.println("Updated Array Size:" + table.arraySize);
		System.out.println(c1);
		table.displayTable();
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 8 Linear Probe");
		System.out.println(H.length);
		c1 = H.length;
		double x7 = (double) c1 / table.arraySize;
		if (x7 >= 0.8) {
			table.Resize();
		}
		long t15 = System.nanoTime();
		for (int i = 0; i < G.length; i++) {
			table.insert1(G[i]);
			c1++;

		}
		long t16 = System.nanoTime();
		long u15 = System.nanoTime();
		table.find("1077");
		long u16 = System.nanoTime();
		long U8 = u16 - u15;
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 8 Linear Probe");
		System.out.println("\nTotal Time for finding:" + U8);

		long T8 = t16 - t15;

		System.out.println("\nTotal Time for insertion:" + T8);
		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("Number of elements with 0 probe:" + HashTable.total);
		System.out.println("Updated Array Size:" + table.arraySize);
		System.out.println(c1);
		table.displayTable();
	}

}
