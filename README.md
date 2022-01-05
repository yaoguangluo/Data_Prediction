# Data_Prediction (开源版本研发已收尾，当前为1.0版本。202003031333 ) 快速轨迹坐标数据统计与概率论预测评估计算引擎（数据预测引擎包）。
## 协议证书： GPL2.0 ， 使用与修改请 Refer作者 ：'罗瑶光' 或者 'Yaoguang.Luo' 即可, 公开源码并告知其作者 313699483@qq.com。  
## 作者在大量的工程细节中遇到了数据预测计算和评估的功能需求，觉得有必要设计一个数据预测API.

#### 坐标类
###### 完善了欧基里德 熵增距离位移标记算法 20191216 罗瑶光
###### 完善了欧基里德 距离重心算法 20191216 罗瑶光
###### 完善了基于2维重心曲度射极斜率探测坐标雷达算法来获取边缘， 比常规 边缘小线段集合梯度计算快600倍。 20191216 罗瑶光
###### 完善了基于3维重心曲度射极斜率探测坐标雷达算法来获取边缘， 比常规 边缘小线段集合梯度计算快600倍。 20191218 罗瑶光
https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/SideEnd.java

###### 完善了极快速欧基里德动态坐标簇分类算法 20191217 罗瑶光
https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/PositionClasification.java

###### 完善了带精度 欧基里德 2维坐标团 切裂算法 20191219 罗瑶光
###### 完善了带精度 欧基里德 2维坐标集 重心熵 融聚算法 20191219 罗瑶光
###### 完善了带精度 欧基里德 3维坐标团 切裂算法 20191219 罗瑶光
https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/Fissile.java

###### 完善了带精度 欧基里德 3维坐标集 重心熵 融聚算法 20191219 罗瑶光
https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/Fusion.java

###### 完善了带精度 2维 (非欧拉权距)商旅路径团簇 隔离 算法 20191220 罗瑶光
###### 完善了带精度 3维 (非欧拉权距)商旅路径团簇 隔离 算法 20191220 罗瑶光
https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/isolation/Isolation.java

###### 完善了带精度 2维 商旅路径团簇 森林单元 隔离 算法 20191220 罗瑶光
###### 完善了带精度 3维 商旅路径团簇 森林单元 隔离 算法 20191220 罗瑶光
https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/isolation/ForestIsolation.java

###### 完善 2维 坐标集 切裂 重心 轨迹 跟踪算法 20191221 罗瑶光
###### 完善 3维 坐标集 切裂 重心 轨迹 跟踪算法 20191221 罗瑶光
https://gitee.com/DetaChina/Data_Prediction/tree/master/src/org/tinos/deta/trace

###### 完善增加 2维 坐标重心轨迹跟踪算法 20191221 罗瑶光
###### 完善增加 3维 坐标重心轨迹跟踪算法 20191221 罗瑶光
###### 增加 2维 带精度匹配最短最近重心团切融算法 20191223 罗瑶光
###### 增加 3维 带精度匹配最短最近重心团切融算法 20191223 罗瑶光
###### 增加 2维基于带精度 最短 重心位移 路径坐标集团采样 算法 20191223 罗瑶光
###### 增加 3维基于带精度 最短 重心位移 路径坐标集团采样 算法 20191223 罗瑶光
###### 增加了2维精度距离内 坐标集 筛选算法。 20191223 罗瑶光
###### 增加了3维精度距离内 坐标集 筛选算法。 20191223 罗瑶光
###### 增加了 小于重心距离精度内 2维坐标团集合筛选 算法 20191223 罗瑶光
###### 增加了 小于重心距离精度内 3维坐标团集合筛选 算法 20191223 罗瑶光
###### 增加了 2维 融聚团 宇宙重心算法 20191224 罗瑶光
###### 增加了 3维 融聚团 宇宙重心算法 20191224 罗瑶光
###### 增加了 2维 精度 子集数量内 融聚团 筛选算法 20191224 罗瑶光
###### 增加了 3维 精度 子集数量内 融聚团 筛选算法 20191224 罗瑶光
###### 增加了 2维 坐标团的带精度计算 主要有效距离成份集的平均压强算法 20191225 罗瑶光
###### 增加了 3维 坐标团的带精度计算 主要有效距离成份集的平均压强算法 20191225 罗瑶光
https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java

