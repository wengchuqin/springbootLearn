package top.chuqin.learn.springboot.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String upload(MultipartFile file) {

        try {
            File dest = File.createTempFile(UUID.randomUUID().toString(), file.getOriginalFilename());
            FileUtils.writeByteArrayToFile(dest, file.getBytes());
            System.out.println("上传文件保存的路径：" + dest.getAbsolutePath());
            return "上传完成";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }

    }

}
