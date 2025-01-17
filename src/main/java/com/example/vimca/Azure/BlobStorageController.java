//package com.example.vimca.Azure;
//
//import java.io.ByteArrayOutputStream;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin
//@RestController
//public class BlobStorageController {
//
//    @Autowired
//    private AzureBlobClient azureBlobClient;
//
//    @GetMapping(value = "/download/{filename}")
//    public ResponseEntity<byte[]> downloadFile(@PathVariable String filename) {
//        ByteArrayOutputStream downloadInputStream = azureBlobClient.downloadFile(filename);
//
//        return ResponseEntity.ok()
//                .contentType(contentType(filename))
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
//                .body(downloadInputStream.toByteArray());
//    }
//
//    private MediaType contentType(String filename) {
//        String[] fileArrSplit = filename.split("\\.");
//        String fileExtension = fileArrSplit[fileArrSplit.length - 1];
//        switch (fileExtension.toLowerCase()) {
//            case "txt":
//                return MediaType.TEXT_PLAIN;
//            case "png":
//                return MediaType.IMAGE_PNG;
//            case "jpg":
//            case "jpeg":
//                return MediaType.IMAGE_JPEG;
//            default:
//                return MediaType.APPLICATION_OCTET_STREAM;
//        }
//    }
//}
