# ๐๏ธ EyesOn
<img src = "./assets/img/app_logo.png" width="160" height="160">โ
<img src = "./assets/img/logo_navi.png" width="280" height="150">โ
<img src = "./assets/img/logo.png" width="280" height="150">

โ[์ ํ๋ฆฌ์ผ์ด์ ์์ด์ฝ]โโโโโโโโ[Eyes On ๋ก๊ณ _1]โโโโโโโโโโโโโโโ[Eyes On ๋ก๊ณ _2]


#### **EyesOn** ํ๋ก์ ํธ๋ ์๊ฐ์ฅ์ ์ธ ๋ฐ ์ ์๋ ฅ์๋ฅผ ์ํ ๋ณด์กฐ ์ ํ๋ฆฌ์ผ์ด์ ์๋๋ค.

์๊ฐ ์ฅ์ ์ 92%๋ ํ์ฒ์ ์ด๋ฉฐ, ์ด๋ค์ 90%๋ ์ ์๋ฅผ ์ฝ์ง ๋ชปํฉ๋๋ค. ๋ํ ์ธ๋์ ๋์ด๊ฐ ๋ฎ์ ์ฅ์ ๋ฌผ๋ค์ ํฐ์งํก์ด๋ก๋ ๊ฐ์งํ๊ธฐ ์ด๋ ค์ ํฐ ์ฌ๊ณ ๋ฅผ ์ผ๊ธฐํฉ๋๋ค. 
์ด๋ฌํ ๋ณดํ ์ค ์ํ๊ณผ ์ํ ์ ๋ถํธํจ์ ์กฐ๊ธ์ด๋๋ง ํด์ํ  ์ ์๋๋ก ์ ํฌ๋  


๐ก **์๊ฐ์ฅ์ ์ธ์ ๋[:Eyes] ์ ๋จ๊ฒ[:On] ํด์ฃผ๋ค.** ๐ก

๋ผ๋ ์๋ฏธ์ Eyes On(์์ด์ฆ ์จ) ํ๋ก์ ํธ๋ฅผ ์งํํ๊ฒ ๋์์ต๋๋ค.

## ERD

> ์ฌ์ฉ์, ์์ ค, ๋ฏผ์ ๊ธฐ๋ฅ์ด ์ ๊ธฐ์ ์ผ๋ก ์ฐ๊ฒฐ๋์ด์๊ณ ,
> 
> 
> ๊ทธ๋ฅผ ํจ์จ์ ์ผ๋ก ํ์ฉํ๊ธฐ ์ํด ERD๋ฅผ ์์ฑํ์ต๋๋ค.
> 
<img src = "./assets/img/Untitled.png" width="900" height="400">

## ์ฌ์ฉ ๊ธฐ์ 

> ํ๋ก์ ํธ์์ ์ฌ์ฉ๋ ๊ธฐ์ ๋ค์๋๋ค.
> 
<img src = "./assets/img/tech_stack.png" width="900" height="400">

## ํ๋ก์ ํธ ๊ตฌ์กฐ๋

> ํ๋ก์ ํธ ๊ตฌ์กฐ๋ ์๋๋ค.
> 
<img src = "./assets/img/architecture.png" width="900" height="400">


## ๋ฌธ์

