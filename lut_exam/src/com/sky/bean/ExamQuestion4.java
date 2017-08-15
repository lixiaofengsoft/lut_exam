package com.sky.bean;

import java.util.Arrays;


public class ExamQuestion4 {
	private String papername;
	
	private int one;
	private int more;
/*	private int[] idArrS=new int[20];	//记录单选题的试题ID的属性
	private int[] idArrM=new int[20];	//记录多选题的试题ID的属性
	
	private String[] answerArrS=new String[20];  // 这个是提交时单选的答案数组
	
	private String[] moreSelect=new String[20]; ; // 这个是多选提交时的答案数组
*/	private int[] idArrS=new int[10];	//记录单选题的试题ID的属性
	private int[] idArrM=new int[10];	//a记录多选题的试题ID的属性
	
	
	private String[] answerArrS=new String[10];  // 这个是提交时单选的答案数组
	
	private String[] moreSelect=new String[10];  // 这个是多选提交时的答案数组
	public ExamQuestion4() {}
	public ExamQuestion4(String papername, int[] idArrS, int[] idArrM,
			String[] answerArrS, String[] moreSelect) {
		this.papername = papername;
		this.idArrS = idArrS;
		this.idArrM = idArrM;
		this.answerArrS = answerArrS;
		this.moreSelect = moreSelect;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public int[] getIdArrS() {
		return idArrS;
	}
	public void setIdArrS(int[] idArrS) {
		this.idArrS = idArrS;
	}
	public int[] getIdArrM() {
		
		return idArrM;
	}
	public void setIdArrM(int[] idArrM) {
		
		this.idArrM = idArrM;
	}
	public String[] getAnswerArrS() {
		return answerArrS;
	}
	public void setAnswerArrS(String[] answerArrS) {
		this.answerArrS = answerArrS;
	}
	public String[] getMoreSelect() {
		return moreSelect;
	}
	public void setMoreSelect(String[] moreSelect) {
		this.moreSelect = moreSelect;
	}
	
	
	
/*	// 设置单选数组的长度大小
	public void setSize(int size){
		this.idArrS=new int[size];
		this.answerArrS=new String[size];
		System.out.println("单选题的数组大小："+answerArrS.length);
	}
	
	// 设置多选数组的长度大小
	public void setMoreSize(int size){
		this.idArrM=new int[size];
		this.moreSelect=new String[size];
		System.out.println("多选题："+moreSelect.length);
	}
	*/
	
	
	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getMore() {
		return more;
	}
	public void setMore(int more) {
		this.more = more;
	}
	@Override
	public String toString() {
		return "ExamQuestion4 [papername=" + papername + ", one=" + one
				+ ", more=" + more + ", idArrS=" + Arrays.toString(idArrS)
				+ ", idArrM=" + Arrays.toString(idArrM) + ", answerArrS="
				+ Arrays.toString(answerArrS) + ", moreSelect="
				+ Arrays.toString(moreSelect) + "]";
	}
	
	
	

	
}
