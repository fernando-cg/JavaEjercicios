package Youtubers;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class prueba {

	public static void main(String[] args) {

	    String a[] = {"express","normal","normal","alto","express","express","normal","alto","alto","express"};
	    for (int x = 0; x < a.length; x++) {
	        for (int i = 0; i < a.length; i++) {
	            if((!a[x].equalsIgnoreCase("normal")) && a[i].equalsIgnoreCase("normal")&& (!a[x].equalsIgnoreCase(a[i]))){
	                String tmp = a[x];
	                a[x] = a[i];
	                a[i] = tmp;
	            }
	            if((!a[x].equalsIgnoreCase("alto")) && a[i].equalsIgnoreCase("alto")&& (!a[x].equalsIgnoreCase(a[i])) && (!a[x].equalsIgnoreCase("normal"))){
	                String tmp = a[x];
	                a[x] = a[i];
	                a[i] = tmp;
	            }
	            if((!a[x].equalsIgnoreCase("express")) && a[i].equalsIgnoreCase("express")&& (!a[x].equalsIgnoreCase(a[i])) && (!a[x].equalsIgnoreCase("normal")) && (!a[x].equalsIgnoreCase("alto"))){
	                String tmp = a[x];
	                a[x] = a[i];
	                a[i] = tmp;
	            }
	        }
	    }
	}
}
