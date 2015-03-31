package eu.test.json_subclass;



public class FlightItemResult implements ItemResult {

	private Card card;
	private String expires;

	private FlightItemResult(){
		card = new Card();
	}
	public void setCard(Card card) {
		this.card = card;
	}

	public String getExpires() {
		return expires;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}

	public String getKey1() {
		return this.card.getKey1();
	}

	public String getKey2() {
		return this.card.getKey2();
	}

	public String getKey3() {
		return this.card.getKey3();
	}
	
	public void setKey1(String key1) {
		this.card.setKey1(key1);
	}
	
	public void setKey2(String key2) {
		this.card.setKey2(key2);
	}
	
	public void setKey3(String key3) {
		this.card.setKey3(key3);
	}

}