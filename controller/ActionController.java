package org.project.controller;

import java.util.Scanner;

import org.project.commend.*;

public class ActionController {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("�������� �Է��ϼ���");
			String query = scn.next();
			
			if(query.equals("insert")) {
				ActionInsert insert = new ActionInsert();
				insert.executeQuery();
			} else if(query.equals("select")) {
				ActionSelect select = new ActionSelect();
				select.executeQuery();
			} else if(query.equals("update")) {
				ActionUpdate update = new ActionUpdate();
				update.executeQuery();
			} else if(query.equals("delete")) {
				ActionDelete delete = new ActionDelete();
				delete.executeQuery();
			} else if(query.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	
		scn.close();
		
	}
}
