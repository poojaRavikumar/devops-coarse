package com.company;

		import java.io.File;
		import java.util.ArrayList;
		import java.util.List;
import java.util.Scanner;

		public  class SearchFile {

	   private String fileNameToSearch;
		  
		  private List<String> result = new ArrayList<String>();

		  public String getFileNameToSearch() {
			return fileNameToSearch;
		  }

		  public void setFileNameToSearch(String fileNameToSearch) {
			this.fileNameToSearch = fileNameToSearch;
		  }

		  public List<String> getResult() {
			return result;
		  }

		  public void SFile() {

			SearchFile SF = new SearchFile();

		      Scanner s=new Scanner(System.in);
		      System.out.println("enter the directory path");
		      String fdir=s.next();
		      System.out.println("enter the file in specified directory");
		      String fSearch=s.next();
			SF.searchDirectory(new File(fdir),fSearch);

			int count = SF.getResult().size();
			if(count ==0){
			    System.out.println("\nNo result found!");
			}else{
			    System.out.println("\nFound " + count + " result!\n");
			    for (String matched : SF.getResult()){
				System.out.println("Found : " + matched);
			    }
			}
		  }

		  public void searchDirectory(File directory, String fileNameToSearch) {

			setFileNameToSearch(fileNameToSearch);

			if (directory.isDirectory()) {
			    search(directory);
			} else {
			    System.out.println(directory.getAbsoluteFile() + " is not a directory!");
			}

		  }

		  private void search(File file) {

			if (file.isDirectory()) {
			  System.out.println("Searching directory ... " + file.getAbsoluteFile());

		            
			    if (file.canRead()) {
				for (File temp : file.listFiles()) {
				    if (temp.isDirectory()) {
					search(temp);
				    } else {
					if (getFileNameToSearch().equals(temp.getName().toLowerCase())) {
					    result.add(temp.getAbsoluteFile().toString());
				    }

				}
			    }

			 } else {
				System.out.println(file.getAbsoluteFile() + "Permission Denied");
			 }
		      }

		  }

		}