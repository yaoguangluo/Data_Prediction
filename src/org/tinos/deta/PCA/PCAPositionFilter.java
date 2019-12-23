package org.tinos.deta.PCA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tinos.deta.basic.Distance;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
//这个函数用于坐标类的 主要成份分析与提取
//思想：欧基里德 平面，立体几何
//实现：罗瑶光
public class PCAPositionFilter{
	public static List<Position2D> filterPosition2DsWithScaledDistance(List<Position2D> input
			, Position2D heart, double scaleDistacne){
		List<Position2D> output= new ArrayList<>();
		Iterator<Position2D> iterator= input.iterator();
		while(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			double distance= Distance.getDistance2D(heart, position2D);
			if(distance< scaleDistacne) {
				output.add(position2D);
			}
		}
		return output;
	}

	public static List<Position3D> filterPosition3DsWithScaledDistance(List<Position3D> input
			, Position3D heart, double scaleDistacne){
		List<Position3D> output= new ArrayList<>();
		Iterator<Position3D> iterator= input.iterator();
		while(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			double distance= Distance.getDistance3D(heart, position3D);
			if(distance< scaleDistacne) {
				output.add(position3D);
			}
		}
		return output;
	}
}