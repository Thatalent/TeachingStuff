package Experimental.VideoGame;

public class BattleAction {

	private String name;
	private int rawDmg;
	private String optionText;
	private float critRate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRawDmg() {
		return rawDmg;
	}

	public void setRawDmg(int rawDmg) {
		this.rawDmg = rawDmg;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	public float getCritRate() {
		return critRate;
	}

	public void setCritRate(float critRate) {
		this.critRate = critRate;
	}
	public static class Builder {
		private String name;
		private int rawDmg;
		private String optionText;
		private float critRate;

		public Builder name(String name){
			this.name = name;
			return this;
		}
		public Builder rawDmg(int rawDmg){
			this.rawDmg = rawDmg;
			return this;
		}
		public Builder optionText(String optionText){
			this.optionText = optionText;
			return this;
		}

		public Builder critRate(float critRate){
			this.critRate = critRate;
			return this;
		}

		public BattleAction build(){
			BattleAction battleAction = new BattleAction();
			battleAction.setName(this.name);
			battleAction.setOptionText(this.optionText);
			battleAction.setRawDmg(this.rawDmg);
			battleAction.setCritRate(this.critRate);
			return battleAction;
		}
	}
}
