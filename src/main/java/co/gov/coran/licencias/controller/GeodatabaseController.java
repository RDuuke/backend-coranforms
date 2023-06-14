package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.utils.UtilFilesRed;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.time.format.DateTimeParseException;
import java.util.List;

@RestController

public class GeodatabaseController {


    @GetMapping("/")
    public List<String> listDatabases() throws Exception {
        String dir  = "docunet/";
        return UtilFilesRed.listFiles(dir);
    }
    @GetMapping("/folder")
    public List<String> listFolder(@RequestParam String dir) throws Exception {
        return UtilFilesRed.listFiles(dir);
    }

    @GetMapping("/download/")
    public void getDatabase(HttpServletResponse response, @RequestParam String file) throws Exception {
        String origin = response.getHeader("Origin");

        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "OPTIONS,POST, GET");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
        String mimeType = "application/zip";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", file));
        response.setHeader("Access-Control-Expose-Headers","Content-Disposition");
        byte [] inStream = UtilFilesRed.testFileGMD(file);;
        response.setContentLength(inStream.length);

        FileCopyUtils.copy(inStream, response.getOutputStream());
    }




    public String fileName(String path){
        String name = "";
        String dirs[] = path.split("/");
        String sep = "__";
        name = dirs[0]+sep+dirs[1]+sep+"E"+sep+dirs[3]+sep+dirs[5];
        return name;
    }



}
