package day07;

public class ModifiedTv {

	int currentChannel;
	int channelMax;
	int channelMin;

	void addChannelCount() {
		int max = this.channelMax;
		int min = this.channelMin;
		
		if (max <= this.currentChannel) {
			this.currentChannel = min;
		} else {
			++this.currentChannel;
		}
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
}	