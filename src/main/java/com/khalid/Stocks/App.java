package com.khalid.Stocks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 * 
 * 1. create an array of stock object with size 10000 items (stock object : min
 * price, max price) 
 * 2. fill the array with random values 
 * 3. min diff for the
 * stock in the whole period (index) 
 * 4. max diff for the 
 * 5. verify results
 *
 */
public class App {
	public static void main(String[] args) {
		
		System.out.println("Application Started...");
		
		try {
			BufferedReader br= new BufferedReader(new FileReader("stocks.csv"));
			String line;
			String[] prices= null;
			while((line=br.readLine()) != null){
				prices= line.split(",");
			}
			
			List<Stocks> stocks= new ArrayList<Stocks>();
			
			for(int i=0; i<10; i++){
				stocks.add(new Stocks());
			}
			
			int i=0;
			for (Stocks stocks2 : stocks) {
				stocks2.setMinPrice(Integer.parseInt(prices[i++]));
				stocks2.setMaxPrice(Integer.parseInt(prices[i++]));
			}
			
			System.out.println("printing the array");
			for (Stocks stock : stocks) {
				System.out.println(stock.toString());
			}
			
			int minDiff= stocks.get(0).getMaxPrice()- stocks.get(0).getMinPrice();
			int maxDiff= stocks.get(0).getMaxPrice()- stocks.get(0).getMinPrice();
			
			System.out.println("Finding the min and max diff");
			int diff=0, j=0, minIndex=0, maxIndex=0;
			for (Stocks stocks2 : stocks) {
				diff= stocks2.getMaxPrice()- stocks2.getMinPrice();
				if(diff < minDiff){
					minDiff= diff;
					minIndex= j;
				}
				
				if(diff > maxDiff){
					maxDiff= diff;
					maxIndex= j;
				}
				
				j++;

			}
			
			System.out.println("Min Diff= "+minDiff+" index: "+minIndex);
			System.out.println("Max Diff= "+maxDiff+" index:"+maxIndex);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Application Ended...");
	}
}