- **[๊ธฐ๋ฅ๋ช์ธ์](https://www.notion.so/db1694e3f1c64543ab89e5627e562b82?v=c0cb789beddb4226ba396490b6da2afc)**
    - ํ๋ก์ ํธ์ ๊ธฐ๋ฅ ๋ช์ธ์์๋๋ค.
- **[์์ด์ดํ๋ ์](https://www.figma.com/file/Fh80vZbnQpV1oeqbSWwYxf/%EC%9E%90%EC%9C%A8?node-id=27%3A28&t=DkyqGkomxJYHRJXZ-0)**
    - ํผ๊ทธ๋ง๋ฅผ ์ฌ์ฉํ์ฌ ์ ์๋ ์์ด์ดํ๋ ์
- **[API Documentation](https://www.notion.so/API-1227dcd49efd492383dbdfc127eaf667)**
    - RESTful ์๋ฒ์ API ๋ฌธ์์๋๋ค.


# **๐ฑAndroid**

### ๋๋ ํฐ๋ฆฌ ๊ตฌ์กฐ๋

```markdown
๐AOS
โโโ๐presentation
โ โโโ๐base
โ โโโ๐di
โ โโโ๐module
โ โโโ๐service
โ โโโ๐util
โ โโโ๐view
โ โ โโโ๐binding
โ โ โโโ๐angel
โ โ โโโ๐blind
โ โ โโโ๐intro
โ โ โโโ๐loading
โ โ โโโ๐login
โ โ โ โโโ๐join
โ โ โ โโโ๐login
โโโ๐domain
โ โโโ๐base
โ โโโ๐model
โ โโโ๐repository
โ โโโ๐usecase
โ โ โ โโโ๐complaints
โ โ โ โโโ๐help
โ โ โ โโโ๐noti
โ โ โ โโโ๐user
โ โโโ๐utils
โโโ๐data
โ โโโ๐api
โ โโโ๐datasource
โ โ โโโ๐paging
โ โโโ๐mapper
โ โโโ๐model
โ โ โ โโโ๐entity
โ โ โ โโโ๐request
โ โ โ โโโ๐response
โ โโโ๐repository(Impl)
โ โโโ๐utils
โโโ๐mlkit
โ โโโ๐objectdetecor
โ โโโ๐textdetector
โโโ๐webrtc
โ โโโ๐constants
โ โโโ๐observers
โ โโโ๐openvidu
โ โโโ๐utils
โ โโโ๐websocket
โโโ๐arcore
โ โโโ๐common
โ โโโ๐rendering
```

### ์ํคํ์ฒ

> ์๋๋ก์ด๋๋ **ํด๋ฆฐ ์ํคํ์ฒ**๋ฅผ ๋์ํ์ต๋๋ค.
> 

<img src = "./assets/img/android_architecture.png" width="900" height="350">

# **๐ฝ**BACK-END

### ๋๋ ํฐ๋ฆฌ ๊ตฌ์กฐ

```markdown
๐BACK
โโโ๐main
โ โโโ๐java
โ โ โโโ๐config
โ โ โโโ๐controller
โ โ โโโ๐dto
โ โ โโโ๐entity
โ โ โโโ๐jwt
โ โ โโโ๐mapper
โ โ โโโ๐repository
โ โ โโโ๐service
โ โ โโโ๐util
โ โโโ๐resources
โ โ โโโ๐firebase
โ โ โโโ๐templates
```
    

# โญ์ฃผ์๊ธฐ๋ฅ

- **[Talkback ๊ธฐ๋ฅ](./assets/md/talkback.md)**

## โค ํ์๊ฐ์

- **[์๊ฐ ์ฅ์ ์ธ ํ์ ๊ฐ์](./assets/md/join_blind.md)**

- **[์์ ค ํ์ ๊ฐ์](./assets/md/join_angel.md)**

## ๐ค ์์ ค

- **[์์ ค ์๋ฆผ ์ค์ ](./assets/md/angel_setting.md)**

- **[์์ ค ๋์์ฃผ๊ธฐ](./assets/md/angel_help.md)**

- **[์์ ค ๋ฏผ์ ์ฒ๋ฆฌ](./assets/md/angel_complaints.md)**


## ๐ ์๊ฐ์ฅ์ ์ธ

- **[์๊ฐ์ฅ์ ์ธ ๊ธ์ ์ธ์](./assets/md/blind_scan_text.md)**

- **[์๊ฐ์ฅ์ ์ธ ๋ฌผ๊ฑด ์ฐพ๊ธฐ](./assets/md/blind_find_object.md)**

- **[์๊ฐ์ฅ์ ์ธ ์ฅ์ ๋ฌผ ์ธ์](./assets/md/blind_scan_obstacle.md)**

- **[์๊ฐ์ฅ์ ์ธ ๋ฏผ์ ์ ์ฒญ](./assets/md/blind_complaints.md)**

- **[์๊ฐ์ฅ์ ์ธ ์์ ค๊ณผ์ ์ฐ๊ฒฐ](./assets/md/blind_help.md)**


# ํ์ ์๊ฐ

### **๐ TEAMย EyesOn**

<table>
    <tr>
        <td height="140px" align="center"> <a href="https://github.com/us13579">
            <img src="https://avatars.githubusercontent.com/u/97679742?v=4" width="140px" /> <br><br> ๊น์ง์ <br>(Back-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/henginthere">
            <img src="https://avatars.githubusercontent.com/u/58303100?v=4" width="140px" /> <br><br> ๋ฐฐํ์ฐ <br>(Back-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/jongui-94">
            <img src="https://avatars.githubusercontent.com/u/64008540?v=4" width="140px" /> <br><br> ๋ฐ์ข์ฑ <br>(Back-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/JeongBJ">
            <img src="https://avatars.githubusercontent.com/u/85900947?v=4" width="140px" /> <br><br> ์ ๋ด์ง <br>(AOS) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/mxxxxxji">
            <img src="https://avatars.githubusercontent.com/u/52437364?v=4" width="140px" /> <br><br> ๊น๋ช์ง <br>(AOS) </a> <br></td>
            <td height="140px" align="center"> <a href="https://github.com/taxfdi6371">
            <img src="https://avatars.githubusercontent.com/u/53108175?v=4" width="140px" /> <br><br> ๊ถ์ฉ์ค <br>(AOS) </a> <br></td>
    </tr>
    <tr>
        <td align="center"> ๐ํ์ฅ <br> BackEnd <br> AI ์ ์ฒ๋ฆฌ
        <td align="center"> ๋ถํ์ฅ <br> BackEnd <br> Infra <br> AI ์ ์ฒ๋ฆฌ 
        <td align="center"> BackEnd <br> AI ์ ์ฒ๋ฆฌ
        <td align="center">Android <br> Infra
        <td align="center">Android 
        <td align="center">Android
    </tr>
</table>

<div id="2">
<br><br>
</div>

## ํ๋ก์ ํธ ๊ตฌ์ฑ ์์

### Android ๊ตฌ์ฑ ์์

| Package | Version | Comment |
| --- | --- | --- |
| Dagger Hilt | 2.44 | ์์กด์ฑ ์ฃผ์ ๋ผ์ด๋ธ๋ฌ๋ฆฌ  |
| Retrofit | 2.9.0 | HTTP ํต์  ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| OKHttp | 4.10.0 | HTTP ํต์  ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Coroutines | 1.6.4 | ๋น๋๊ธฐ ์ฒ๋ฆฌ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Navigation | 2.5.3 | ํ๋ฉด ์ด๋ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| PlayServicesAuth | 20.3.0 | Google OAuth |
| AR Core | 1.34.0 | AR ์ฌ์ฉ์ ์ํ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Tensorflow-lite-task-vision | 0.4.0 | Object Detection |
| Tensorflow-lite-gpu | 2.9.0 | Object Detection์ GPU ์ฌ์ฉ |
| ML Kit | 18.5.0 | Text Recognition ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Firebase Cloud Messaigng  | 23.1.0 | PUSH ์๋ฆผ ์ฌ์ฉ์ ์ํ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Paging 3 | 3.1.1 | Pagination ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| WebRTC | 1.0.32006 | ์์ ํตํ๋ฅผ ์ํ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Glide | 4.13.2 | ์ด๋ฏธ์ง ๋ก๋ฉ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| AndroidViewAnamations | 2.4 | ๋ทฐ ์ ๋๋ฉ์ด์ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Lottie | 5.2.0 | ๋ทฐ ์ ๋๋ฉ์ด์ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| Room | 2.4.3 | ๋ก์ปฌ Database |
| PlayServicesLocation | 21.0.1 | GPS ์ฌ์ฉ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |
| MPAndroidChart | 3.1.0 | ๊ทธ๋ํ, ์ฐจํธ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |

### Backend ๊ตฌ์ฑ ์์

| ๊ธฐ์  ์คํ | Version | Comment |
| --- | --- | --- |
| OpenJDK | 11 | Java vendor ์ฌ์ฉ |
| SpringBoot | 2.7.3 | Rest API ์น ์ ํ๋ฆฌ์ผ์ด์ ๊ฐ๋ฐ |
| Gradle | 7.5 | ํ๋ก์ ํธ๋ฅผ ๋น๋ํ๊ณ  ๋ผ์ด๋ธ๋ฌ๋ฆฌ๋ฅผ ๊ด๋ฆฌ ๋๊ตฌ |
| MySQL | 8.0.30 | DB |
| JPA | 2.7.3 | ์๋ฒ์ DB์ ์ฐ๋์ ์ํด ์ฌ์ฉ |
| JWT | 0.11.2 | ๋ก๊ทธ์ธ ์ ์  ์ธ์ฆ์ ์ํด ํ ํฐ ์ฌ์ฉ |
| Spring Security | 2.7.3 | ์์ฌ์ด ๋ณด์ ๊ด๋ฆฌ๋ฅผ ์ํด ์ฌ์ฉ |
| Swagger | 2.9.2 | API ๋ฌธ์ํ๋ฅผ ์ํด ์ฌ์ฉ |
| Ubuntu | 20.04 LTS | ์๋น์ค ์ ๊ณต์ ์ํด ๋ฆฌ๋์ค ์๋ฒ ๊ตฌ์ถ |
| Docker | latest | ์ปจํ์ด๋ํ ๋ ์ ํ๋ฆฌ์ผ์ด์ ๊ด๋ฆฌ |
| Jenkins | latest | ์๋ํ ๋ฐฐํฌ ๋ฐ ๋น๋ |
| Nginx | latest | Vue ํด๋ผ์ด์ธํธ ์น ์๋ฒ ์ฌ์ฉ |
| GoogleApi | 1.30.10 | ๊ตฌ๊ธ ๋ก๊ทธ์ธ ์ฌ์ฉ |
| FirebaseAdmin | 6.8.1 | FirebaseCloudMessaging ์ฌ์ฉ |
| MapStruct | 1.4.2 | Mapper ํ์ฉ |
| AWS | 2.3.1 | AWS S3 |
| Jasypt | 3.0.4 | ํ๋กํผํฐ ์ํธํ |

### AI ๊ตฌ์ฑ ์์

| ๊ธฐ์  ์คํ | Version | Comment |
| --- | --- | --- |
| Tensorflow | 2.8.0 | AI ๋ชจ๋ธ ํ์ต |
| Tensorflow-lite | 2.9.0 | ์๋๋ก์ด๋ ๊ฐ์ฒด ํ์ง |
| CudaToolkit | 11.3.1 | ํ์ต ์ GPU ์ฌ์ฉ |
| CuDNN | 8.4.1.50 | ํ์ต ์ GPU ์ฌ์ฉ |
| EfficientDet | 1 | ๊ฐ์ฒด ํ์ง ๋ชจ๋ธ |
| ML Kit | 18.5 | ํ์คํธ ์ธ์ ๋ผ์ด๋ธ๋ฌ๋ฆฌ |

