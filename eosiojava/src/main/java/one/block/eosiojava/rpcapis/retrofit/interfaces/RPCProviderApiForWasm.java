package one.block.eosiojava.rpcapis.retrofit.interfaces;
//
// Copyright © 2017-2019 block.one.
//

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import one.block.eosiojava.models.rpcProvider.request.GetTransactionRequest;
import one.block.eosiojava.rpcapis.retrofit.implementations.RPCProviderImpl;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Retrofit definitions for communication with the EOSIO blockchain.
 */
public interface RPCProviderApiForWasm {
    //State History APIs

    /**
     * Retrofit POST call to "chain/get_actions" to an EOSIO blockchain.
     * This method gets called from {@link RPCProviderImpl#getActions(RequestBody)}
     *
     * @param requestBody the request body to call 'get_actions' API
     * @return Executable {@link Call} to return {@link ResponseBody} of 'get_actions' API
     */
    @POST("v1/history/get_actions")
    Call<ResponseBody> getActions(@Body RequestBody requestBody);

    /**
     * Retrofit POST call to "chain/get_transaction" to an EOSIO blockchain.
     * This method gets called from {@link RPCProviderImpl#getTransaction(RequestBody)}
     *
     * @param requestBody the request body to call 'get_transaction' API
     * @return Executable {@link Call} to return {@link ResponseBody} of 'get_transaction' API
     */
    @POST("v1/history/get_transaction")
    Call<ResponseBody> getTransaction(@Body GetTransactionRequest requestBody);


    //endregion
}
