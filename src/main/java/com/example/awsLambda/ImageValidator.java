package com.example.awsLambda;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class ImageValidator extends SpringBootRequestHandler<ImageInput, ImageOutput> {

}

/*
 *  SpringBootRequestHandler,
 *  SpringBootStreamHandler,
 *  FunctionInvokingS3EventHandler,
 */