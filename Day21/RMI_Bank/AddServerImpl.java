import java.rmi.*;
import java.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
public AddServerImpl() throws RemoteException{}
double amt=10000;
public double withdraw(double d1) throws RemoteException
{
	amt=amt-d1;
return(amt-d1);
}
public double balanceCheck() throws RemoteException
{
	return amt;
}

}