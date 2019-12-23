package org.tinos.deta.demension;
//Theory: ÎÞ·¨¿¼Ö¤
//Application: Yaoguang.luo
public class Line2D{
	public Position2D getBegin() {
		return begin;
	}
	public void setBegin(Position2D begin) {
		this.begin = begin;
	}
	public Position2D getEnd() {
		return end;
	}
	public void setEnd(Position2D end) {
		this.end = end;
	}
	private Position2D begin;
	private Position2D end;
}