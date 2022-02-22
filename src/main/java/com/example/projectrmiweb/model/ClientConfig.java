package com.example.projectrmiweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientConfig {
    private String host;
    private int port;
    private String path = "Task create successfully.";

//    public RMIService serviceLookup() throws NotBoundException, RemoteException {
//        Registry registry = LocateRegistry.getRegistry(host, port);
//        RMIService service = (RMIService) registry
//                .lookup(RMIService.class.getSimpleName());
//        return service;
//    }
}
