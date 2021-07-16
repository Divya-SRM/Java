import java.rmi.*;
public interface AddServerIntf extends Remote
{
double withdraw(double d1)throws RemoteException;
double balanceCheck() throws RemoteException;
}