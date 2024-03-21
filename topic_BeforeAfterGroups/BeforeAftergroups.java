package topic_BeforeAfterGroups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class BeforeAftergroups {
 
@BeforeGroups("security") 
public void setupSecurity() {
	System.out.println("setupSecurity");
	 
 }
 @AfterGroups("security")
 public void tearDownSecurity() {
	 System.out.println("tearDownSecurity");
	 
 }
 @BeforeGroups("db")
 public void setupDB() {
	 System.out.println("setupDB");
 }
 @AfterGroups("db")
 public void tearDownDB() {
	 System.out.println("tearDownDB");
 }
 @BeforeGroups("ui")
 public void setupUI() {
	 System.out.println("setupUI");
 }
 @AfterGroups("ui")
 public void tearDownUI() {
	 System.out.println("tearDownUI");
 }
 
 @Test(groups="ui")
 public void accessHomePage() {
	  System.out.println("accessHomePage");
 }
 @Test(groups="ui")
 public void accessContactPage() {
	  System.out.println("accessContactPage");
 }
 @Test(groups="ui")
 public void accesscompaingnPage() {
	  System.out.println("accesscompaingnPage");
 }
 
 @Test(groups="db")
 public void testInsert() {
	  System.out.println("testInsert");
 }
 @Test(groups="db")
 public void testUpdate() {
	  System.out.println("testUpdate");
 }
 @Test(groups="db")
 public void testDelete() {
	  System.out.println("testDelete");
 }
 @Test(groups="security")
 public void openFileDialog() {
	  System.out.println("openFileDialog");
	  }
 @Test(groups="security")
 public void openCongirmationDialog() {
	  System.out.println("openCongirmationDialog");
 }
 @Test(groups="security")
 public void closeFileDialog() {
	  System.out.println("closeFileDialog");
 }

 }
