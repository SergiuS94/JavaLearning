package APILearning.fakestore1;

import com.google.gson.annotations.SerializedName;

public class Rating{

	@SerializedName("rate")
	private Object rate;

	@SerializedName("count")
	private int count;

	public Object getRate(){
		return rate;
	}

	public int getCount(){
		return count;
	}
}