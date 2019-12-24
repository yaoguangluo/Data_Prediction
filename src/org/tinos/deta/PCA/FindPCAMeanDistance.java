package org.tinos.deta.PCA;
import java.util.Iterator;
import java.util.List;

import org.tinos.deta.basic.Distance;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
import org.tinos.deta.statistic.LYG4DWithDoubleQuickSort4D;
public class FindPCAMeanDistance{
	//�������ŵ���Ҫ��Ч����ɷݼ���ƽ��ѹǿ�㷨
	//˼�룺������ 20191225
	//ʵ�֣�������
	public static double findMeanDistanceFromPositions2D(List<Position2D> position2Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<Position2D> outPosition2DIterator= position2Ds.iterator();
		double outMean= 0;
		while(outPosition2DIterator.hasNext()) {
			Position2D outPosition2D= outPosition2DIterator.next();
			double[] distance= new double[position2Ds.size()];
			int i= 0;
			Iterator<Position2D> inPosition2DIterator= position2Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition2DIterator.hasNext()) {
				Position2D inPosition2D= inPosition2DIterator.next();
				distance[i++]= Distance.getDistance2D(outPosition2D, inPosition2D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ position2Ds.size();
	}
	
	public static double findMeanDistanceFromPositions3D(List<Position3D> position3Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<Position3D> outPosition3DIterator= position3Ds.iterator();
		double outMean= 0;
		while(outPosition3DIterator.hasNext()) {
			Position3D outPosition3D= outPosition3DIterator.next();
			double[] distance= new double[position3Ds.size()];
			int i= 0;
			Iterator<Position3D> inPosition3DIterator= position3Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition3DIterator.hasNext()) {
				Position3D inPosition3D= inPosition3DIterator.next();
				distance[i++]= Distance.getDistance3D(outPosition3D, inPosition3D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ position3Ds.size();
	}
}