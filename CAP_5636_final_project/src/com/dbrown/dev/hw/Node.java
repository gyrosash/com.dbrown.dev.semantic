package com.dbrown.dev.hw;

import java.util.ArrayList;


public class Node{
	int current;
	ArrayList<Connect> connectsOut=new ArrayList<Connect>();
	ArrayList<Connect> connectsIn=new ArrayList<Connect>();
	String name;
	public Node(){
		
	}
	
	public Node(String n){
		current = 0;
		name = n;
		//REPLACE WITH ARRAY LIST
		//connections = new Connect[MAX];
		
		
	}
	
	
	public void makeConnectOut(Node n, String s){
		Connect c = new Connect(n, s);
		connectsOut.add(c);
		current++;
	}
	
	public void makeConnectIn(String n, Node ne, String s){
		Connect c = new Connect(n,ne,s);
		connectsOut.add(c);
		current++;
	}
	
	public void printConnections(){
		System.out.println("PRINTING NETWORK ****DEBUG****");
		for(int i = 0; i<current; i++){
			
			System.out.println(name +" "+ connectsOut.get(i).type +" "+ connectsOut.get(i).result.name);
			
			
		}
	}

}
