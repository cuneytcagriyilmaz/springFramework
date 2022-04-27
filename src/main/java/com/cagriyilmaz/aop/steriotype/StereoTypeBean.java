package com.cagriyilmaz.aop.steriotype;

import lombok.*;



@BenimStereoType // bunun içinde aslında interface'dekiler var
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name="Merhaba";

    private String trade;
}
