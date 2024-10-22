package cs131.pa3.CarsTunnels;

import java.util.LinkedList;

import cs131.pa3.Abstract.Tunnel;
import cs131.pa3.Abstract.Vehicle;

/**
 * 
 * The class for the Basic Tunnel, extending Tunnel.
 * @author cs131a
 *
 */
public class BasicTunnel extends Tunnel{

	private LinkedList<Vehicle> tunnel; 
	
	/**
	 * Creates a new instance of a basic tunnel with the given name
	 * @param name the name of the basic tunnel
	 */
	public BasicTunnel(String name) {
		super(name);
		this.tunnel = new LinkedList<Vehicle>(); 
	}

	@Override
	protected synchronized boolean tryToEnterInner(Vehicle vehicle) {
		if (this.tunnel.isEmpty()) {
			this.tunnel.add(vehicle);
			return true;
		} else if ((vehicle instanceof Car && this.tunnel.get(0) instanceof Car ) && this.tunnel.size() < 3 ) {
			if (this.tunnel.get(0).getDirection() == vehicle.getDirection()) {
				this.tunnel.add(vehicle);
				return true;				
			} else {
				return false;
			}
		} else if(vehicle instanceof Sled && this.tunnel.size() < 1) {
			this.tunnel.add(vehicle);
			return true;
		}
		return false;
	}

	@Override
	protected synchronized void exitTunnelInner(Vehicle vehicle) {
		if (!this.tunnel.isEmpty() && this.tunnel.contains(vehicle)) {
			this.tunnel.remove(vehicle);			
		}
	}
	
}
