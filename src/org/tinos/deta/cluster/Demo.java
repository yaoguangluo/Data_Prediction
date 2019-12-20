package org.tinos.deta.cluster;

import java.util.ArrayList;
import java.util.List;

import org.tinos.deta.demension.Position2D;

public class Demo{
	public static void main(String[] argv) {
		//初始10个坐标
		List<Position2D> input= new ArrayList<>(); 
		Position2D position2D =new Position2D();
		position2D.setX(0);
		position2D.setY(0);
		input.add(position2D);
		
		Position2D position2D1 =new Position2D();
		position2D1.setX(1);
		position2D1.setY(1);
		input.add(position2D1);
		
		Position2D position2D2 =new Position2D();
		position2D2.setX(0);
		position2D2.setY(0);
		input.add(position2D2);
		
		Position2D position2D3 =new Position2D();
		position2D3.setX(0);
		position2D3.setY(0);
		input.add(position2D3);
		//处理
		
		//输入检测
	}
}