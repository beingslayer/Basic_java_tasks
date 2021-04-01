package day3_Assignment_has_a;
public class Policy {

	private int policyId;
	private String policyName;
	private int policyAmount;
	
	public Policy(int policyId, String policyName, int policyAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyAmount = policyAmount;
	}
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	public void display() {
		System.out.println("\nPolicy Id : "+policyId+"\nPolicy Name : "+policyName+"\nPolicy Amouont : "+policyAmount);
	}
	
	
	
}