package loadingConfig;

public interface SystemChecker {

	default boolean isLinux() {
		String os = System.getProperty("os.name");
		return os.startsWith("Linux");
	}
	
	default boolean isMac() {
		String os = System.getProperty("os.name");
		return os.startsWith("Mac");

	}
}
