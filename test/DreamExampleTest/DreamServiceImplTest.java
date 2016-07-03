package DreamExampleTest;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import carExample.AirCraft;
import carExample.Automotive;
import carExample.Car;
import carExample.Corvette;
import carExample.JamesBondSpyCar;
import carExample.SpyCar;
import carExample.Vehicle;
import carExample.VehicleImpl;
import DreamExample.Dream;


public class DreamServiceImplTest {

	@Test
	public void testFindNoDreams() {
		
		Dream mockDream = new Dream(0, 5);
		
		int results = Dream.findNoDreams(mockDream);
		
		assertEquals(6, results);
	}
	
	@Test
	public void testFindDreamWithoutDreams() {
		
		Dream mockDream = new Dream();
		
		Dream results = Dream.findDreamWithoutDreams(mockDream);
		
		assertNull(results.dreamObject);
	}
	
	public void example(){
		Scanner in = Vehicle.in;
		in = VehicleImpl.in;
		in = AirCraft.in;
		Vehicle vehicle = new VehicleImpl();
		
		vehicle.moved();
		
		vehicle = new Corvette();
		Automotive automotive = new Corvette();
		Car car = new Corvette();
		
		vehicle= car;
		automotive= car;
		Corvette corvette = new Corvette();
		car = corvette;

		vehicle = corvette;
		
		SpyCar jamesBondCar = new JamesBondSpyCar();
		
		jamesBondCar.moved();
	}
}
