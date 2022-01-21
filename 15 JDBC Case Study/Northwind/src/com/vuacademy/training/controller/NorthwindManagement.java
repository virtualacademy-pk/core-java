package com.vuacademy.training.controller;

import java.util.List;

import com.vuacademy.training.model.*;
import com.vuacademy.training.service.*;

public class NorthwindManagement {
	public static void main(String args[]) throws Exception{
		CategoryService cs = new CategoryService();
		cs.deleteCategory(9); 
	}
}
