package co.gov.coran.licencias.utils;


import co.gov.coran.licencias.controller.UnidadRed;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileInputStream;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UtilFilesRed {

    public static String rootDir = "docunet/";
    public static String separator = "/";

    public static byte[] testFileGMD(String fichero) throws Exception {
        SmbFile archivo = null;

        UnidadRed ur = new UnidadRed();
        archivo = new SmbFile(ur.apuntarPath("AUTOGESTOR_") + rootDir + fichero,ur.autenticar());

        try
        {

            if(!archivo.isDirectory()){
                ByteArrayOutputStream fos = new ByteArrayOutputStream();

                SmbFileInputStream fis = null;
                try
                {
                    fis = new SmbFileInputStream(archivo);
                    byte[] buf = new byte[1024];

                    int i = 0;
                    while ((i=fis.read(buf)) != -1)
                    {
                        fos.write(buf, 0, i);
                    }
                }
                catch (Exception e) {}
                finally
                {
                    try
                    {
                        fis.close();
                        fos.close();
                    }
                    catch (Exception e) {};
                }
                return fos.toByteArray();
            }else{
                for(String name: archivo.list()){
                    System.out.println(name);

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> listFiles(String directory) throws Exception {
        SmbFile archivo = null;

        directory = directory.isEmpty()?"":directory+"/";
        String path = rootDir + directory;

        UnidadRed ur = new UnidadRed();
        String str2= ".849C9593-D756-4E56-8D6E-42412F2A707B";
        archivo = new SmbFile(ur.apuntarPath("AUTOGESTOR_") +path,ur.autenticar());

        List<String> files = new ArrayList<String>();
        System.out.println(files);
        System.out.println(directory);
        try
        {
            if(archivo.isDirectory() ){
                for(String name: archivo.list() ){
                    if(!name.equals(str2) ){
                        //TODO: validar extension .zip

                        files.add(name);
                    }

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return files;
    }

    public static void createDir(String paths, String name) throws Exception {
        String[] pathsD = paths.split("/");
        int level = paths.length()>0?1:0;
        if(!paths.isEmpty()){
            paths = paths + "/";
        }
        if(pathsD.length>1){
            //Zenufana/asdfasdf
            // 2
            level = pathsD.length;
        }
        if(level == 0 || level == 1 || level == 3){//paths.length == 0 || paths.length == 3
            //Crear directorio nuevo
            //path = path+name
            paths = paths + name + "/";
            createDir(paths);
            switch (level){
                //Zenufana/ZF1-2001-3/1.%20Evaluaci%C3%B3n/130ZF-COE2106-2349/Cartograf%C3%ADa
                case 1:
                    //Dentro de Directorio Path

                    //Crear dir 1.Evaluacion
                    createDir(paths + "1.Evaluacion/");
                    //Crear dir 2.Control y seguimiento
                    createDir(paths + "2.Contro y Seguimiento/");
                    break;
                case 3:
                    //Dentro de Directorio Path
                    //Crear dir Cartografia
                    createDir(paths + "Cartografia/");
                    break;
            }
        }else{
         //Lanzar excepcion - opcional
            throw new Exception("No puede crear directorio aqui");
        }
    }

    private static void createDir(String path) throws Exception {
        SmbFile archivo = null;

        UnidadRed ur = new UnidadRed();
        archivo = new SmbFile(ur.apuntarPath("AUTOGESTOR_") + rootDir+ path,ur.autenticar());
        //AN/NuevoDir
        if(!archivo.exists()){
            archivo.mkdir();
        }else{
            throw new Exception("Directorio ya existe");
        }
    }

    public static void createFile(String path, MultipartFile multipartFile) throws Exception {
        createFile(path,multipartFile,"");
    }
    public static void createFile(String path, MultipartFile multipartFile, String post) throws Exception {
        String[] arrayName = multipartFile.getOriginalFilename().split("\\.");
        String ext = "."+arrayName[arrayName.length-1];
        String name = multipartFile.getOriginalFilename().replaceAll(ext,"");

        UnidadRed ur = new UnidadRed();

        String fullPath = rootDir+ path + separator +name + post + ext;

        SmbFile archivo = null;
        archivo = new SmbFile(ur.apuntarPath("AUTOGESTOR_") + fullPath,ur.autenticar());


        //Preguntar si existe
        if(archivo.exists()){
            //Si existe, debe cambiar nombre
            //miimage-12312312313.jpg

            createFile(path, multipartFile, Util.dateToString("yyyyMMddHHmmss"));
        }else{
            ur.copiarBytesAUnidad(multipartFile.getBytes(), archivo);
        }
    }



}
