package com.koizumi.curdapi.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreateForm {
    //@NotBlank(message = "名前は必須です")
    //@Size(max = 20, message = "名前は20文字以下で入力してください")
    private String name;
    
    /*@NotNull(message = "入力してください")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "過去の日付を入力してください")
    private LocalDate dateOfBirth;*/
    
}
