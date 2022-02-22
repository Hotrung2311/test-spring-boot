package com.example.projectrmiweb.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIService extends Remote {
    double plus2Number(double a, double b) throws RemoteException;
    double minus2Number(double a, double b) throws RemoteException;
    double multiple2Number(double a, double b) throws RemoteException;
    double divide2Number(double a, double b) throws Exception;
    String server_ping() throws RemoteException;
}
