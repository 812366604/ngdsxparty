package org.ngdsx.partybuilding.param;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserParam {

    private Integer userId;

    @NotBlank(message = "用户名不可以为空")
    @Length(min = 1, max = 20, message = "用户名长度需要在20个字以内")
    private String userName;
    
    @NotNull(message = "密码不能为空")
    private String userPwd;
    
    @NotNull(message = "必须提供学历")
    private Integer userEducation;
    
    @NotNull(message = "必须提供学位")
    private Integer userDegree;
    
    @NotNull(message = "籍贯不能为空")
    private String userNativePlace;
    
    @NotNull(message = "通讯地址不能为空")
    private String userAddress;
    
    @NotNull(message = "工作单位不能为空")
    private String userCompany;
    
    @NotBlank(message = "电话不可以为空")
    @Length(min = 1, max = 13, message = "电话长度需要在13个字以内")
    private String userPhone;

    @NotBlank(message = "邮箱不允许为空")
    @Length(min = 5, max = 50, message = "邮箱长度需要在50个字符以内")
    private String userEmail;

    @NotNull(message = "必须提供用户所在的部门")
    private Integer departmentId;

    @NotNull(message = "必须指定用户的状态")
    @Min(value = 0, message = "用户状态不合法")
    @Max(value = 2, message = "用户状态不合法")
    private String userCheck;

    @Length(min = 0, max = 200, message = "备注长度需要在200个字以内")
    private String userResume = "";
}
