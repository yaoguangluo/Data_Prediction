package org.tinos.deta.cluster;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//task 20191220-20191222 daytime
//通过scale 距离来进行坐标团集合 融聚。
//Theory yaoguang.luo 20191219， 欧基里德
//Application yaoguang.luo
public class Fusion{
	public static Map<Double, List<Position2D>> fusionPosition2DwithHeart
	(Map<Double, List<Position2D>> groups, Map<Double, Position2D> groupsHeart, double scale){
		//初始
		Map<Double, List<Position2D>> output= new HashMap<>();
		Map<Double, Position2D> outputHeart= new HashMap<>();
		//逐团比较重心距离
		Iterator<Double> outLoop= groupsHeart.keySet().iterator();
		//小于精度内融聚
		HereOut:
			while(outLoop.hasNext()) {
				double out= outLoop.next();
				Iterator<Double> inLoop= groupsHeart.keySet().iterator();
				HereIn:
					while(inLoop.hasNext()) {
						double in= inLoop.next();
						if(out!= in) {
							Position2D inHeart=	groupsHeart.get(in);
							//Position2D outHeart= groupsHeart.get(out);
							//如下因为java的指针被对象化，直接修改入参会产生问题于是新做了outputHeart变量来处理。
							Position2D outHeart= outputHeart.containsKey(out)
									? outputHeart.get(out): groupsHeart.get(out);
									double distance= Distance.getDistance2D(inHeart, outHeart);
									//比较 是融合
									if(distance< scale) {
										//fusion 比较没有融媒
										if(!output.containsKey(out)) {
											if(!groups.containsKey(out)) {
												continue HereOut;
											}
										}
										if(!groups.containsKey(in)) {
											continue HereIn;
										}
										List<Position2D> outList;
										//区别输出和原数组取值
										if(!output.containsKey(out)) {
											outList= groups.get(out);
										}else {
											outList= output.get(out);
										}
										List<Position2D> inList= groups.get(in);
										Iterator<Position2D> iterator= inList.iterator();
										while(iterator.hasNext()) {
											outList.add(iterator.next());
										}
										output.put(out, outList);
										//更新heart
										Position2D newHeart= Eclid.findCryptionPosition2D(outHeart, inHeart);
										outputHeart.put(out, newHeart);
										//剔除以融聚对象
										groups.remove(in);	
									}else {//比较否融合
										//加新的只加 out
										List<Position2D> inList= groups.get(in);
										List<Position2D> outList= groups.get(out);
										if(!output.containsKey(out)) {
											output.put(out, outList);
											//更新heart
											Position2D newHeart= groupsHeart.get(out); 
											outputHeart.put(out, newHeart);
											//剔除已融聚对象
											groups.remove(out);
											groupsHeart.remove(out);
										}else {
											output.put(in, inList);	
											//更新heart
											Position2D newHeart= groupsHeart.get(in); 
											outputHeart.put(in, newHeart);
											//剔除已融聚对象
											groups.remove(in);
											groupsHeart.remove(in);
										}

									}
						}
					}
			}
		return output;	
	}
} 