package com.myinvestment.dto.request;





import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberRequestDto {

//    @NotBlank(message = "이메일은 필수 입력 값 입니다.")
    private String email;

    private String nickname;

//    @NotBlank(message = "비밀번호는 필수 입력 값 입니다.")
    private String password;

    public MemberRequestDto(String email, String nickname, String password) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }
    public void setEncodedPwd(String encodedPwd) {
        this.password = encodedPwd;
    }

}
