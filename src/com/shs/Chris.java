// If you're reading this Wednesday night, Mr. Eckstein, I apologize for waiting so many extra weeks to do the APCS 1 & APCS 2 assignments. Thank you for your forgiveness with that, and I promise I'll do my best to stay up to date on the projects for the rest of the year.

package com.shs;
// Repl says it wants src.com.shs, not com.shs
// Also unsure why this is, will check on IntelliJ Thursday, then ask Mr. Eckstein

public class Chris {

  
  public String firstName;
  public String lastName;
  public String faithStatement;
  public int age;

  public Chris(String firstName, String lastName, String faithStatement, int age) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.faithStatement = faithStatement;
    this.age = age;
    
  }

  public void ChrisP() {
    firstName = "Christopher";
    lastName = "Portinga";
    faithStatement = "Jesus Christ is the risen Lord and Savior, offering salvation and eternal life free from guilt of sin to all who believe in His name";
    age = 18;
    
  }
  
}