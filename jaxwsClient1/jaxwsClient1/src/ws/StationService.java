/**
 * StationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

import java.util.Date;
import java.util.List;

public interface StationService extends java.rmi.Remote {
    public java.lang.String message() throws java.rmi.RemoteException;
    public List<Double> retournerPrix(java.lang.String nom_station, Date date) throws java.rmi.RemoteException;
    public void addStation(int id_station, java.lang.String nom, java.lang.String ville, java.lang.String adresse) throws java.rmi.RemoteException;
    public void addCarburant(java.lang.Long id_carburant, java.lang.String nom, java.lang.String description) throws java.rmi.RemoteException;
    public ws.Carburant[] getAllCarburant() throws java.rmi.RemoteException;
    public ws.Station[] lister() throws java.rmi.RemoteException;
    public double retourner(java.lang.String arg0, java.util.Calendar arg1) throws java.rmi.RemoteException;
    public ws.Station[] getAllStation() throws java.rmi.RemoteException;
}
