package app.folder.example.dell.Cardio_Folder_2022.Model

class APIResponse {
    private var error = false
    private var uid: String? = null
    private var user: User? = null
    private var error_msg: String? = null

    fun isError(): Boolean {
        return error
    }

    fun setError(error: Boolean) {
        this.error = error
    }

    fun getUid(): String? {
        return uid
    }

    fun setUid(uid: String?) {
        this.uid = uid
    }

    fun getUser(): User? {
        return user
    }

    fun setUser(user: User?) {
        this.user = user
    }

    fun getError_msg(): String? {
        return error_msg
    }

    fun setError_msg(error_msg: String?) {
        this.error_msg = error_msg
    }
}