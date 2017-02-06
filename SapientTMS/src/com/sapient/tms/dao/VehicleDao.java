package com.sapient.tms.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sapient.tms.bean.Vehicle;

public interface VehicleDao {
	public Vehicle search(int id) throws SQLException, ClassNotFoundException;
	public boolean insert(Vehicle v) throws SQLException, ClassNotFoundException, IOException;
	public boolean delete(Vehicle v) throws SQLException, ClassNotFoundException;
	public ArrayList<Vehicle> displayAll() throws SQLException, ClassNotFoundException;
	

}
