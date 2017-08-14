
public class Call {
	private double priceForAMinute = 0.35;
	private GSM caller;
	private GSM receiver;
	private int duration;

	public Call() {

	}

	Call(GSM caller, GSM receiver) {
		this.caller = caller;
		this.receiver = receiver;
		this.duration = duration;
	}

	public GSM getCaller() {
		return caller;
	}

	public void setCaller(GSM caller) {
		if (caller != null) {
			this.caller = caller;
		}
	}

	public GSM getReceiver() {
		return receiver;
	}

	public void setReceiver(GSM receiver) {
		this.receiver = receiver;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getPriceForAMinute() {
		return priceForAMinute;
	}

	public void setPriceForAMinute(double priceForAMinute) {
		this.priceForAMinute = priceForAMinute;
	}

}
