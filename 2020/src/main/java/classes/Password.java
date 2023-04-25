package classes;

public class Password {

	private final int lowerBound;
	private final int upperBound;
	private final char check;
	private final String password;

	public Password(String passwordCheck) {
		String[] split = passwordCheck.split(": ");
		String[] check = split[0].split(" ");
		String[] bounds = check[0].split("-");
		lowerBound = Integer.parseInt(bounds[0]);
		upperBound = Integer.parseInt(bounds[1]);
		this.check = check[1].charAt(0);
		password = split[1];
	}

	public boolean isValid() {
		int count = 0;
		for (char c : password.toCharArray()) {
			if (c == check) {
				count++;
			}
		}
		return count >= lowerBound && count <= upperBound;
	}

	public boolean isValidNewPolicy() {
		int count = 0;
		if (password.charAt(lowerBound - 1) == check) {
			count++;
		}
		if (password.charAt(upperBound - 1) == check) {
			count++;
		}
		return count == 1;
	}
}
