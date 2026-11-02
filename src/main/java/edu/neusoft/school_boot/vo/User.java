package edu.neusoft.school_boot.vo;

public class User {
    private int userId;
    private String userName;
    private String password;
    private String realName;
    private String schoolName;
    private String userType;
    //构造方法特点：
    //1.构造方法名必须与类名相同
    //2.没有返回类型，没有void
    //3.默认在不创建带参构造方法，系统默认有一个无参构造方法
    //4.如果创建了带参构造方法，系统将不再提供无参构造方法，需要显式声明
    //5.构造方法是在实例化对象时调用
    //6.构造方法作用：初始化对象（简化属性赋值）
    public User() {
    }
    public User( String userName, String password, String realName, String schoolName, String userType) {
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.schoolName = schoolName;
        this.userType = userType;
    }
    public User(int userId, String userName, String password, String realName, String schoolName, String userType) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.schoolName = schoolName;
        this.userType = userType;
    }
    //重写toString方法，方便打印对象信息
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
