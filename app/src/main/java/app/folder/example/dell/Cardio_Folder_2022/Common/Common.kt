package app.folder.example.dell.Cardio_Folder_2022.Common

import app.folder.example.dell.Cardio_Folder_2022.Remote.RetrofitClient.getClient
import app.folder.example.dell.Cardio_Folder_2022.Remote.IMyApi

object Common {
    //public static final String BASE_URL = "http://tabadlaekhyal.com/myapi3/";
    const val BASE_URL = "http://work.boschpharmaceutical.com/working/boschpakistan/"

    /*http://bosch.boschmedicus.com/working/login.php*/
    @JvmStatic
    val aPI: IMyApi
        get() = getClient(BASE_URL)!!.create(IMyApi::class.java)
}