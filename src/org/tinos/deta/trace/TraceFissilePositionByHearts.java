package org.tinos.deta.trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class TraceFissilePositionByHearts{
	//Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
	//出版日期2020 年 04 月 14 日 作品说明Gitee, Github, DetaOSS
	//这个算法之前个人软著申请有相关的根据坐标计算重心轨迹的算法
	//，这个函数是其反演函数，根据坐标的重心轨迹来求解其坐标集。
	//作品说明适用于 坐标团 动态分析，增量轨迹分析，熵增信息单元记录。
	//作者 罗瑶光
	public static List<Position2D> trackTracePosition2DByHearts(List<Position2D> hearts){
		List<Position2D> trackTracePositions= new ArrayList<>(); 
		Iterator<Position2D> iterator= hearts.iterator();
		Position2D lastPosition2D= null;
		if(iterator.hasNext()) {
			lastPosition2D= iterator.next();
			trackTracePositions.add(lastPosition2D);	
		}
		while(iterator.hasNext()) {
			Position2D heartPostion= iterator.next();
			//position2D.setX((heart.getX()+ oneMore.getX())/ 2);
			//newHeart= (lastHeart+ newp)/2    =>  newp= newHeart*2 -lastHeart  
			//add section 1234
			Position2D newPosition2D= new Position2D(heartPostion.getX()*2- lastPosition2D.getX()
												   , heartPostion.getY()*2- lastPosition2D.getY());
			trackTracePositions.add(newPosition2D);
			lastPosition2D= heartPostion;
		}
		return trackTracePositions;
	}
	
	public static List<Position3D> trackTracePosition3DByHearts(List<Position3D> hearts){
		List<Position3D> trackTracePositions= new ArrayList<>(); 
		Iterator<Position3D> iterator= hearts.iterator();
		Position3D lastPosition3D= null;
		if(iterator.hasNext()) {
			lastPosition3D= iterator.next();
			trackTracePositions.add(lastPosition3D);	
		}
		while(iterator.hasNext()) {
			Position3D heartPostion= iterator.next();
			//position3D.setX((heart.getX()+ oneMore.getX())/ 2);
			//newHeart= (lastHeart+ newp)/2    =>  newp= newHeart*2 -lastHeart  
			//add section 1234
			Position3D newPosition3D= new Position3D(heartPostion.getX()* 2- lastPosition3D.getX()
												   , heartPostion.getY()* 2- lastPosition3D.getY()
												   , heartPostion.getZ()* 2- lastPosition3D.getZ());
			trackTracePositions.add(newPosition3D);
			lastPosition3D= heartPostion;
		}
		return trackTracePositions;
	}
}
