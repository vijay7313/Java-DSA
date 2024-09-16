package Java8;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<UUID> uuidSupplier = () -> UUID.randomUUID();

		UUID uuid = uuidSupplier.get();

		System.out.println(uuid);

		Supplier<Integer> otp = () -> 1000 + new Random().nextInt(9000);

		System.out.println(otp.get());

	}
}
