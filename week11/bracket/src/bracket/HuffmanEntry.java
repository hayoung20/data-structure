package bracket;

public class HuffmanEntry {
	private int frequency;	//빈도 수
	private String word; // 이파리 노드의 문자 또는 내부노드의 합성된 문자열
	private HuffmanEntry left;	//왼쪽 자식
	private HuffmanEntry right; 	//오른쪽 자식
	private String code;	//하프만 코드
	
	public HuffmanEntry (int newFreq, String newValue, HuffmanEntry l, HuffmanEntry r, String s) {
		frequency = newFreq;
		word = newValue;
		left = l;
		right = r;
		code =s;
	}
	public int getKey() {return frequency;}
	public String getValue() {return word;}
	public String getCode() {return code;}
	public HuffmanEntry getLeft() {return left;}
	public HuffmanEntry getRight() {return right;}
	
	public void setCode(String newCode) {code = newCode;}
}
