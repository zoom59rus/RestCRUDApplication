package com.nazarov.javadeveloper.module24;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.io.File;

public class ApplicationRunner {

    public static void main(String[] args) throws InterruptedException {
        S3Client s3Client = S3Client.builder().region(Region.EU_WEST_3).build();
        PutObjectRequest putObjectAclRequest = PutObjectRequest.builder()
                .bucket("module24")
                .key("GA.txt")
                .build();
        RequestBody requestBody = RequestBody.fromFile(new File("/Users/anton/Desktop/GA.txt"));
        s3Client.putObject(putObjectAclRequest, requestBody);
    }
}
