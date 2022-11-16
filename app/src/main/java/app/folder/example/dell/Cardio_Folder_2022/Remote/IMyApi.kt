package app.folder.example.dell.Cardio_Folder_2022.Remote

import app.folder.example.dell.Cardio_Folder_2022.Model.APIResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface IMyApi {
    @FormUrlEncoded // annotation that used with POST type request
    @POST("login.php")
    fun loginUser(
        @Field("EmpID") email: String?,
        @Field("encryp_pass") password: String?,
        @Field("MacAddress") mac_address: String?
    ): Call<APIResponse?>?

    @FormUrlEncoded
    @POST("location.php")
    fun submitLocation(
        @Field("EmpID") Uid_new: String?,
        @Field("Address") geo_address: String?,
        @Field("Longitude") lon: String?,
        @Field("Latitude") lat: String?
    ): Call<APIResponse?>?

    @FormUrlEncoded
    @POST("login_msg.php")
    fun loginConfirmation(
        @Field("EmpID") Uid_new: String?,
        @Field("Name") User_name: String?,
        @Field("Message") msg: String?
    ): Call<APIResponse?>?

    @FormUrlEncoded
    @POST("login_error_msg2.php")
    fun loginError(
        @Field("EmpID") Uid_new: String?,
        @Field("Password") password: String?,
        @Field("IMEI") imei_new: String?,
        @Field("MacAddress") mac_address: String?,
        @Field("Error_Message") error_msg: String?
    ): Call<APIResponse?>? /*@FormUrlEncoded
    @POST("dcr.php")
    Call<APIResponse> submitDcr(@Field("EmpID") String uid,@Field("Doc_Name")String dr_name,@Field("Doc_Spec") String dr_spec,
                                @Field("Area")String area,@Field("Product_Detail") String product_detail,
                                @Field("Sample_Quantity")String sample_quantity,@Field("Accompained_By") String accompanied_by,
                                @Field("Comment")String comment,
                                @Field("Latitude") String lat,
                                @Field("Longitude") String lon,
                                @Field("Address") String geo_address
    );*/
}