###### 增加了 2维 坐标团中 每一个坐标与精度数邻接坐标集的最小距离平均值比上 整体平均值来 获取的不稳定状态观测/预测（斥力，活性）算法。 20191225 罗瑶光
###### 增加了 3维 坐标团中 每一个坐标与精度数邻接坐标集的最小距离平均值比上 整体平均值来 获取的不稳定状态观测/预测（斥力，活性）算法。 20191225 罗瑶光
https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java

###### 增加了 2维 坐标集的计算观测优化函数 和 观测宽度差 求值 20191225 罗瑶光
###### 增加了 3维 坐标集的计算观测优化函数 和 观测宽度差 求值 20191225 罗瑶光
###### 增加了 2维 坐标集隐藏运动趋势预测算法 20191226 罗瑶光
###### 增加了 3维 坐标集隐藏运动趋势预测算法 20191226 罗瑶光
###### 增加了 2，3 求坐标团集的中心和重心集 算法 并做了局部认知优化 20191226 罗瑶光
###### 增加了 2，3维 通过坐标团的 精度匹配分割的内部坐标聚类团 进行 每个聚类团的 重心和中心距离 求解 获取有效的团稳定观测数据模型 20191227 罗瑶光
https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPositionsGroupPascalHearts.java

###### 增加了 2，3维 临近2个坐标团的相互引力比的算法建模观测，小于1 吸引，大于1 排斥。 20191227 罗瑶光 
###### 增加了 2，3维 支持高达1亿坐标 的 极速欧拉微分回路 商旅路径计算 的 TSP算法 1代 20200112 罗瑶光
###### 增加了 2，3维 支持高达1亿坐标 的 极速欧拉微分回路 商旅路径计算 的 TSP算法 2,3代 20200317 罗瑶光
https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP2D.java
https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP3D.java

###### 增加了 2，3维 根据坐标的重心轨迹来求解其坐标集的反演函数。 20200414 罗瑶光

#### 概率类 
###### 完善了贝叶斯决策树矩阵轭相似度匹配算法 20191217 罗瑶光
###### 完善了贝叶斯决策树轭校验评估算法 20191217 罗瑶光
###### 增加findMean 函数集， 纠正 findSumOfDoubleMatrix3D 函数 20191222 罗瑶光
###### 增加了增量比 函数 20191223 罗瑶光
###### 增加 模糊概率集相似成份采样。20191223 罗瑶光
###### 增加 带精度有效概率集合采样。20191223 罗瑶光
###### 增加了 相似概率集 有效成份过滤 的PCA 均值采样算法 20191223 罗瑶光
###### 增加了 数组排序后，对最大最小精度百分比数值过滤后的 中间主要有效成份 的 mean 求解算法。 20191226 罗瑶光
###### 增加了 求指定像素在图片中的像素占比算法。 20200301 罗瑶光
###### 增加了 用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的簇数量占比算法。 20200301 罗瑶光
###### 增加了 用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的像素占比求解算法。 20200301 罗瑶光



#### 数组类
###### 增加 进行精度误差 线性和2分匹配 来获取质量是否属于合格状态算法 20191228 罗瑶光
###### 增加 进行2维和3维的像素矩阵中2分极值分类 来进行 map坐标转化观测 算法 20190229 罗瑶光
###### 增加 将shareholder分层处理的图片像素数据 按指定的精度和对应像素进行按像素团的大小进行特定过滤算法 20190302 罗瑶光
https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/image/ImagePixGroupFilter.java
###### 增加 将像素矩阵指定的RBG颜色值拿出来形成波形数列输出算法 20190303 罗瑶光
###### 增加 2，3维 带精度 矩阵中非有效成份筛选过滤算法 20190303 罗瑶光

### NLP
###### NLP Algorithm of Matching The POS Scored Sentence 20191228 Yaoguang. Luo
###### NLP Algorithm of Matching The POS Scored Sentences 20191229 Yaoguang. Luo
https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/NLP/NLPTopicMatch.java


