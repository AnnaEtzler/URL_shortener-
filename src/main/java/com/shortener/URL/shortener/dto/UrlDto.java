package com.shortener.URL.shortener.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UrlDto {
    private String url;
    private String expiration_date;

}
