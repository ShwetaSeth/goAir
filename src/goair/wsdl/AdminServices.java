package goair.wsdl;

import goair.model.booking.Booking;
import goair.model.customer.Customer;
import goair.model.employee.Employee;
import goair.model.flight.Flight;
import goair.util.SearchParametersForCustomers;
import goair.util.SearchParametersForEmployees;
import goair.util.SearchParametersForFlights;

public class AdminServices {
	
	//When you login as admin you see following hyper links
	// 1. Search flight - when you get a searched flight you get option to edit / delete it.
	// 2. View all flights - when you view a flight you get option to edit / delete it.
	// 3. Add a flight
	
	// 4. Search customer - when you get a searched customer you get option to edit / delete it.
	// 5. View all passengers - when you view a customer you get option to edit / delete it.
	// 6. Add a customer 
	
	// 7. Search employee - when you get a searched employee you get option to edit / delete it.
	// 8. View all employee - when you view a employee you get option to edit / delete it.
	// 9. Add a employee 
	
	// 10. View all the bookings.
	// 11. Search bookings.
	
	// View flight page which will have flight details with availability.
	// View customer page which will have customer details with booking history and all.
	// View employee page which will have employee details with profile and what all the flights
			// he/she is serving with histories.
	

	/**
	 * Search flights - This method searches all the flights with a given criteria
	 * @return Flight[] -  Return list of flights
	 *  
	 */
	public Flight[] searchFlights(SearchParametersForFlights searchParameters)
	{
		return null;
	}
	
	/**
	 * Get all the flights in the system
	 * @return Flight[] - Return list of all the flights
	 */
	public Flight[] getFlights()
	{
		return null;
	}
	
	/**
	 * Add a new flight to the system
	 * @param flight
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int addFlight(Flight flight)
	{
		return -1;
	}
	
	/**
	 * Edit flight to the system
	 * @param flight
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int editFlight(Flight flight)
	{
		return -1;
	}
	

	/**
	 * Delete flight to the system
	 * @param flight
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int deleteFlight(Flight flight)
	{
		return -1;
	}
	
	/**
	 * Search Customers - This method searches all the Customer with a given criteria
	 * @return Customer[] - Return list of Customers.
	 *  
	 */
	public Customer[] searchCustomers(SearchParametersForCustomers searchParameters)
	{
		return null;
	}
	
	/**
	 * Get all the Customers in the system
	 * @return Customer[] - Return list of all the Customers
	 */
	public Customer[] getCustomers()
	{
		return null;
	}
	
	/**
	 * Add a new Customer to the system
	 * @param Customer
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int addCustomer(Customer customer)
	{
		return -1;
	}
	
	/**
	 * Edit Customer to the system
	 * @param Customer
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int editCustomer(Customer customer)
	{
		return -1;
	}
	
	/**
	 * Delete Customer to the system
	 * @param Customer
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int deleteCustomer(Customer customer)
	{
		return -1;
	}
	
	/**
	 * Search Employee - This method searches all the Employee with a given criteria
	 * @return Employee[] - Return list of Employee.
	 *  
	 */
	public Employee[] searchEmployees(SearchParametersForEmployees searchParameters)
	{
		return null;
	}
	
	/**
	 * Get all the Employees in the system
	 * @return Customer[] - Return list of all the Employees
	 */
	public Employee[] getEmployees()
	{
		return null;
	}
	
	/**
	 * Add a new Employee to the system
	 * @param Employee
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int addEmployee(Employee employee)
	{
		return -1;
	}
	
	/**
	 * Edit Employee to the system
	 * @param Employee
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int editEmployee(Employee employee)
	{
		return -1;
	}
	
	/**
	 * Delete Employee to the system
	 * @param Employee
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int deleteEmployee(Employee employee)
	{
		return -1;
	}
	
	/**
	 * Search Booking - This method searches all the Booking with a given criteria
	 * @return Booking[] - Return list of Booking.
	 *  
	 */
	public Booking[] searchBookings(SearchParametersForEmployees searchParameters)
	{
		return null;
	}
	
	/**
	 * Get all the Booking in the system
	 * @return Booking[] - Return list of all the Bookings
	 */
	public Booking[] getBookings()
	{
		return null;
	}
	
	/**
	 * Edit Booking to the system
	 * @param Booking
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int editBooking(Booking booking)
	{
		return -1;
	}
	
	/**
	 * Delete Booking to the system
	 * @param Booking
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int deleteBooking(Booking booking)
	{
		return -1;
	}
}
