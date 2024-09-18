package com.setOfPrograms;

import java.util.*;

public class Main

{

private static Map<String,List<Integer>> stockVolume = new HashMap<String,List<Integer>>();

public static void main(String[] args){

// We are adding the last 5 days traded volumes for each stock...
	

addStock("ONGC",new int[]{125504,227808,418706,518706,618706});

addStock("ICICI",new int[]{642675,505563,655457,555457,645457});

addStock("TCS",new int[]{314534,416543,213766,313766,237667});

addStock("HDFC",new int[]{161907,262122,359839,459839,379839});

System.out.println("Displaying the difference in daily volume for each stock...\n");

displayDifference("ONGC");

displayDifference("TCS");

displayDifference("HDFC");

displayDifference("ICICI");

System.out.println("Most traded stock : " + mostTradedStock());

}

// Level 1

static void addStock(String stock, int[] dailyVol)

{



}

// Level 2

static List<Double> dailyVolumeDifference(String code)

{

// Fix the bug here..

List<Double> perDifference = new ArrayList<Double>();

List<Integer> l = ((List<Integer>)stockVolume.get(code));

double prev = 0;

double curr = 0;

for(int i = 0; i < l.size()-1; ++i)

{

prev = l.get(i);

curr = l.get(i+1);

double difference = curr - prev;

perDifference.add(difference);

}

return perDifference;

}

// Level 3

static String mostTradedStock()

{

String code="";

// Write the logic here...

return code;

}

public static void displayDifference(String stock)

{

if(stockVolume.size()==0) return;

List<Double> volDifference = dailyVolumeDifference(stock);

System.out.println("Difference in volume for " + stock);

for(double d : volDifference)

{

Formatter f = new Formatter();

f.format("%5.2f",d);

System.out.print(f + "% ");

}

System.out.println("\n");
}
}