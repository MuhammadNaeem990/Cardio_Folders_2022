package app.folder.example.dell.Cardio_Folder_2022.Model

class User{
    private var name: String? = null
    private var Team: String? = null
    private var Employee_Id: String? = null

    fun User(employee_Id: String?, name1: String?, team: String?) {
        Employee_Id = employee_Id
        name = name1
        Team = team
    }

    fun getEmployee_Id(): String? {
        return Employee_Id
    }

    fun getName(): String? {
        return name
    }

    fun getTeam(): String? {
        return Team
    }
}