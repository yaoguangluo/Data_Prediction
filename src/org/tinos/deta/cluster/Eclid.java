package org.tinos.deta.cluster;
import java.util.Iterator;
import java.util.List;
//Theory: Eclid
//Application: Yaoguang.luo
public class Eclid{
	public static Position2D findHeartPosition2D(List<Position2D> List) {
		Iterator<Position2D> iterator= List.iterator();
		double sumOfX= 0;
		double sumOfY= 0;
		while(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			sumOfX+= position2D.getX();
			sumOfY+= position2D.getY();
		}
		Position2D position2D= new Position2D();
		position2D.setX(sumOfX/ List.size());
		position2D.setY(sumOfY/ List.size());
		return position2D;
	}
	
	public static Position2D findCryptionPosition2D(Position2D heart, Position2D oneMore) {
		Position2D position2D= new Position2D();
		position2D.setX((heart.getX()+ oneMore.getX())/ 2);
		position2D.setY((heart.getY()+ oneMore.getY())/ 2);
		return position2D;
	}
	
	public static Position3D findHeartPosition3D(List<Position3D> List) {
		Iterator<Position3D> iterator= List.iterator();
		double sumOfX= 0;
		double sumOfY= 0;
		double sumOfZ= 0;
		while(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			sumOfX+= position3D.getX();
			sumOfY+= position3D.getY();
			sumOfZ+= position3D.getZ();
		}
		Position3D position3D= new Position3D();
		position3D.setX(sumOfX/ List.size());
		position3D.setY(sumOfY/ List.size());
		position3D.setZ(sumOfZ/ List.size());
		return position3D;
	}
	
	public static Position3D findCryptionPosition3D(Position3D heart, Position3D oneMore) {
		Position3D position3D= new Position3D();
		position3D.setX((heart.getX()+ oneMore.getX())/ 2);
		position3D.setY((heart.getY()+ oneMore.getY())/ 2);
		position3D.setZ((heart.getZ()+ oneMore.getZ())/ 2);
		return position3D;
	}
}