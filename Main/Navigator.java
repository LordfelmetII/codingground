package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
//E, F, C, S, 3.69
public class Navigator {
	List<String> road = new ArrayList<String>();
	Map<String, Integer> mapA = new HashMap<String, Integer>();
	String commaSpace = ", ", i, s ; int d = 0;
	public StringBuilder sb = new StringBuilder();
	private StringBuilder append;
	{
		
		road.add("A");
		road.add("B");
		road.add("C");
		road.add("D");
		road.add("E");
		road.add("F");
		road.add("G");
		mapA.put("AB", 450);
		mapA.put("BC", 140);
		mapA.put("CD", 120);
		mapA.put("DE", 320);
		mapA.put("EF", 250);
		mapA.put("FG", 80);
	}
	public Navigator(String start, String end, double milesPerGallon, double milesPerHour, double fuelCost){
		for (ListIterator<String> it = road.listIterator(0); it.hasNext(); ) {
			i = (String) it.next();
			if( i.equals(start)){
				while(!i.equals(end)){
					s = i;
					i = (String) it.next();
					d = d + mapA.get(s+i);
				}
				sb.append(d + commaSpace);
				double t = d/milesPerHour;
				int intt = (int) (d/milesPerHour);
				double remainder = t - intt;
				int sec = (int) (remainder*60);
				
				String time = (intt +":"+sec);
				if(intt<10){
					time = "0"+time;
				}
				sb.append(time + commaSpace);
				double money = ((d/milesPerGallon)*fuelCost);
				sb.append("$");
				sb.append(new BigDecimal(money).setScale(2, RoundingMode.HALF_UP).doubleValue());
				System.out.println(sb.toString());
				break;
			}
		}
		
		
	}
	

}


