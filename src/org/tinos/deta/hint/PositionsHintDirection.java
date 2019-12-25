package org.tinos.deta.hint;
import java.util.Iterator;
import java.util.List;
import org.tinos.deta.basic.Euclid;
import org.tinos.deta.demension.Line2D;
import org.tinos.deta.demension.Line3D;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class PositionsHintDirection{
	//坐标集隐藏运动趋势预测算法。
	//这个函数适用于在坐标团中观测 中心 与重心的 长度 来预测坐标团的稳定状态和轨迹预判。
	//适用于 游戏，数据建模，化学，物理等领域。
	//思想：流体内部分子力 统计
	//实现：罗瑶光
	public static Line2D getHintDirectionTrendFromPosition2Ds(List<Position2D> inputs) {
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		Iterator<Position2D> iterator= inputs.iterator();
		if(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			xMax= position2D.getX();
			xMin= position2D.getX();
			yMax= position2D.getY();
			yMin= position2D.getY();
		}
		while(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			if(position2D.getX()> xMax) {
				xMax= position2D.getX();
			}
			if(position2D.getX()< xMin) {
				xMin= position2D.getX();
			}
			if(position2D.getY()> yMax) {
				yMax= position2D.getY();
			}
			if(position2D.getY()< yMin) {
				yMin= position2D.getY();
			}
		}
		Position2D mid= new Position2D();
		mid.setX((xMin+ xMax)/ 2);
		mid.setY((yMin+ yMax)/ 2);
		Position2D heart= Euclid.findHeartPosition2D(inputs);
		Line2D line2D= new Line2D();
		line2D.setBegin(mid);
		line2D.setEnd(heart);
		return line2D;	
	} 
	
	public static Line3D getHintDirectionTrendFromPosition3Ds(List<Position3D> inputs) {
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		double zMax= 0;
		double zMin= 0;
		Iterator<Position3D> iterator= inputs.iterator();
		if(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			xMax= position3D.getX();
			xMin= position3D.getX();
			yMax= position3D.getY();
			yMin= position3D.getY();
			zMax= position3D.getZ();
			zMin= position3D.getZ();
		}
		while(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			if(position3D.getX()> xMax) {
				xMax= position3D.getX();
			}
			if(position3D.getX()< xMin) {
				xMin= position3D.getX();
			}
			if(position3D.getY()> yMax) {
				yMax= position3D.getY();
			}
			if(position3D.getY()< yMin) {
				yMin= position3D.getY();
			}
			if(position3D.getZ()> zMax) {
				zMax= position3D.getZ();
			}
			if(position3D.getZ()< zMin) {
				zMin= position3D.getZ();
			}
		}
		Position3D mid= new Position3D();
		mid.setX((xMin+ xMax)/ 2);
		mid.setY((yMin+ yMax)/ 2);
		mid.setZ((zMin+ zMax)/ 2);
		Position3D heart= Euclid.findHeartPosition3D(inputs);
		Line3D line3D= new Line3D();
		line3D.setBegin(mid);
		line3D.setEnd(heart);
		return line3D;	
	} 
}