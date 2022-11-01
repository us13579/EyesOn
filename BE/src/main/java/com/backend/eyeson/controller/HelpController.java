package com.backend.eyeson.controller;

import com.backend.eyeson.service.HelpService;
import com.backend.eyeson.util.ResponseFrame;
import com.backend.eyeson.util.SecurityUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Api("HelpController")
@RestController
@RequestMapping("/help")
@RequiredArgsConstructor
public class HelpController {


    private final HelpService helpService;

    /**
     * 도움 요청
     *
     * @param gender
     * @return Object
     */

    @ApiOperation(value = "도움 요청", response = Object.class)
    @PostMapping("/{gender}")
    public ResponseFrame<?> requestHelp(@PathVariable("gender") char gender) throws IOException {

        // userSeq 가져오기
        boolean check = helpService.requestHelp(gender);
        if(check) {
            return ResponseFrame.of(HttpStatus.OK, "도움 요청 성공");
        }else{
            return ResponseFrame.of(HttpStatus.BAD_REQUEST, "엔젤이 없어서 도움 요청 실패");
        }
    }

    /**
     * 도움 응답
     *
     * @param
     * @return Object
     */

    @ApiOperation(value = "도와 주기", response = Object.class)
    @GetMapping("")
    public ResponseFrame<?> responseHelp(){

        // userSeq 가져오기
        long userSeq = SecurityUtil.getCurrentMemberSeq();
        if(userSeq > 0){
            return ResponseFrame.of(userSeq, "도움 응답 성공");
        }else {
            return ResponseFrame.of(HttpStatus.BAD_REQUEST, "없는 엔젤입니다. 도움 응답 실패");
        }
    }

    /**
     * 도움 종료
     *
     * @param
     * @return Object
     */

    @ApiOperation(value = "도움 종료", response = Object.class)
    @PutMapping("/finish")
    public ResponseFrame<?> finishHelp(){

        // userSeq 가져오기
        long userSeq = SecurityUtil.getCurrentMemberSeq();
        boolean check = helpService.finishHelp(userSeq);

        if(!check){
            return ResponseFrame.of(HttpStatus.BAD_REQUEST, "도움 종료 성공");
        }else {
            return ResponseFrame.of(HttpStatus.OK, "도움 종료 성공");
        }
    }
}
