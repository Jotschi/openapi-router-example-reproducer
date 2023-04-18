package io.metaloom.vertx;


import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;

import io.vertx.core.Vertx;
import io.vertx.openapi.contract.OpenAPIContract;

public class ContractTest {

	@Test
	public void testContract() throws InterruptedException, ExecutionException {
		Vertx vertx = Vertx.vertx();
		OpenAPIContract.from(vertx, "src/main/resources/api-contract.yaml").toCompletionStage().toCompletableFuture().get();
	}
}
