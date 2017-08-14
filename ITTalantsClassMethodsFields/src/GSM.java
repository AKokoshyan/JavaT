import java.util.Scanner;

public class GSM {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private int outgoingCallsDuration;
	private Call lastIncomingCall = new Call();
	private Call lastOutgoingCall = new Call();

	public GSM(String model, String simMobileNumber) {
		this.model = model;
		setSimMobileNumber(simMobileNumber);
	}

	public GSM(String model, String simMobileNumber, Call lastIncomingCall, Call lastOutgoingCall) {
		this(model, simMobileNumber);
		this.lastIncomingCall = lastIncomingCall;
		this.lastOutgoingCall = lastOutgoingCall;
	}

	public String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	private boolean isHasSimCard() {
		return hasSimCard;
	}

	private void setHasSimCard(boolean hasSimCard) {
		this.hasSimCard = hasSimCard;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public void setSimMobileNumber(String simMobileNumber) {
		Scanner sc = new Scanner(System.in);
		boolean isNotValidNumber = false;
		if (simMobileNumber.length() == 10) {
			for (int i = 0; i < simMobileNumber.length(); i++) {
				if (i == 0) {
					if (simMobileNumber.charAt(0) != '0') {
						break;
					}
				}
				if (i == 1) {
					if (simMobileNumber.charAt(1) != '8') {
						break;
					}
				} else {
					if (simMobileNumber.charAt(i) < '0' && simMobileNumber.charAt(i) > '9') {
						break;
					}
				}
			}
		} else {
			do {
				simMobileNumber = sc.nextLine();
				if (simMobileNumber.length() == 10) {
					for (int i = 0; i < simMobileNumber.length(); i++) {
						if (i == 0 || i == 1) {
							if (simMobileNumber.charAt(0) != '0') {
								System.out.println("Invalid mobile number !");
								break;
							}
							if (simMobileNumber.charAt(1) != '8') {
								System.out.println("Invalid mobile number !");
								break;
							}
						} else {
							if (simMobileNumber.charAt(i) < '0' && simMobileNumber.charAt(i) > '9') {
								isNotValidNumber = true;
								break;
							}
						}
					}
				}
			} while (isNotValidNumber);
		}

		this.hasSimCard = true;
		this.simMobileNumber = simMobileNumber;
	}

	public int getOutgoingCallsDuration() {
		return outgoingCallsDuration;
	}

	public Call getLastIncomingCall() {
		return lastIncomingCall;
	}

	private void setLastIncomingCall(Call lastIncomingCall) {
		this.lastIncomingCall = lastIncomingCall;
	}

	public Call getLastOutgoingCall() {
		return lastOutgoingCall;
	}

	private void setLastOutgoingCall(Call lastOutgoingCall) {
		this.lastOutgoingCall = lastOutgoingCall;
	}

	void insertSimCard(String mobileNumber) {
		if (mobileNumber.length() != 10) {
			System.out.println("Invalid sim number!");
			return;
		}
		for (int i = 0; i < mobileNumber.length(); i++) {
			if (i == 0 || i == 1) {
				if (mobileNumber.charAt(0) != '0') {
					System.out.println("Invalid mobile number !");
					return;
				}
				if (mobileNumber.charAt(1) != '8') {
					System.out.println("Invalid mobile number !");
					return;
				}
			} else {
				if (mobileNumber.charAt(i) < '0' && mobileNumber.charAt(i) > '9') {
					System.out.println("Invalid mobile number !");
					return;
				}
			}
		}
		simMobileNumber = mobileNumber;
		hasSimCard = true;
	}

	void removeSimCard() {
		hasSimCard = false;
	}

	void call(GSM receiver, int duration) {
		if (hasSimCard && receiver.hasSimCard) {

			if (!simMobileNumber.equals(receiver.simMobileNumber)) {

				if (duration > 0 && duration < 60) {
					this.lastOutgoingCall.setCaller(this);
					this.lastOutgoingCall.setReceiver(receiver);
					this.lastOutgoingCall.setDuration(duration);
				}
			}
		}
	}

	double getSumForCall() {
		double sumPriceOutgoing;
		sumPriceOutgoing = (double) outgoingCallsDuration * lastIncomingCall.getPriceForAMinute();
		return sumPriceOutgoing;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.println("Last outgoing call info for " + model + " :\nThe caller is "
					+ lastOutgoingCall.getCaller().getSimMobileNumber() + "\nThe receiver is "
					+ lastOutgoingCall.getReceiver().getSimMobileNumber() + "\nLast outgoing call duration is "
					+ lastOutgoingCall.getDuration());
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("Last incoming call info for " + model + " :\nThe caller is "
					+ lastIncomingCall.getCaller().getSimMobileNumber() + "\nThe receiver is "
					+ lastIncomingCall.getReceiver().getSimMobileNumber() + "\nLast incoming call duration is "
					+ lastIncomingCall.getDuration());
		}
	}

}
