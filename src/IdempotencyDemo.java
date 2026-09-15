import java.util.HashMap;

public class IdempotencyDemo {
    private static HashMap<String, String> databaseMock = new HashMap<>();

    public static void processRequest(String idempotencyKey, String data) {
        System.out.println("\n--- [Incoming Request] Key: " + idempotencyKey + ", Data: " + data + " ---");

        if (databaseMock.containsKey(idempotencyKey)) {
            String savedResponse = databaseMock.get(idempotencyKey);
            System.out.println("❌ [DUPLICATE RETRY DETECTED] -> Returning original result: " + savedResponse);
            return;
        }

        String actionResult = "SUCCESS: Transaction processed for " + data;
        databaseMock.put(idempotencyKey, actionResult);
        System.out.println("✅ [NEW TRANSACTION CREATED] -> Stored inside DB. Result: " + actionResult);
    }

    public static void main(String[] args) {
        System.out.println("=== API Idempotency under Network Failure ===");
        processRequest("TXN-101", "Payment of £500");
        processRequest("TXN-101", "Payment of £500");
    }
}
