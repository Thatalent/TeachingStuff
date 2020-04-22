package Experimental.VideoGame;

public class BattleAction {

	private String name;
	private int rawDmg;
	private String optionText;

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

	public static class Builder {
		private String name;
		private int rawDmg;
		private String optionText;

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

		public BattleAction build(){
			BattleAction battleAction = new BattleAction();
			battleAction.setName(this.name);
			battleAction.setOptionText(this.optionText);
			battleAction.setRawDmg(this.rawDmg);
			return battleAction;
		}
	}
}
