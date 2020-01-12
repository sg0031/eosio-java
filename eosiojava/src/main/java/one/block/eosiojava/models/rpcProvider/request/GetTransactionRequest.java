package one.block.eosiojava.models.rpcProvider.request;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/**
 * The request class for getTransaction() RPC call {@link one.block.eosiojava.interfaces.IRPCProvider#getBlock(GetBlockRequest)}
 */
public class GetTransactionRequest {

    /**
     * Instantiates a new GetTransactionRequest.
     *
     * @param transactionId the transaction id
     */
    public GetTransactionRequest(@NotNull String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Provide a transaction id
     */
    @SerializedName("id")
    @NotNull
    private String transactionId;

    /**
     * Gets transaction id.
     *
     * @return the block number or a block id
     */
    @NotNull
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(@NotNull String transactionId) {
        this.transactionId = transactionId;
    }
}
