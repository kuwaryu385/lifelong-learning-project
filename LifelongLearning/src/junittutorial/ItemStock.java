package junittutorial;

public interface ItemStock {

	//	商品と数量を指定して追加
	//	item 商品名
	//	num 追加する数量
	void add(String item, int num);

	//	商品を指定して、商品の在庫数を返す。
	//	pram item 商品名
	//	return 在庫数、登録されてない場合は０
	int size(String item);

	//	商品の在庫が残っている場合にtrueを返す。
	//	param item　商品名
	//	return 在庫が１以上の場合にtrue
	boolean contains(String item);

}
